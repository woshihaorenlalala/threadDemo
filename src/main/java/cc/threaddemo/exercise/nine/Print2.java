package cc.threaddemo.exercise.nine;

/**
 * Created by cc on 2018/9/4.
 */
public class Print1 implements Runnable {

    private Flag flag;

    public Print1(Flag flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while(flag.num < 100){
            synchronized (flag){
                while(flag.flag){
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ":" + flag.num);
                flag.flag = false;
                flag.num++;
                flag.notify();
            }
        }
    }
}

package cc.threaddemo.thread.join;

/**
 * Created by cc on 2018/8/29.
 */
public class MyThreadJoin extends Thread{
    private String name;

    public MyThreadJoin(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + "线程开始");
        for(int i = 0; i < 5; i++){
            System.out.println("子线程" + name + "开始,运行:" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 线程运行结束");
    }
}

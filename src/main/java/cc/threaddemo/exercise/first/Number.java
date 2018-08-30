package cc.threaddemo.exercise.first;

/**
 * Created by cc on 2018/8/30.
 */
public class Number implements Runnable{
    private Object object;

    public Number(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized(object){
            for (int i = 1; i <= 52; i++){
                if(i % 2 == 1){
                    System.out.print(" ");
                }
                System.out.print(i);
                if(i % 2 == 0){
                    object.notify();
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

package cc.threaddemo.exercise.first;

/**
 * Created by cc on 2018/8/30.
 */
public class Char implements Runnable{
    private Object object;

    public Char(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized(object){
            for(char i = 'A'; i <= 'Z'; i++){
                System.out.print(i);
                if(i < 'Z'){
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

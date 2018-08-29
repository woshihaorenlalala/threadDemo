package cc.threaddemo.thread.wait;

/**
 * Created by cc on 2018/8/29.
 */
public class MyThreadWait implements Runnable{
    private String name;
    private Object prev;
    private Object self;

    public MyThreadWait(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run(){
        int count = 10;
        while(count > 0){
            synchronized (prev){
                synchronized (self){
                    System.out.println(name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package cc.threaddemo.thread.yield;

/**
 * Created by cc on 2018/8/29.
 */
public class MyThreadYield extends Thread{
    private String name;

    public MyThreadYield(String name) {
        this.name = name;
    }

    public void run(){
        for(int i = 0; i < 20; i++){
            System.out.println("" + name + "------" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i == 10){
//                Thread.yield();
                this.yield();
            }
        }
    }
}

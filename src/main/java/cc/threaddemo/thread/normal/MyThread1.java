package cc.threaddemo.thread.normal;

/**
 * Created by cc on 2018/8/29.
 */
public class MyThread1 extends Thread {
    private String name;

    public MyThread1(String name) {
        this.name = name;
    }

    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(name + "运行:" + i);
            try {
                //休息0.1秒
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

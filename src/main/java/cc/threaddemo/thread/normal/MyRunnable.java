package cc.threaddemo.thread.normal;

/**
 * Created by cc on 2018/8/29.
 */
public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(name + "运行:" + i);
            try {
                //休息0.1秒
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package cc.threaddemo.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cc on 2018/8/30.
 */
public class MyLock implements Runnable{

    private Lock lock = new ReentrantLock();
    private String name;

    public MyLock(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println("-----" + name + "开始运行-----");
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            System.out.println("-----" + name + "运行结束-----");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}

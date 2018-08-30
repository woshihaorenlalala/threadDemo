package cc.threaddemo;

import cc.threaddemo.lock.MyLock;

/**
 * Created by cc on 2018/8/30.
 */
public class LockMain {

    public static void main(String[] args) {
        MyLock myLock1 = new MyLock("A");
        MyLock myLock2 = new MyLock("B");
        new Thread(new Runnable() {
            @Override
            public void run() {
                myLock1.run();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                myLock2.run();
            }
        }).start();
    }
}

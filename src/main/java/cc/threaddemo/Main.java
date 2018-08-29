package cc.threaddemo;

import cc.threaddemo.thread.join.MyThreadJoin;
import cc.threaddemo.thread.normal.MyRunnable;
import cc.threaddemo.thread.transvalue.MyThreadValue;
import cc.threaddemo.thread.transvalue.Work;
import cc.threaddemo.thread.wait.MyThreadWait;
import cc.threaddemo.thread.yield.MyThreadYield;
import javafx.scene.layout.Priority;

/**
 * Created by cc on 2018/8/29.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*MyThread1 myThread1 = new MyThread1("A");
        MyThread1 myThread2 = new MyThread1("B");
        MyThread1 myThread3 = myThread1;
        myThread1.start();
        myThread2.start();
        myThread3.start();*/

      /*  new Thread(new MyRunnable("C")).start();
        new Thread(new MyRunnable("D")).start();*/

        /*System.out.println("主线程运行开始");
        MyThreadJoin myThreadJoin1 = new MyThreadJoin("C");
        MyThreadJoin myThreadJoin2 = new MyThreadJoin("D");
        myThreadJoin1.start();
        myThreadJoin2.start();
        //join后，主线程会再子线程执行完毕之后结束,join前主线程会再子线程没有完成之前完成
        try {
            myThreadJoin1.join();
            myThreadJoin2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程运行结束");*/

        /*MyThreadYield mty1 = new MyThreadYield("E");
        MyThreadYield mty2 = new MyThreadYield("F");
        //yield()高优先级不会给低优先级的线程绕行
        //  mty2.setPriority(Thread.MIN_PRIORITY);
        mty1.start();
        mty2.start();*/

        /*Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        MyThreadWait mtw1 = new MyThreadWait("A", c, a);
        MyThreadWait mtw2 = new MyThreadWait("B", a, b);
        MyThreadWait mtw3 = new MyThreadWait("C", b, c);
        System.out.println("主线程开始");
        new Thread(mtw1).start();
        Thread.sleep(100);
        new Thread(mtw2).start();
        Thread.sleep(100);
        new Thread(mtw3).start();
        Thread.sleep(100);
        System.out.println("主线程结束");*/

        MyThreadValue mtv = new MyThreadValue(new Work());
        new Thread(mtv).start();

    }
}

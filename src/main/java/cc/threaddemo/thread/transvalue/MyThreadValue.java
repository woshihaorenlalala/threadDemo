package cc.threaddemo.thread.transvalue;

import java.util.Random;

/**
 * 动态传入三个值
 * Created by cc on 2018/8/29.
 */
public class MyThreadValue implements Runnable {

    private Work work;

    public MyThreadValue(Work work) {
        this.work = work;
    }

    @Override
    public void run() {
        Random random = new Random();
        Data data = new Data();
        int n1 = random.nextInt(1000);
        int n2 = random.nextInt(2000);
        int n3 = random.nextInt(3000);
        Integer[] intArr = new Integer[]{n1, n2, n3};
        work.proceed(data, intArr);

        System.out.println(String.valueOf(n1) + "+" + String.valueOf(n2) + "+"
                + String.valueOf(n3) + "=" + data.data);
    }
}

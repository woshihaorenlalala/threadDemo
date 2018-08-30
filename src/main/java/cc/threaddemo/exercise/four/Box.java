package cc.threaddemo.exercise.four;

import java.util.Random;

/**
 * Created by cc on 2018/8/30.
 */
public class Box implements Runnable{
    private final int[] arr = new int[]{10,5,20,50,100,200,500,800,2,80,300};

    int num = arr.length;
    boolean[] flag = new boolean[arr.length];

    @Override
    public void run() {
        while(num > 0){
            synchronized (this){
                Random random = new Random();
                int index = random.nextInt(11);
                if(flag[index] != true){
                    flag[index] = true;
                    System.out.println(Thread.currentThread().getName() + "又产生了一个" + arr[index] + "元的大奖！");
                    num--;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package cc.threaddemo.exercise.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by cc on 2018/8/30.
 */
public class Stuff implements Runnable{

    private int front = 0;
    private int back = 0;
    private int count = 1;

    String []pool = {
            "01","02","03","04","05","06","07","08",
            "09","10","11","12","13","14","15","16",
            "17","18","19","20","21","22","23","24",
            "25","26","27","28","29","30","31","32","33"
    };

    @Override
    public void run() {
        while(count < 100){
            synchronized (this){
                String name = Thread.currentThread().getName();
                //随机生成彩票信息
                String[] benfit = new String[7];
                boolean[] flag = new boolean[pool.length];
                int i = 0;
                Random random = new Random();
                while(i < 6){
                    int index = random.nextInt(33);
                    if(flag[index] != true){
                        benfit[i] = pool[index];
                        flag[index] = true;
                        i++;
                    }
                }
                int blue = random.nextInt(16);
                benfit[6] = pool[blue];
                if(name.contains("前门")){
                    front++;
                    count++;
                    System.out.println("编号为" + (count - 1) + "的员工从前门入场！拿到的双色球号码为" + Arrays.toString(benfit));
                }else {
                    back++;
                    count++;
                    System.out.println("编号为" + (count - 1) + "的员工从后门入场！拿到的双色球号码为" + Arrays.toString(benfit));
                }
                if(count > 100){
                    System.out.println("从后门入场的员工总共: " + back + " 位员工");
                    System.out.println("从前门入场的员工总共: " + front + " 位员工");
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

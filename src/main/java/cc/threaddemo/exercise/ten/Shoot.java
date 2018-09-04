package cc.threaddemo.exercise.ten;

/**
 * Created by cc on 2018/9/4.
 */
public class Load implements Runnable {

    private Bullet bullet;

    public Load(Bullet bullet) {
        this.bullet = bullet;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bullet){
                while(bullet.flag){
                    try {
                        bullet.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("装一颗子弹!");
                bullet.flag = true;
                bullet.notify();
            }
        }
    }
}

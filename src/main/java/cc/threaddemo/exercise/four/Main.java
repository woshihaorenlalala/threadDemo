package cc.threaddemo.exercise.four;

/**
 * Created by cc on 2018/8/30.
         */
public class Main {

    public static void main(String[] args) {
        Box box = new Box();

        new Thread(box, "奖池1").start();
        new Thread(box, "奖池2").start();
    }
}

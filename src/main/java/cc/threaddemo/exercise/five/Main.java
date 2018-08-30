package cc.threaddemo.exercise.five;

/**
 * Created by cc on 2018/8/30.
 */
public class Main {
    public static void main(String[] args) {
        Stuff stuff = new Stuff();
        new Thread(stuff,"前门").start();
        new Thread(stuff, "后门").start();
    }
}

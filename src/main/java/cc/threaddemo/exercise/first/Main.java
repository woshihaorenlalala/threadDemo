package cc.threaddemo.exercise.first;

/**
 * Created by cc on 2018/8/30.
 */
public class Main {
    public static void main(String[] args) {
        //空Byte(3)比new 一个Object(7)少四行代码
        Byte[] b = new Byte[0];
        Char c = new Char(b);
        Number n = new Number(b);
        new Thread(n).start();
        new Thread(c).start();
    }
}

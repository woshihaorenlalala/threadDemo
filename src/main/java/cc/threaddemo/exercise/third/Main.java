package cc.threaddemo.exercise.third;

/**
 * Created by cc on 2018/8/30.
 */
public class Main {

    public static void main(String[] args) {
        Ticket ticket = new Ticket(new Byte[0], 20);
        for(int i = 0; i < 3; i++){
            new Thread(ticket, "ticket" + i).start();
        }
    }
}

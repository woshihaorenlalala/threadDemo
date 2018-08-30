package cc.threaddemo.exercise.third;

/**
 * Created by cc on 2018/8/30.
 */
public class Ticket implements Runnable{

    private Object object;

    private int ticket;

    public Ticket(Object object, int ticket) {
        this.object = object;
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while(ticket > 0){
            synchronized (object){
                if(ticket <= 0){
                    System.out.println("没有票了！");
                }else{
                    System.out.println(Thread.currentThread().getName() + "卖了一张票");
                    ticket--;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

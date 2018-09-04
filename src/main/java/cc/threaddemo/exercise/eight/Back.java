package cc.threaddemo.exercise.eight;

/**
 * Created by cc on 2018/9/4.
 */
public class Sale implements Runnable {

    private Ticket ticket;

    public Sale(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        ticket.lock.lock();
        try {
            Thread.sleep(1000);
            while(ticket.ticket <= 0 || ticket.ticket >= 10){
                ticket.saleCondition.await();

            }
            ticket.ticket--;
            System.out.println("卖出了一张票，还剩" + ticket.ticket);
            //每卖出一张票就可以退票
            ticket.backCondition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            ticket.lock.unlock();
        }
    }
}

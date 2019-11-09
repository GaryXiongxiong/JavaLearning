package ThreadSafety;

/**
 * JavaLab
 * TicketSaling
 *
 * @author Yixiong J
 * @version 2019/11/5 14:51
 */
public class TicketSelling  implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while(ticket>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->selling "+ticket+ "th");
            ticket--;
        }
    }
}

package ThreadSafety;

/**
 * JavaLab
 * TestTicket
 *
 * @author Yixiong J
 * @version 2019/11/5 14:56
 */
public class TestTicket {
    public static void main(String[] args) {
        TicketSelling ts = new TicketSelling();
        Thread th0 = new Thread(ts);
        Thread th1 = new Thread(ts);
        Thread th2 = new Thread(ts);
        th0.start();
        th1.start();
        th2.start();
    }
}

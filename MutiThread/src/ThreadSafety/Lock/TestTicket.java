package ThreadSafety.Lock;

import java.util.Scanner;

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
        while(true){
            int i = new Scanner(System.in).nextInt();
            ts.addTicket(i);
        }
    }
}

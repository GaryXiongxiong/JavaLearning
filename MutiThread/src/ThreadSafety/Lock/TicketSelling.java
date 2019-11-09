package ThreadSafety.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * JavaLab
 * TicketSaling
 *
 * @author Yixiong J
 * @version 2019/11/5 14:51
 */
public class TicketSelling implements Runnable{
    /**
     * ReentrantLock 实现了Lock接口，其中lock方法获取锁，unlock方法释放锁
     */
    private Lock lock = new ReentrantLock();
    private int ticket = 100;
    public void addTicket(int i){
        ticket+=i;
    }
    @Override
    public void run() {
        while(true){
            lock.lock();
            if(ticket>0){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"-->selling "+ticket+ "th");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }

        }
    }
}

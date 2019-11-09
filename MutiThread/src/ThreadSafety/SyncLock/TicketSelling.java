package ThreadSafety.SyncLock;

/**
 * JavaLab
 * TicketSaling
 *
 * @author Yixiong J
 * @version 2019/11/5 14:51
 */
public class TicketSelling implements Runnable{
    private int ticket = 100;
    /**创建对象作为同步锁，或者对象锁，或者对象监视器
     * 运行到同步代码块时，会检查同步代码块是否有锁对象，
     * 如果有，获取（带走）锁对象，并进入同步代码块中执行，执行结束后归还
     * 如果没有（被拿走了），则进入阻塞状态，一直等待其他线程归还锁对象
     * 问题：程序频繁的获取、判断、释放锁，降低效率
     */
    private final Object obj = new Object();
    public void addTicket(int i){
        ticket+=i;
    }
    @Override
    public void run() {
        while(true){

            synchronized (obj){
                if(ticket>0){
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
    }
}

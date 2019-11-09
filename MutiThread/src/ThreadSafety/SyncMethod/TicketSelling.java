package ThreadSafety.SyncMethod;

/**
 * JavaLab
 * TicketSaling
 *
 * @author Yixiong J
 * @version 2019/11/5 14:51
 */
public class TicketSelling implements Runnable{
    private int ticket = 100;
    static int ticketSta = 100;
    public void addTicket(int i){
        ticket+=i;
    }
    @Override
    public void run() {
        while(true){
            sell();
        }
    }
    /**
     * 创建同步方法，把需要共享数据的内容放进方法内
     * 同步方法同时仅允许一个线程来调用，
     * 同步方法的锁对象就是实现类对象：new TicketSelling()
     * 也就是this
     * synchronized method(){
     *     ...
     * }
     * 等效于
     * method(){
     *     synchronized(this){
     *        ...
     *     }
     * }
     */
    public synchronized void sell(){
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

    /**
     * 静态同步方法，也是线程安全的。
     * 锁对象不是this，因为静态方法在类中，其锁对象为本类的class属性-->class文件对象
     */
    public static synchronized void sellSta(){
        if(ticketSta>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->selling "+ticketSta+ "th");
            ticketSta--;
        }
    }
}

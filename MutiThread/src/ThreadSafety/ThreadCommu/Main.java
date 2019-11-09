package ThreadSafety.ThreadCommu;

/**
 * JavaLab
 * Main
 *
 * @author Yixiong J
 * @version 2019/11/7 17:11
 */
public class Main {
    public static void main(String[] args) {
        Foods foods = new Foods();
        Cooker cooker = new Cooker(foods);
        Consumer consumer1 = new Consumer(foods,"Tom");
        Consumer consumer2 = new Consumer(foods,"Jerry");
        Thread cookerThread = new Thread(cooker);
        Thread consumerThread1 = new Thread(consumer1);
        Thread consumerThread2 = new Thread(consumer2);
        cookerThread.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}

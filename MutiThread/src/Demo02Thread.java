/**
 * JavaLab
 * Demo02Thread
 *
 * @author Yixiong J
 * @version 2019/10/31 17:12
 */
public class Demo02Thread {
    public static void main(String[] args) {
        MyThread02 th1 = new MyThread02("th1");
        MyThread02 th2 = new MyThread02();
        th2.setName("th2");
        th1.start();
        th2.start();
        Thread t = Thread.currentThread();
        t.setName("Main");
        System.out.println("Main-->"+t);
    }
}

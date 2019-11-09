package ThreadCreate;

/**
 * JavaLab
 * DemoRunable
 *
 * @author Yixiong J
 * @version 2019/10/31 22:53
 */
public class DemoRunnable {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread th = new Thread(runnable);
        th.start();
        for(int i=0;i<10;i++){
            System.out.println("main-->"+i);
        }
    }
}

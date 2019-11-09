package ThreadCreate;

/**
 * JavaLab
 * MyRunable
 *
 * @author Yixiong J
 * @version 2019/10/31 22:53
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i =0;i<10;i++){
            System.out.println("Runnable-->"+i);
        }
    }
}

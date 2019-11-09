package ThreadPool;

/**
 * JavaLab
 * RunableTask1
 *
 * @author Yixiong J
 * @version 2019/11/9 23:08
 */
public class RunnableTask1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->Running");
    }
}

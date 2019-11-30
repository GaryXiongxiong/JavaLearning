/**
 * JavaLearning
 * RunnableInObjectStyle
 *
 * @author Yixiong J
 * @version 2019/11/9 23:50
 */
public class RunnableInObjectStyle {
    public static void main(String[] args) {
        RunnableTask1 task1 = new RunnableTask1();
        Thread thread = new Thread(task1);
        thread.start();
//      简化代码 via Inner class
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->Running");
            }
        };
        new Thread(task2).start();
//      简化代码-via Anonymous Inner class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->Running");
            }
        }).start();
//      依旧很多冗余代码，只有run方法体中的代码才是重点，为了指定他我们不得不实现runnable接口重写run方法
//      我们的实际目的是将方法体传给Thread类以创建对象
    }
}

/**
 * JavaLearning
 * RunnableInLambdaStyle
 *
 * @author Yixiong J
 * @version 2019/11/10 0:03
 */
public class RunnableInLambdaStyle {
    public static void main(String[] args) {
//      Anonymous Inner Class
//
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->Running");
            }
        }).start();
//      Lambda expression
//      (Type Param)->{ Body }
        new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "-->Running");
            }
        ).start();
//      继续省略
        new Thread(()->System.out.println(Thread.currentThread().getName() + "-->Running")).start();
    }
}

package ThreadCreate;

/**
 * JavaLab
 * AnonymousInnerClassCreatesThread
 *
 * @author Yixiong J
 * @version 2019/10/31 23:11
 */
public class AnonymousInnerClassCreatesThread {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0;i<10;i++){
                    System.out.println("th-->"+i);
                }
            }
        });
        th.start();
//      继承Thread的匿名类
        new Thread(){
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("th2-->"+i);
                }
            }
        }.start();
        for(int i=0;i<10;i++){
            System.out.println("main-->"+i);
        }
    }
}

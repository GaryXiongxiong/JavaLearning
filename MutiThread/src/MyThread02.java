/**
 * JavaLab
 * MyThread02
 *
 * @author Yixiong J
 * @date 2019/10/31 17:12
 */
public class MyThread02 extends Thread {
    public MyThread02(){
        super();
    }
    public MyThread02(String name){
        super(name);
    }
    @Override
    public void run() {
        String name = getName();
        Thread thread = Thread.currentThread();
        System.out.println("Thread:-->"+thread);
    }
}

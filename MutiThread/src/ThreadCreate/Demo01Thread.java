package ThreadCreate;

/**
 * JavaLab
 * ThreadCreate.Demo01Thread
 *
 * @author Yixiong J
 * @date 2019/10/31 15:01
 */
public class Demo01Thread {
    public static void main(String[] args) {
        MyThread01 th1 = new MyThread01();
        th1.start();
        for(int i =0;i<20;i++){
            System.out.println("main+"+i);
        }
    }
}

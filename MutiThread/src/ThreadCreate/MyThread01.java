package ThreadCreate;

/**
 * JavaLab
 * ThreadCreate.MyThread01
 *
 * @author Yixiong J
 * @date 2019/10/31 15:01
 */
public class MyThread01 extends Thread {
    @Override
    public void run(){
        for(int i =0;i<20;i++){
            System.out.println("run+"+i);
        }
    }

}

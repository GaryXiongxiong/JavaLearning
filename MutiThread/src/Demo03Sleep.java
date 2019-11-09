/**
 * JavaLab
 * Demo03Sleep
 *
 * @author Yixiong J
 * @version 2019/10/31 18:22
 */
public class Demo03Sleep {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

package ThreadSafety.ThreadCommu;

/**
 * JavaLab
 * consumer
 *
 * @author Yixiong J
 * @version 2019/11/7 17:07
 */
public class Consumer implements Runnable {
    private final Foods foods;
    private String name;

    public Consumer(Foods foods, String name) {
        this.foods = foods;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (foods) {
                if (foods.isEmpty) {
                    try {
                        foods.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    foods.notify();
                } else {
                    System.out.println(name+" start to eat " + foods.type);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    foods.isEmpty = true;
                    System.out.println(name+" finished eating");
                    System.out.println("==========================");
                    foods.notify();
                }
            }
        }
    }
}

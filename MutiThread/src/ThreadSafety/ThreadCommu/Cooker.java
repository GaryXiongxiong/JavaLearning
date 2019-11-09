package ThreadSafety.ThreadCommu;

/**
 * JavaLab
 * Cooker
 *
 * @author Yixiong J
 * @version 2019/11/7 16:50
 */
public class Cooker implements Runnable {
    private final Foods foods;

    public Cooker(Foods foods) {
        this.foods = foods;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (foods) {
                if (foods.isEmpty) {
                    if (count % 2 == 0) {
                        foods.type = "Pizza";
                    } else {
                        foods.type = "Spaghetti";
                    }
                    System.out.println("Producing " + foods.type + " ...");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(foods.type + " produced");
                    System.out.println("==========================");
                    foods.isEmpty = false;
                    count++;
                    foods.notify();
                } else {
                    try {
                        foods.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

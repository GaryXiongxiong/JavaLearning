import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * JavaLab
 * Deserialize
 * try to deserialize an object
 *
 * @author Yixiong J
 * @date 2019/10/31 11:30
 */
public class Deserialize {
    public static void main(String[] args) {
        try{
            FileInputStream fileIn = new FileInputStream("earthquake.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object eq = objectIn.readObject();
            if(eq instanceof Earthquake){
                System.out.println(((Earthquake)eq).toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

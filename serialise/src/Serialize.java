import java.io.*;

/**
 * JavaLab
 * Serialize
 * try to serialize a object
 *
 * @author Yixiong J
 * @date 2019/10/31 11:22
 */
public class Serialize {
    public static void main(String[] args) {
        Earthquake eq = new Earthquake(5.5,27.1,22.3,2019);
        try {
            File outFile = new File("earthquake.ser");
            FileOutputStream fileOut = new FileOutputStream(outFile);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(eq);
            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

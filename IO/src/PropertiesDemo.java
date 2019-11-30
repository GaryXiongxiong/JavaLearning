import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * JavaLearning
 * PropertiesDemo
 *
 * @author Yixiong J
 * @version 2019/11/30 16:25
 */
public class PropertiesDemo {
    public static void storeProperties() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("name","Yixiong Jiang");
        prop.setProperty("age","25");
        prop.setProperty("gender","male");
        FileWriter fw = new FileWriter("data/Properties.txt");
        prop.store(fw,"information about author");
        fw.close();
    }

    public static void loadProperties() throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("data/Properties.txt");
        prop.load(fr);
        Set<String> names = prop.stringPropertyNames();
        for(String name : names){
            System.out.println(name+" = "+prop.getProperty(name));
        }
        fr.close();
    }

    public static void main(String[] args) throws IOException {
        storeProperties();
        loadProperties();
    }
}
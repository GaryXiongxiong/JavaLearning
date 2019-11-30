import java.io.*;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * JavaLearning
 * BufferedStreamDemo
 *
 * @author Yixiong J
 * @version 2019/11/30 16:36
 */
public class BufferedStreamDemo {
    public static void write() throws IOException {
//        buffered output stream
        FileOutputStream out = new FileOutputStream("data/bufferedOutputStream.txt");
        BufferedOutputStream bufferedOut = new BufferedOutputStream(out);
        bufferedOut.write("test1".getBytes());
        bufferedOut.write("test2".getBytes());
        bufferedOut.close();
        out.close();
//        buffered writer
        FileWriter writer = new FileWriter("data/bufferedWriter.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("test1\n");
        bufferedWriter.write("test2");
        bufferedWriter.newLine();
        bufferedWriter.write("test3");
        bufferedWriter.close();
        writer.close();
    }

    public static void read() throws IOException {
//        buffered input stream
        FileInputStream in = new FileInputStream("data/bufferedOutputStream.txt");
        BufferedInputStream bufferedIn = new BufferedInputStream(in);
        System.out.println(Arrays.toString(bufferedIn.readAllBytes()));
        bufferedIn.close();
        in.close();
//        buffered reader
        FileReader reader = new FileReader("data/bufferedWriter.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        Stream<String> lines = bufferedReader.lines();
        lines.forEach(System.out::println);
        bufferedReader.close();
        reader.close();
    }
    public static void main(String[] args) throws IOException {
        write();
        read();
    }
}

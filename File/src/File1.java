import java.io.File;

/**
 * JavaLearning
 * File1
 *
 * @author Yixiong J
 * @version 2019/11/10 14:37
 * Java把文件与目录封装为File类，可以使用File类进行操作
 */
public class File1 {
    public static void main(String[] args) {
        /* File中两个静态成员变量，记录当前系统的路径分隔符和明程分隔符，用以适应不同系统的不同情况 */
        System.out.println(File.separator);
        System.out.println(File.pathSeparator);
        /* Constructor via pathname, could use file or path as pathname. */
        File f1 = new File("earthquake.ser");
        /* Pathname could be divided to two part, parent could be String or File */
        File f2 = new File("src\\","earthquake.ser");

    }
}

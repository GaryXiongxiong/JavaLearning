import java.util.ArrayList;
import java.util.Iterator;

/**
 * JavaLab
 * Generic
 *
 * @author Yixiong J
 * @date 2019/10/31 14:23
 */
public class Generic {
    public static void main(String[] args) {
        ArrayList<String> listStr = new ArrayList<String>();
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        listStr.add("a");
        listStr.add("b");
        listInt.add(1);
        listInt.add(2);
        printList(listStr);
        printList(listInt);

    }
    private static void printList(ArrayList list){
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

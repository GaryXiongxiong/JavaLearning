package CollectionTest;

import java.util.*;

public class ListImplement{
    public static void main(String[] args) {
        List<String>arrayList = new ArrayList<>();//可变数组
        List<String>linkedList = new LinkedList<>();//链表
        arrayList.add("a");
        arrayList.add(1, "B");//在索引1的位置插入元素
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList.get(0));
        arrayList.set(0, "D");//修改索引位置为0的元素
        System.out.println(arrayList.get(0));

    }
}
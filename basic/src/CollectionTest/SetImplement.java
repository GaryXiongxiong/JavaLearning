package CollectionTest;

import java.util.*;

public class SetImplement{
    public static void main(String[] args) {
        //Set是我们常说的集合，集合中的元素没有顺序，不能有重复对象
        HashSet<String> hashset = new HashSet<>();
        hashset.add("a");
        hashset.add("b");
        hashset.add("c");
        hashset.add("a");
        System.out.println(hashset.hashCode());
        Iterator<?> it1 = hashset.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        //tree set中的元素可以排序，其中的元素对象必须实现Comparable接口
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(0);
        System.out.println(treeSet.hashCode());
        System.out.println(treeSet.first());//tree set中的第一个元素
        System.out.println(treeSet.last());//最后一个元素
        System.out.println(treeSet.headSet(1));//1之前的所有元素，不含1
        System.out.println(treeSet.tailSet(1));//1之后的所有元素，含1
        System.out.println(treeSet.higher(1));//比1靠后的一个元素
        System.out.println(treeSet.lower(1));//1之前的一个元素
        System.out.println(treeSet.subSet(1, 3));//1（含）到3（不含）之间的元素
    }
}
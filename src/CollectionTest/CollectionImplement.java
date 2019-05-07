package CollectionTest;

import java.util.*;

public class CollectionImplement{
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();//实例化一个集合，Collection是接口，所以实例化时需要用实现了该接口的类
        list.add("a");//添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.remove("a");//删除元素,仅删除符合的第一个？
        System.out.println(list.isEmpty());//判断集合是否为空
        System.out.println(list.size());//判断集合大小
        for(Iterator<?> it=list.iterator();it.hasNext();){//声明it为list的迭代器
            String str = (String)it.next();//若多次调用iterator()会生成多个迭代器
            System.out.println(str);
        }
    }
}
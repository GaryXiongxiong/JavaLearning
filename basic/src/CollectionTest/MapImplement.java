package CollectionTest;

import java.util.*;

public class MapImplement{
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("241X", "张三");//加入为put
        map.put("4512", "李四");
        map.put("1730", "王五");
        map.put("7821", "赵六");
        Iterator<String> mapKeyIt = map.keySet().iterator();
        while(mapKeyIt.hasNext()){
            String key = mapKeyIt.next();
            System.out.println(key+" "+map.get(key));//这时输出是无序的
        }

        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        Iterator<String> treeMapKeyIt = treeMap.keySet().iterator();
        while(treeMapKeyIt.hasNext()){
            String key = treeMapKeyIt.next();
            System.out.println(key+" "+treeMap.get(key));//这时输出是有序的，因为TreeMap为有序map
        }
    }
}
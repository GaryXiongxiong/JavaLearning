package StringObject;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hello World!");
        str1.append(" I'm Gary");//在末尾压入
        System.out.println(str1.toString());
        str1.insert(5, " the world");//在中间插入
        System.out.println(str1.toString());
        str1.delete(5, 15);//删除指定位置
        System.out.println(str1.toString());
    }
}
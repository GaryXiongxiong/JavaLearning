package StringObject;

public class CreatString{
    public static void main(String[] args) {
        String str1 = new String("Students");
        char a[] = {'S','t','u','d','e','n','t','s'};
        String str2 = new String(a);
        System.out.println(str1 == str2);//相同字符串，地址不同，所以不相等
        String str3 = "students";
        String str4 = "students";
        System.out.println(str3 == str4);//这样建立的相同的字符串，地址相同
        str3 = str3 + " are studying";
        System.out.println(str3 == str4);//修改后地址变化
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        int numOfStudents = 5;
        float hoursOfStudying = 10.50f;
        System.out.println(numOfStudents+" students are spending "+hoursOfStudying+" on studying");
        int size = str1.length();
        System.out.println(size);//字符串长度获取
        System.out.println(str1.indexOf("u"));
        System.out.println(str4.indexOf("s"));//首次出现字符串的索引位置
        System.out.println(str4.lastIndexOf("s"));//最后一次出现字符串""s"的索引位置
        System.out.println(str1.charAt(0));//索引位置的字符
        // System.out.println(str1[0]); 报错-string已经不是数组而是对象了
        System.out.println(str1.substring(1, 4));//截取字符串的0,1,2,3（不到4）
        System.out.println(" te  st   ".trim());//去除首尾的空格
        System.out.println(" te  st   ".trim().length());//去除空格后的长度
        System.out.println("I love java".replace("j", "J"));//替换字符串中的字符
        System.out.println("I love Java".replace("Java", "Python"));//替换字符串中的字符串
        System.out.println("I love Java and Java".replaceFirst("Java", "Python"));//替换字符串中的首个字符或字符串
        System.out.println("I am Gary".startsWith("I"));
        System.out.println("I am Gary".endsWith("Nick"));//判断字符串的首尾是否为指定参数
        System.out.println(str1.equals(str2));//判断字符串是否一致，为何不能用==见上面的字符串声明之后
        System.out.println(str4.equalsIgnoreCase(str1));//忽略大小写后判断字符串是否一致
        System.out.println("a".compareTo("b"));//根据unicode编码查看字符串的差
        System.out.println("一二".compareTo("一五"));
        System.out.println("abc".compareTo("abd"));//应为逐位比较，显示第一个不相同的字符的差值？
        System.out.println("abcABC".toUpperCase());
        System.out.println("ABCabc".toLowerCase());//大小写转换
        for(String str:"Gary,Jack,Nick,Brown".split(",")){//通过参数分割拆分字符串，
            System.out.println(str);
        }
        for(String str:"Gary,Jack,Nick,Brown".split(",",3)){//通过参数分割拆分字符串，拆分为最多第二参数个
            System.out.println(str);
        }
    }
}
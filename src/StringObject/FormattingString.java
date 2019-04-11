package StringObject;

public class FormattingString{
    public static void main(String[] args) {
        System.out.println(String.format("%b,%b,%b", false, 0, 'a'));//布尔类型，任何数字都是ture，不同于c
        // System.out.println(String.format("%d", 11.5)); 报错，将小数格式化为整数不行
        System.out.println(String.format("%c", 1551));//可以将unicode码格式化为字符
        System.out.println(String.format("%o", 909));//8进制
        System.out.println(String.format("%x", 909));//16进制
        System.out.println(String.format("%e", 165325.5));//科学计数法
        System.out.println(String.format("%2$-9s", "test1","test2"));//-为左对齐，9为最小宽度，序号+$可定义参数index
        System.out.println(String.format("%10.2f", 251.255));//最小宽度后.2对于f浮点数定义精度，精读外四舍五入
        System.out.println(String.format("%,10.2f", 2059592.253));//,标识符定义数字中加千位，
        System.out.printf("%,.2f",201562.253);//可直接格式化+输出

    }
}
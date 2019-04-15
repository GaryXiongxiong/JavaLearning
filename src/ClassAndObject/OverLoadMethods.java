package ClassAndObject;

public class OverLoadMethods {

    public static int add(int a, int b){//原函数
        return a + b;
    }
    public static int add(int a){//不同参数数重载
        return a + 10;
    }
    public static double add(double a,double b){//不同参数数据类型重载
        return a + b;
    }
    public static double add(double a){
        return a + 10;
    }
    public static int add(int ...a){//不定参数
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum = sum +a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
     System.out.println("add(1,2)="+add(1,2));
     System.out.println("add(1)="+add(1));
     System.out.println("add(1.5,2.5)="+add(1.5,2.5));
     System.out.println("add(1.5)="+add(1.5));
     System.out.println("add(1,2,3,4,5,6)="+add(1,2,3,4,5,6));

    }

}
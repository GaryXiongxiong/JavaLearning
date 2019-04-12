package PackagedClass;
public class PackagedClassTest{
    public static void main(String[] args) {
        Integer int1 = new Integer(15);//Integer类，构造函数参数为int时，创建integer对象，值为参数int
        System.out.println(int1);
        Integer int2 = new Integer("163");//构造函数参数为String，将String转化为int，创建对象
        System.out.println(int2);
        System.out.println(int2.byteValue());//类似方法包intValue(),shortValue(),返回指定类型的数值
        System.out.println(int2.compareTo(int1));//对比两个integer对象，如果比参数大返回正数，比参数小返回复数，相等返回0
        Integer int3 = 163;//简易构造方法，
        System.out.println(int2.equals(int3));//对比两个对象是否相同
        System.out.println(int3.toString());//返回integer对象对应的string对象
        System.out.println(Integer.toString(153));//返回参数对应的string对象,toString采用静态方法
        System.out.println(Integer.valueOf("153"));//返回integer对象
        System.out.println(Integer.parseInt("153"));//返回int类型数值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.TYPE);//类中的几个常量
        System.out.println(Character.getNumericValue('1'));
    }
}
//其余Boolean,Byte,Character,Double类似，他们都是Number抽象类的子类
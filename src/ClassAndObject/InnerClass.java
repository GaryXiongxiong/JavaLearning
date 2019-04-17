package ClassAndObject;

public class InnerClass {
    class Inner{
        public void innerMethod(){
            System.out.println("call inner method:"+this.toString());//提示调用内部类方法，输出所在的内部类
        }
    }
    Inner in = new Inner();//在外部类中实例化内部类
    public Inner creat(){
        return new Inner();//在外部类非静态方法中实例化内部类，并将其返回
    }
    public void outterMethod(){
        in.innerMethod();//外部类方法调用内部类方法
    }
    public static void main(String[] args) {
        InnerClass out = new InnerClass();//创建外部类
        out.outterMethod();//通过外部类对象方法调用内部类对象方法，输出调用的内部类对象的名称
        out.in.innerMethod();//直接调用外部类对象中的内部类对象，输出其名称，可以看到与上一行调用的是同一个内部类对象的方法
        InnerClass.Inner in = out.creat();//在外部类对象out调用creat()中创建一个内部类对象，命名为in
        in.innerMethod();//调用新创建的内部对象的方法
        InnerClass.Inner in2 =out.new Inner();//通过out.new在out中创建一个新的内部inner类对象
        in2.innerMethod();//调用新创建的内部对象的方法
        //内部类对象依赖于外部类对象，无法在不创建外部类对象的情况下创建内部类对象
    }
}

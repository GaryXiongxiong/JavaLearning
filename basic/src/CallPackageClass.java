import ClassAndObject.*;//导入ClassAndObject包中的Birds类
public class CallPackageClass{
    public static void main(String[] args) {
        Birds bird1 = new Birds("Tony");
        Birds bird2 = new Birds();
        bird2.setName("Nick");
        System.out.println(bird2.getName());
        // bird1.fly();
        // bird2.fly();无法调用，因为在类中定义fly为protected，只有同包的类可以调用。
        Birds bird3 = new Birds("Tony");
        // System.out.println(Birds.id); 报错，静态变量无法跨包调用?
        System.out.println(bird1 == bird3);
        System.out.println(bird1.equals(bird3));//待研究为何为False
        Goose goose1 = new Goose("Mike");//调用Birds的子类Goose，创建对象goose1
        Goose goose2 = new Goose();//可以看到调用了goose的构造方法，也调用了其父类的构造方法
        goose1.says();//调用子类的新方法says
        goose1.fly();
        System.out.println(goose1.getName());//父类方法直接继承
        Birds.run(new Goose("Jack"));//调用Birds类的静态方法，参数为Birds对象，以Birds的子类Goose对象向上转型为参数，实现多态
        Birds bird4 = new Goose("Jerry");//Goose jerry 向上转型为birds类，只能调用birds的方法
        System.out.println(bird4.getName());
        // bird4.says(); 报错，向上转型后已经没有says方法
    }
}
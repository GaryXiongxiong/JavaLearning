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
    }
}
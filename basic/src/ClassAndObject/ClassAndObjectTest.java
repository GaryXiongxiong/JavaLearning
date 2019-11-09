package ClassAndObject;

public class ClassAndObjectTest{
    public static void main(String[] args) {
        Birds bird1 = new Birds("Tony");
        Birds bird2 = new Birds();
        bird2.setName("Nick");
        System.out.println(bird2.getName());
        bird1.fly();
        bird2.fly();
        Birds bird3 = new Birds("Tony");
        System.out.println(Birds.id);//类名.变量 调用静态变量
        System.out.println(bird1.id);//也可调用，但不建议，容易混淆静态成员与非静态成员
        System.out.println(bird1 == bird3);
        System.out.println(bird1.equals(bird3));//待研究为何为False
        // 10th April update:equals方法需要在类中重载，确定equals定义。
    }
}
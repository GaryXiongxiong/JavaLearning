package ClassAndObject;

public class CallShapesObject {
    public static void main(String[] args) {
        // Shapes shape1 = new Shapes(); 报错，不可实例化
        Triangle tri1 = new Triangle();
        tri1.draw();
        System.out.println(tri1.getSides());//调用抽象类的非抽象方法
        Quadrangle qua1 = new Quadrangle();
        qua1.draw();//调用实现后的抽象方法
        qua1.getArea();//调用实现后的接口方法
        System.out.println(qua1.getSides());//调用抽象类中的非抽象方法
        area area1 = new Quadrangle();//类向上转型为area接口
        area1.getArea();//调用在Quadrangle中重载的getArea方法，实现接口方法时调用了Quadrangle中的其他方法，但对外不可见，如下一行
        // area1.getSides();报错，area1为Quadrangle向上转型的area接口，无法调用Quadrangle类中的方法
    }
}
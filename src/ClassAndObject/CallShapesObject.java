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
    }
}
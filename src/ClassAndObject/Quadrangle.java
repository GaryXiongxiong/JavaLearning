package ClassAndObject;

public class Quadrangle extends Shapes implements area {// 继承Shapes抽象类，调用area接口，其中的抽象方法与接口中的方法必须被实现，可以调用多个接口，之间用逗号隔开
    public Quadrangle(){
        setSides(4);//调用继承的非抽象方法
    }
    public void draw(){//实现继承的抽象类中的方法
        System.out.println("Draw a "+ getSides()+" sides quadrangle");
    }

    public void getArea(){
        System.out.println("四边形面积");
    }
}
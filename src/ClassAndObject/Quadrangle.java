package ClassAndObject;

public class Quadrangle extends Shapes implements area {// 继承Shapes抽象类，调用area接口，其中的抽象方法与接口中的方法必须被实现，可以调用多个接口，之间用逗号隔开
    public Quadrangle(){
        setSides(4);//调用继承的非抽象方法
    }
    @Override//作用：说明该方法为重写的方法，编译器会检测该方法是否在父类或接口中存在
    public void draw(){//实现继承的抽象类中的方法
        System.out.println("Draw a "+ getSides()+" sides quadrangle");
    }
    @Override
    public void getArea(){//实现接口中的getArea()方法
        System.out.println(getSides()+"条边的四边形面积");
    }
}
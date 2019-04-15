package ClassAndObject;

public class Triangle extends Shapes{//在未重写抽象类中所有抽象方法时会报错
    public Triangle(){
        setSides(3);//调用继承的非抽象方法
    }
    public void draw(){
        System.out.println("Draw a "+ getSides()+" sides triangle");
    }
}
package ClassAndObject;

public abstract class Shapes {//抽象类，不可实体化
    private int sides = 0;
    abstract void draw();//抽象方法，不能具有方法体，当抽象类被继承时，抽象方法必须被实现。
    public int getSides(){
        return sides;
    }
    public void setSides(int n){
        sides = n;
    }
}

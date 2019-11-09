package ClassAndObject;

public class Goose extends Birds{
    public Goose(){
        System.out.println("这是一只鹅");
    }
    public Goose(String name){
        super(name);
    }
    public void says(){
        System.out.println("GoooGoooo");
    }
    public void fly(){//重写是可以把修饰权限从小到大的修改
        System.out.println(super.getName()+":鹅扑啦扑啦");//重写父类方法
    }

}
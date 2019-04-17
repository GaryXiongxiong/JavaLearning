package ClassAndObject;
interface OutInterface{//定义一个空接口，名为标记接口，通常用于为对象打上标记，或让对象向上转型为该接口类型
    // public void say();
}
public class SpecialInnerClass {
    public static OutInterface creatLocalInnerClass(){//返回一个包装成接口的局部内部类对象
        class LocalInnerClass implements OutInterface{//定义局部内部类
            public LocalInnerClass(String s){//定义局部内部类构造方法
                System.out.println(s);
            }
            // @Override
            // public void say() {
            //     System.out.println(x);
            // }
        }
        return new LocalInnerClass("Created By methods");//将内部类对象向上转型为接口返回
    }
    public static OutInterface creatAnonymousInnerClass(){//返回包装成接口的内部类对象的函数
        return new OutInterface() {//直接返回现场定义的一个类，没有名字，构造函数为接口的构造函数
            private int i = 10;
            public int getValue(){
                return i;
            }
        };//这里的分号是return的分号
    }
    public static void main(String[] args) {
        System.out.println(creatLocalInnerClass().toString());//打印生成的局部内部类信息
        // creatLocalInnerClass("Created by Main again").say();
        //无法调用局部内部类的方法，因为被转为的接口中没有定义方法？还是因为他是内部的？
        //经过测试，应式接口没有声明该方法的原因。
        System.out.println(creatAnonymousInnerClass().toString());//可以看到返回了一个没有名字的对象，由于接口没有定义方法，所以无法调用内部类中的getValue()方法
    }
}
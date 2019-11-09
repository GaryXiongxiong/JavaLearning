package ClassAndObject;

public class Birds {
     private String name;
     static int id = 0;//静态变量-定义在类中，不会被对象实例化，所有对象供用
     public static void run(Birds b) {//定义静态方法，参数为Birds对象，同时可以以Birds子类的对象作为参数，实现多态。
         System.out.println(b.getName()+" is running");         
     }
     public Birds(){//定义无参数构造函数
         id++;
         System.out.println("第"+id+"只鸟已创建");
     }
     public Birds(String name){//定义带参数的构造函数
         this.name = name;
         id++;
         System.out.println("第"+id+"只鸟 "+this.name+" 已创建");
     }
     public void setName(String name){//设置名称
         System.out.println(this.name+"已更名为"+name);
         this.name = name;
     }
     public String getName(){//提取名称
         return this.name;
     }
     protected void fly(){
         System.out.println(this.name+":扑啦扑啦");
     }
     public boolean equals(Birds tar){
         if(this.name == tar.name){
             return true;
         }
         else{
             return false;
         }
     }
    
}
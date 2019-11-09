package Exceptions;

public class CatchExceptions {
    public static void main(String[] args) {
        try {//尝试执行try中的代码，出现异常后跳转到catch
            int n = Integer.parseInt("192L");//praseInt异常：该字符串无法准换位int
            System.out.println(n);
        } catch (Exception e) {
            System.out.println(e.getMessage());//getMessage()获取异常性质
            System.out.println(e.toString());//获取异常类型与性质
            e.printStackTrace();//打印异常的类型，性质，栈层与位置
        }
        System.out.println("Finish try");
        try {
            add(101,1);
        } catch (Exception e2) {//所有异常为exception的子类，所以不确定异常类型时使用exception抓取异常，此处e2应为自定义的CostomizeExceptions
            e2.printStackTrace();
        }
        System.out.println("Finish try");

    }
    public static int add(int a,int b) throws CostomizeExceptions{//定义可以抛出自定义异常类对象的函数,throws关键词后跟可能抛出的异常，多个异常用逗号隔开。抛出是将异常交由上一级代码来处理
        if(a<0||b<0){
            throw new CostomizeExceptions("不可使用复数");//抛出自定义异常对象，用异常内容初始化异常对象
        }
        else if(a>100||b>100){
            throw new CostomizeExceptions("不能大于100");
        }
        return a+b;
    }
}
package Exceptions;

public class CostomizeExceptions extends Exception {//异常的类名即为异常的类型
    public CostomizeExceptions(String ErrorMessage){//ErrorMessage即为异常性质
        super(ErrorMessage);
    }
}
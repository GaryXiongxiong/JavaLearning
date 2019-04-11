package MathTest;
import java.math.BigInteger;
import java.math.BigDecimal;
public class BigNumber{
    public static void main(String[] args) {
        //BigInteger
        BigInteger int1 = new BigInteger("10");//创建值为10的BigInteger对象，需注意，构造函数参数为字符串
        System.out.println(int1.add(new BigInteger("10")));//10+10，add方法的参数也要为BigInteger
        System.out.println(int1.subtract(new BigInteger("10")));//-
        System.out.println(int1.multiply(new BigInteger("10")));//*
        System.out.println(int1.divide(new BigInteger("4")));//商
        System.out.println(int1.remainder(new BigInteger("3")));//取余
        System.out.println(int1.divideAndRemainder(new BigInteger("3"))[0]);//商
        System.out.println(int1.divideAndRemainder(new BigInteger("3"))[1]);//余
        System.out.println(int1.pow(10));//n次方
        System.out.println(int1.negate());//相反数
        //BigDecimal
        BigDecimal dec1 = new BigDecimal("3.14159");
        BigDecimal dec2 = new BigDecimal(3.14159);//BigDecimal可以用双精度构造
        System.out.println(dec1.add(new BigDecimal("10")));//+10，add方法的参数也要为BigDecimal
        System.out.println(dec1.subtract(new BigDecimal("10")));//-
        System.out.println(dec1.multiply(new BigDecimal("10")));//*
        System.out.println(dec1.divide(new BigDecimal("2"), 4, BigDecimal.ROUND_HALF_UP));//参数为除数，保留小数，取近似方法
    }
}
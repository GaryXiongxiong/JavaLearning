package MathTest;
import java.util.Random;
public class MathClass{
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //三角函数：
        System.out.println("三角函数");
        System.out.println(Math.sin(Math.PI/2));//90度的正弦,参数为弧度
        System.out.println(Math.cos(Math.PI/3));//60度的余弦
        System.out.println(Math.tan(Math.PI/4));//45度的正切，同理还有asin,acos,atan
        System.out.println(Math.toDegrees(Math.PI/4));//弧度转角度
        System.out.println(Math.toRadians(90));//角度转弧度
        //指数函数
        System.out.println("指数函数");
        System.out.println(Math.exp(2));//e的a次方
        System.out.println(Math.log10(2));//log以10为底，2的对数
        System.out.println(Math.log(Math.E));//ln e的值
        System.out.println(Math.sqrt(4));//平方根
        System.out.println(Math.cbrt(8));//立方根
        System.out.println(Math.pow(2, 3));//2的3次方
        //取整函数
        System.out.println("取整函数");
        System.out.println(Math.ceil(5.3));//向上取整
        System.out.println(Math.floor(5.6));//向下取整
        System.out.println(Math.rint(2.5));//返回最接近的整数，如果左右两端一样近，有限偶数
        System.out.println(Math.round(3.5));//四舍五入
        //最大、最小值与绝对值
        System.out.println("最大、最小值与绝对值");
        System.out.println(Math.min(1, 2));//参数应为同一类型的参数,可以为int，double，long，float
        System.out.println(Math.max(1, 2));//参数应为同一类型的参数,可以为int，double，long，float
        System.out.println(Math.abs(-3.5));//返回绝对值，参数可以为int，double，long，float
        //随机数函数
        System.out.println("随机数函数");
        System.out.println(Math.random());//返回0到1之间的随机数，0<=random()<1
        //随机数类
        System.out.println("随机数类");
        Random ran = new Random();//创建Random对象ran
        System.out.println(ran.nextInt());//返回int内的随机整数
        System.out.println(ran.nextInt(10));//返回大于等于0，小于10的整数
        System.out.println(ran.nextLong());//返回long中的随机整数
        System.out.println(ran.nextBoolean());//返回随机Boolean值
        System.out.println(ran.nextDouble());//返回随机双精度值,0到1之间
        System.out.println(ran.nextFloat());//返回随机浮点数，0到1之间
    }
}
package StringObject;

import java.util.Date;
public class FormattingDate{
    public static void main(String[] args) {
        Date dateNow = new Date();
        System.out.println(dateNow);
        System.out.println(String.format("%tH", dateNow)+":"+String.format("%tM", dateNow)+":"+String.format("%tS", dateNow));
        System.out.println(String.format("%tH:%tM:%tS", dateNow,dateNow,dateNow));//一个格式化标识对应后方一个参数
        System.out.println(String.format("%tT", dateNow));//继承的常见时间组合，下同
        System.out.println(String.format("%tF", dateNow));
        System.out.println(String.format("%tc", dateNow));
    }
}
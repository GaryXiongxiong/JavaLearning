package StringObject;
import java.io.*;
public class RegularExpression {
    public static void main(String[] args) {
        System.out.println("123".matches("\\d+"));//matches方法验证字符串是否符合正则表达式
        System.out.println("i@jiangyixiong.top".matches("\\w+@\\w+(\\.\\w{2,4})+"));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "";
        while(true){
            System.out.println("请输入身份证号：");
            try{

                str1 = input.readLine();
                
                }catch(IOException e)
                
                {
                
                System.out.println(e);
                
                System.exit(0);
                
                }
            if(str1.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println(str1.matches("\\d{17}[\\d[xX]]"));
        }
    }
}
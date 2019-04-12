package ScannerTest;
import java.util.Scanner;
public class ScannerTest{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = scanner.nextInt();
        System.out.printf("%d的平方是%d\n",a,a*a);
        scanner.close();
    }
}
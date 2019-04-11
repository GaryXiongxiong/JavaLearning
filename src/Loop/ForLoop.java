package Loop;

public class ForLoop {
    public static void main(String[] args) {
        double sum = 0.0;
        for(double i = 1;i<=20;i++){
            double sumInternal = 1;
            for(int j = 1;j<=i;j++){
                sumInternal = j*sumInternal;
            }
            sum=sum+1/sumInternal;
        }
        System.out.println(sum);
    }
}
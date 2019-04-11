package Loop;

public class WhileLoop {
    public static void main(String[] args) {
        double i = 1;
        double sum = 0.0;
        while(i<=20){
            int j = 1;
            double sumInternal = 1;
            while(j<=i){
                sumInternal = j*sumInternal;
                j++;
            }
            sum=sum+1/sumInternal;
            i++;
        }
        System.out.println(sum);
    }
}
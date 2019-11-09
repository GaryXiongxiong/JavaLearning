package Leetcode;
import java.util.Arrays;

public class LargestPerimeterTriangle{
    public static void main(String[] args) {
        int[] A = {3,6,2,3};
        System.out.println(largestPerimeter(A));   
    }
    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        for(int i = n-1;i>=2;i--){
            if(A[i]<A[i-1]+A[i-2]){
                return A[i]+A[i-1]+A[i-2];
            }
        }
        return 0;
    }
} 
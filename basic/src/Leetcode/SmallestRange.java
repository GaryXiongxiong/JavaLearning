package Leetcode;
import java.util.Arrays;

public class SmallestRange {
    public static void main(String[] args) {
        int[] A = {1,3,6};
        int k = 3;
        System.out.println(smallestRangeII(A,k));
    }
    public static int smallestRangeII(int[] A, int K) {
        Arrays.sort(A);
        int n = A.length;
        int diff = A[n-1]-A[0];
        for(int i = 1; i<n;i++){
            int max = Math.max(A[i-1]+K,A[n-1]-K);
            int min = Math.min(A[0]+K,A[i]-K);
            diff = Math.min(max-min,diff);
        }
        return diff;
    }
}
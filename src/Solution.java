import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {3,0,1,4,2};
        sort(array, 5);
        for (int var : array) {
            System.out.println(var);            
        }
    }
    /**
     * 交换数组里n和0的位置
     * 
     * @param array
     *            数组
     * @param len
     *            数组长度
     * @param n
     *            和0交换的数
     */
    // 不要修改以下函数内容
    public static void swapWithZero(int[] array, int len, int n) {
        int j=-1;
        int k=-1;
        for (int var=0; var < len; var++) {
            if(array[var] == 0){
                j = var;
            }
            if (array[var]==n) {
                k = var;
            }
        }
        array[j]=n;
        array[k]=0;
    }
    // 不要修改以上函数内容


    /**
     * 通过调用swapWithZero方法来排
     * 
     * @param array
     *            存储有[0,n)的数组
     * @param len
     *            数组长度
     */
    public static void sort(int[] array, int len) {
        // 完成这个函数
        for (int i = 0; i < len; i++) {
            if(array[i] == i)
                continue; 
            else{
                swapWithZero(array,len,array[i]);
                swapWithZero(array, len, i);
            }
        }
        
    }
}
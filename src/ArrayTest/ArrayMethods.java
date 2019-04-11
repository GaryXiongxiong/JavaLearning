package ArrayTest;

import java.util.Arrays;
public class ArrayMethods{
    public static void main(String[] args) {
        int array1[]=new int[3];
        Arrays.fill(array1,1);//填充
        int array2[]={1,2,3,4};
        Arrays.fill(array2,1);//覆盖填充
        Arrays.fill(array2,1,3,2);//填充数组中从[1]到[3](不包括3)的元素
        int array3[]={2,1,5,3};
        Arrays.sort(array3);//排序数组
        int array4[]=Arrays.copyOf(array3, 3);//复制数组，新数组长度为第二参数，如果长度小于原数组则省略尾部，如果大于原数组用0填充
        int array5[]=Arrays.copyOfRange(array4, 1, 3);//复制数组从[1]到[3](不包括3)的元素
        int array6[]=Arrays.copyOfRange(array4, 1, 5);//复制数组从[1]到[3](不包括3)的元素
        int index = Arrays.binarySearch(array3, 3);//在数组中查找第一个出现的第二参数的索引，由于是二分法搜索，使用前需先对数组进行排序
        



    }
}
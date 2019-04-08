package ArrayTest;
public class CreatingArray{
    public static void main(String[] args) {
        int array1[];//声明数组
        int doubleDimensionArray1[][];//声明二维数组
        array1 = new int[10];//初始化数组并分配空间，数组实为对象
        doubleDimensionArray1 = new int[5][];//初始化高维度，多维数组实为数组组成的数组
        //doubleDimensionArray1 = new int[][10];报错，须先定义高维度再定义低维度
        int array2[] = new int[5];//声明同时分配空间
        for(int i:array2){
            System.out.println(i);
        }//分配后的数组各个元素均为0
        array1 = new int[]{1,2,3,4,5};//通过元素初始化
        int array3[] = {1,2,3,4,5,6};//声明同时通过元素初始化
        int doubleDimensionArray2[][] = {{1,2,3},{2,2,3},{3,2,3}};//二维数组初始化

    }
}
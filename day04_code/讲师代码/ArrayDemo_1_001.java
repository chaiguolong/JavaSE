/*
 * 数组的操作，使用索引，对数组中的元素赋值
 */
public class ArrayDemo_1_001{
    public static void main(String[] args){
        //定义数组，存储int类型数组，长度为5
        int[] arr = new int[5];

        //将1索引上的元素赋值3
        arr[1] = 3;
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

/*
 * 需求：
 *  1.遍历数组
 *
 * 思路：
 *  1.通过for循环遍历数组
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建数组，赋值并初始化
 *  3.通过for循环遍历数组
 */
public class ArrayDemo_3_004{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}

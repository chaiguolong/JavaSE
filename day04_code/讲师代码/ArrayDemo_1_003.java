/*
 * 需求：
 *  1.使用索引对数组元素进行复制及通过索引输出打印数组元素
 *
 * 思路：
 *  1.使用索引对数组元素进行复制及通过索引输出打印数组元素
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建数组
 *  3.通过索引对数组进行赋值
 *  4.通过索引对数组进行输出数组元素
 */
public class ArrayDemo_1_003{
    public static void main(String[] args){
        int[] arr = new int[5];

        arr[1] = 3;
        System.out.println(arr[1]);
        System.out.println(arr[0]);
    }
}

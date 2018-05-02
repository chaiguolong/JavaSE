/*
 * 需求：
 *  1.遍历二维数组并打印输出
 *
 * 思路：
 *  1.新建二维数组
 *  2.通过嵌套for循环打印输出二维数组
 *
 * 步骤:
 *  1.新建类和主函数
 *  2.新建二维数组并初始化赋值
 *  3.新建for嵌套循环，控制台输出二维数组的元素
 *
 * 注意：System.out.println();中内层循环不需要换行，外层循环单独换行
 */
public class ArrayArrayDemo_2_002{
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

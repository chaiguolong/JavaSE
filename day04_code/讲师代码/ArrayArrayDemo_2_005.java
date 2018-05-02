/*
 * 需求：
 *  1.遍历二维数组中的元素
 *
 * 思路：
 *  1.通过for循环遍历二维数组中的元素
 *
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.定义一个二维数组
 *  3.通过for循环遍历二维数组，打印输出
 *
 */
public class ArrayArrayDemo_2_005{
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{2,3,4},{4,6,2}};

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

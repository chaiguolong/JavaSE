/*
 * 需求：
 *  1.二维数组的遍历
 *
 * 思路：
 *  1.通过for循环嵌套对二维数组的遍历
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建二维数组，赋值并初始化
 *  3.新建for循环，对内循环打印
 *  4.在外循环换行
 */
public class ArrayArrayDemo_2_004{
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{11,12,13},{14,15,16}};

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

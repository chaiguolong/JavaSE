/*
 * 需求：
 *  1.有三个小组的销售额分别为{11，12}，{21，22，23},{31,32,33,34},分别对每组销售额求和
 *  和计算总销售额
 *
 * 思路：
 *  1.建立一个二维数组，通过嵌套for循环遍历二维数组，循环完一组的求和后，
 *  对值进行清空，用于保存下一组的金额数据，进行求和计算
 *
 * 
 * 步骤：
 *  1.新建类和主函数
 *  2.定义两个变量，用于接受每个小组的总金额，和总金额
 *  3.创建一个二维数组，并初始化，对其赋值
 *  4.创建for循环嵌套，对二维数组进行遍历
 *  5.内层循环打印输出为每组的总金额(通过求和累加)
 *  6.外层循环打印输出为总金额(通过求和累加)
 *  7.内层循环完毕后对每组金额进行清空，用以接受下组的数据
 */
public class ArrayArrayDemo_3_002{
    public static void main(String[] args){
        int sumGroup = 0;
        int sum = 0;
        int[][] arr = {{11,12},{21,22,23},{31,32,33,34}};

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                sumGroup = sumGroup + arr[i][j];
            }

            sum = sum + sumGroup;
            System.out.println(sumGroup);
            sumGroup = 0;
        }

        System.out.println(sum);
    }
}

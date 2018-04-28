/*
 * 循环的嵌套：循环里面还有循环，for形式居多
 * for（）{
 *      
 *      for（）{
 *
 *      }
 * }
 * 总的循环次数 = 内循环次数 * 外循环次数
 * 内循环，是外循环的循环体
 *
 * 外循环，控制的是行数
 * 内循环，控制的是每行的个数
 *
 *
 * 需求：打印一个9行，9列的三角形“*”
 *          *
 *          * *
 *          * * *
 *          * * * *
 *          * * * * * 
 *          * * * * * *
 *          * * * * * * *
 *          * * * * * * * *
 *          * * * * * * * * * 
 *
 *
 * 思路：
 *      1.通过双重循环与System.out.println("* ");实现
 *
 *
 * 步骤：
 *      1.定义一个外循环控制*的行数
 *      2.定义一个内循环控制*在每行的个数(每行*的个数和行数相等)
 *      3.在内循环通过System.out.print();打印*
 *      4.在外循环通过System.out.println();换行
 */
public class ForForDemo_003{
    public static void main(String[] args){
        for(int i = 1; i <= 9;i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

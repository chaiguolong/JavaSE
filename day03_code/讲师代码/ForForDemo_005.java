/*
 * 需求：
 *  打印9行9列的直角*型等腰三角形
 *  例如：*
 *        * *
 *        * * *
 * 
 * 思路：
 *  1.利用for循环嵌套打印，外循环控制行数为9，内循环控制每行的个数==当前循环的行数
 *
 *
 * 步骤：
 *  1.创建for循环嵌套，在内循环中直接打印不用换行
 *  2.在外循环打印空，作用：每行换行
 */
public class ForForDemo_005{
    public static void main(String[] args){
        for(int i = 1 ; i <= 9 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

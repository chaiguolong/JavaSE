/*
 * 循环的嵌套：循环里面还有循环，for形式多
 * for（）{
 *      
 *      for（）{
 *
 *      }
 *
 * }
 * 总的循环次数 = 内循环次数 * 外循环次数
 * 内循环，是外循环的循环体
 *
 * 外循环，控制的是行数
 * 内循环，控制的是行内个数
 *
 * 需求：打印9*9三角形
 *
 * 思路：
 *  1.通过循环嵌套，外循环控制行数，9，内循环控制每行个数，个数为循环的行数
 */
public class ForForDemo_004{
    public static void main(String[] args){
        for(int i = 1; i < 10; i++){
            for(int j = 1; j <= i; j++){
                //内循环不需要换行
                System.out.print("* ");
            }
            //外循环单独对每行进行换行
            System.out.println();
        }
    }
}

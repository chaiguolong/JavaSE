/*
 * 需求：
 *  1.判断给定的成绩是优(grade > 80),是良(grade > 70)，是中(grade > 60)，是差(其他)
 *
 *
 * 思路：
 *  1.通过if..else if...else if..多重判断实现
 *
 * 步骤:
 *  1.定义类和主函数
 *  2.定义整型变量并赋值
 *  3.通过if..else if...else if...实现多重判断
 */
public class IfElseIfDemo_005{
    public static void main(String[] args){
        int grade = 80;
        if(grade > 80){
            System.out.println(grade + " 成绩是优");
        }else if(grade > 70){
            System.out.println(grade + " 成绩是良");
        }else if(grade > 60){
            System.out.println(grade + " 成绩是中");
        }else{
            System.out.println(grade + " 成绩是差");
        }


        /*
         * 执行效率低
        if(grade > 80){
            //优
        }
        if(grade > 70){
            //良
        }
        if(grade > 60){
            //中
        }
        */

    }
}

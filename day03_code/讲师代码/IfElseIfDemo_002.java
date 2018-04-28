/*
 * if else if else 语句
 * 实在程序中，实现多条件的判断
 * 编写格式：
 *  if（条件）{
 *      if执行体
 *  }else if(条件){
 *      if执行体
 *  }else if(条件){
 *      if执行体
 *  }else{
 *      else的执行体
 *  }
 *  当if中的条件是true，执行if执行体
 *  if中的条件是false，执行else执行体
 *  一个语句中，包含多个if，只要有1个if的条件是true，其他的代码，不在执行
 */
public class IfElseIfDemo_002{
    public static void main(String[] args){
        //成绩判断要求，成绩>80     成绩>70    成绩>60    不及格
        //定义变量，保存成绩
        int grade = 75;
        //使用if...else...对成绩进行判断
        if(grade > 80){
            System.out.println(grade + "是优秀");
        }else if(grade > 70){
            System.out.println(grade + "是良好");
        }else if(grade > 60){
            System.out.println(grade + "是及格");
        }else{
            System.out.println(grade + "不及格");
        }


        /*
         * 执行效率低
        if(grade > 80){
            //优秀

        }
        if(grade > 70){
            //良好

        }
        if(grade > 60{
            //及格

        })
        */

    }
}

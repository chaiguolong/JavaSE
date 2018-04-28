/*
 * if...else...if...else语句
 * 适合在程序中，实现多条件的判断
 * 编写格式：
 *  if（条件）{
 *      if执行体
 *  }else if（条件）{
 *      if执行体
 *  }else if（条件）{
 *      if执行体
 *  }else{
 *      else执行体
 *  }
 */
public class IfElseIfDemo_003{
    public static void main(String[] args){
        //成绩判断要求，成绩>80    成绩>70     成绩>60      不及格    
        //定义变量，保存成绩
        int grade = 75;
        //使用if else if语句对成绩判断
        if(grade > 80){
            System.out.println(grade + "成绩是优");
        }else if(grade > 70){
            System.out.println(grade + "成绩是良");
        }else if(grade > 60){
            System.out.println(grade + "成绩是中");
        }else{
            System.out.println(grade + "成绩是差");
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

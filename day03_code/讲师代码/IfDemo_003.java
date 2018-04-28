/*
 * if语句：
 * 编写格式
 *  
 *      if（条件）{
 *          if语句的执行体
 *      }
 *      条件：结果必须是布尔类型    1==1    true||false
 *      执行体：当if中的条件为true的时候，执行大括号中的执行体
 *              当if中的条件为false的时候，什么也不做
 */
public class IfDemo_003{
    public static void main(String[] args){
        int i = 5;
        //对if中的条件进行判断
        if(i < 5){
            System.out.println("if中的条件为true");
        }

        System.out.println(i);
    }
}

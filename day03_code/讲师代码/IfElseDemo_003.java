/*
 * if...else语句格式
 *  编写格式
 *      if（条件）{
 *          if的执行体
 *      }else{
 *          else的执行体
 *      }
 *      当if中的条件为true，执行if的执行体
 *      当if中的条件为false，执行else的执行体
 */
public class IfElseDemo_003{
    public static void main(String[] args){
        int i = 16;
        if(i%2 == 0){
            System.out.println(i+"是偶数");
        }else{
            System.out.println(i+"是奇数");
        }
    }
}

/*
 * do...while循环
 *  编写格式：
 *
 *  do{
 *      循环体
 *  }
 *  特点：无条件先执行一次
 */
public class DoWhileDemo_003{
    public static void main(String[] args){
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i < 5);
    }
}

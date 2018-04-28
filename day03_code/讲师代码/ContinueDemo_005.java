/*
 * 需求:
 *  演示Continue关键字的作用:在循环中，终止本次循环，开始下一次循环
 *
 * 思路:
 *  1.创建for循环,对循环变量进行if判断,如果是偶数就跳过本次循环,如果是奇数,则打印该变量的值
 *
 * 步骤:
 *  1.创建类————ContinueDemo_005
 *  2.创建主函数public static void main(String[] args)
 *  3.创建for循环
 *  4.对变量取模2,若为0,则为偶数,跳过循环，进行下次循环，若为奇数，则打印该变量
 */
public class ContinueDemo_005{
    public static void main(String[] args){
        for(int i = 0 ; i < 20 ; i++){
            if(i%2 == 0){
                continue;
            }

            System.out.println(i);
        }
    }
}

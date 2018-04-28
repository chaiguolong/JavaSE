/*
 * 需求：
 *  1.判断一个变量是奇数还是偶数
 *
 * 思路：
 *  1.通过if(i%2 == 0)来判断i是奇数还是偶数
 *
 *
 * 步骤:
 *  1.定义类和主函数
 *  2.定义一个整数变量并赋值
 *  3.创建if语句，并进行判断对2取模
 *  4.如果为0，则为偶数
 *  5.如果是1，则为奇数
 */
public class IfElseDemo_005{
    public static void main(String[] args){
        int i = 16;
        if(i%2 == 0){
            System.out.println(i + "是偶数");
        }else{
            System.out.println(i + "是奇数");
        }
    }
}

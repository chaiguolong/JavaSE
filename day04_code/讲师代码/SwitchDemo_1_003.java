/*
 * 需求：
 *  1.星期1-5输出工作日，星期6-7输出休息日
 *
 *
 * 思路：
 *  1.根据case的穿透性实现
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建整型变量并赋值初始化
 *  3.通过switch语句进行实现
 *
 */
public class SwitchDemo_1_003{
    public static void main(String[] args){
        int week = 5;

        switch(week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
            break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
        }
    }
}

/*
 * 需求：
 *  1.根据变量值，输出对应的星期
 *
 * 思路：
 *  1.通过switch实现
 *
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.定义变量，模拟用户输入
 *  3.通过switch语句判断不同的星期
 *
 */
public class SwitchDemo_005{
    public static void main(String[] args){
        int week = 5;

        switch(week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("星期不存在");
                break;
        }
    }
}

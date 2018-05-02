/*
 * 需求：
 *  1.根据变量的值判断属于星期几
 *
 * 思路:
 *  1.通过switch分支语句判断属于星期几
 *
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.创建一整型变量并赋值
 *  3.常见switch语句进行判断星期几
 */
public class SwitchDemo_003{
    public static void main(String[] args){
        int week = 7;

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

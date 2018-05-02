/*
 * 需求：
 *  1.根据提供的变量数据，判断是星期几
 *
 * 思路：
 *  1.通过Switch语句判断是星期几
 *
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.定义一个变量并赋值初始化
 *  3.通过switch语句，通过case 语句判断是星期几
 *
 */
public class SwitchDemo_002{
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
        }
    }
}

/*
 * 需求：
 *  1.星期1-5，输出工作日，星期六，日,输出休息日
 *
 * 思路：
 *  1.通过switch中的case的穿透性，实现该功能
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.定义变量
 *  3.创建switch...case语句
 */
public class SwitchDemo_1_004{
    public static void main(String[] args){
        int week = 6;

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

/*
 * switch特性：case穿透性
 * 案例：星期一到五输出 工作日，星期六，日  输出休息日
 * case 1 case 2...case5    输出结果相同
 *
 * case 后面的常量，和switch中的数据相同，没有break，一直向下穿透
 * case 后面没有break，程序就会一直向下穿透
 */
public class SwitchDemo_1_001{
    public static void main(String[] args){
        int week = 30;

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

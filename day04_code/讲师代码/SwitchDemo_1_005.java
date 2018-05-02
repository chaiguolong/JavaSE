/*
 * 需求：
 * 1.星期1-5：输出工作日，星期6-7   输出休息日
 *
 * 思路：
 *  1.利用case语句的穿透性
 *
 */
public class SwitchDemo_1_005{
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

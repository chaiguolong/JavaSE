/*
 * 需求:
 *  演示for嵌套循环中，内循环中的break跳出外部循环
 *
 * 思路：
 *  1.创建for循环嵌套，在外循环中做a:for()标记,内循环中用break a;跳出外循环
 *
 * 步骤：
 *   1.新建一个类————BreakDemo_1_005
 *   2.新建一个主函数
 *   3.创建for循环嵌套,并在外循环中加入标记a
 *   4.在内循环中使用break a;跳出外循环
 *
 * 注意.为便于观察,在内外循环中使用System.out.println();打印变量值进行标识.
 */
public class BreakDemo_1_005{
    public static void main(String[] args){
        a:for(int i = 0; i < 5; i++){
            for(int j = 1; j < 10; j++){
                System.out.println(j);
                break a;
            }
            System.out.println(i);
        }
    }
}

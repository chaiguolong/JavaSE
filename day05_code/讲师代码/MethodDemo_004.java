/*
 * 需求：用函数封装一个计算长方形面积的方法，通过主函数调用
 *
 * 分析：函数实现长方形面积，主函数调用
 *
 */
public class MethodDemo_004{
    public static void main(String[] args){

        //1.调用计算长方形面积函数
        int area = Area(5,6);
        System.out.println(area);

    }

    public static int Area(int l , int w){
        return l * w;
    }

}

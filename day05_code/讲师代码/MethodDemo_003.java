/*
 * 需求：
 *  1.定义一个方法，计算长方形面积
 *
 */
public class MethodDemo_003{
    public static void main(String[] args){
        //1.计算长方形面积的方法
        double area = getArea(3.5,6.2);
        System.out.println(area);

    }

    /*
     * 计算长方形面积的方法
     * 返回值类型:double 
     * 传递参数:double l ,double w
     */
    public static double getArea(double l , double w){
        return l * w;
    }


}

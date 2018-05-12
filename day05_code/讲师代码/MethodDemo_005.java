/*
 * 需求：
 *  1.定义一个获取长方形面积的方法，在主函数被调用
 *
 */
public class MethodDemo_005{
    public static void main(String[] args){
        double area = getArea(2.5,4.5);
        System.out.println(area);

    }

    //1.定义一个长方形面积的方法
    //2.返回值类型：double
    //3.参数列表：double a , double b
    public static double getArea(double a , double b){
        return a * b;
    }
}

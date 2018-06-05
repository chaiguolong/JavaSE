package cn.itcast.demo3;
/*
 * 数学计算的工具类
 * java.lang.Math 静态方法组成
 */
public class MathDemo_002{
    public static void main(String[] args){
        function();
    }
    /*
     * static double round(double d)
     * 获取参数的四舍五入，去整数
     */
    public static void function_6(){
        long i = Math.round(4.55555533);
        System.out.println(i);
    }
    /*
     * static double random()返回随机数 0.0-1.0之间
     * 来源，也是Random类
     */
    public static void function_5(){
        for(int i = 0 ; i < 10 ; i++){
            double d = Math.random();
            System.out.println(d);
        }
    }
    /*
     * static double sqrt(double d)
     * 返回参数的平方根
     */
    public static void function_4(){
        double d = Math.sqrt(5);
        System.out.println(d);
    }

    /*
     * static double pow(double a, double b)
     * a的b次方
     */
    public static void function_3(){
        double d = Math.pow(2,3);
        System.out.println(d);
    }

    /*
     * static double floor(double d)
     * 返回小于或者等于参数d的最大整数
     */
    public static void function_2(){
        double d = Math.floor(4.333221);
        System.out.println(d);
    }
    /*
     * static double cell(double d)
     * 返回大于或者等于参数d的最小整数
     */
    public static void function_1(){
        double d = Math.ceil(5.1111);
        System.out.println(d);
    }

    /*
     * static int abs(int i)
     * 获取参数的绝对值
     */
    public static void function(){
        int i = Math.abs(-45);
        System.out.println(i);
    }
}

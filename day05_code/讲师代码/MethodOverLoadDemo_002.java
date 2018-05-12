/*
 * 方法的重载特性（overload)
 * 在同一个类中，允许出现同名的方法，只要方法的参数列表不同即可，这样方法就是重载
 * 参数列表不同：参数的额个数，数据类型，顺序
 */
public class MethodOverLoadDemo_002{
    public static void main(String[] args){
        //对于重载的调用，根据参数传递进行区分
        //System.out.println();
        double sum = getSum(2.3,3.5);
        System.out.println(sum);
    }

    /*
     * 对参数求和，利用方法的重载特性
     */
    public static int getSum(int a ,int b ){
        System.out.println("两个int参数");
        return a+b;
    }

    public static int getSum(int a, int b , int c){
        System.out.println("三个参数");
        return a+b+c;
    }

    public static double getSum(double a ,double b){
        System.out.println("两个double参数");
        return a+b;
    }
}

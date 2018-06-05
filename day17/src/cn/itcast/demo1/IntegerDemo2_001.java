package cn.itcast.demo1;
/*
 * JDK1.5后出现的特性，自动装箱和自动拆箱
 * 自动装箱：基本数据类型，直接变成对象
 * 自动拆箱：对象中的数据变回基本数据类型
 */
public class IntegerDemo2_001{
    public static void main(String[] args){
        function();
    }
    /*
     * 关于自动装箱和拆箱的一些题目
     */
    public static void function_2(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i==j);//false 对象地址
        System.out.println(i.equals(j));//true 继承Object重写equals，比较对象数据

        System.out.println("=======================");

        Integer a = 500;
        Integer b = 500;
        System.out.println(a==b);
        System.out.println(a.equals(b));

        System.out.println("=======================");

        //数据在byte范围内，JVM不会重新的new对象
        Integer aa = 127;
        Integer bb = 127;
        System.out.println(aa==bb);
        System.out.println(aa.equals(bb));
    }

    //自动装箱和拆箱弊端，可能出现空指针异常
    public static void function_1(){
        Integer in = null;
        // in = null.intValue() + 1;
        in = in + 1;
        System.out.println(in);
    }

    /*
     * 自动装箱，拆箱的 好处：基本类型和引用类直接运算
     */
    public static void function(){
        //引用类型，引用变量一定指向对象
        //自动装箱，基本数据类型1，直接变成了对象
        
        Integer in = 1;//Integer in = new Integer(1)
        //in 是引用类型，不能喝基本类型运算，自动拆箱，引用类型in，转化基本类型
        
        //in + 1 ==> in.intValue() + 1 = 2
        //in = 2 自动装箱
        in = in + 1;

        System.out.println(in);
    }


}

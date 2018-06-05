package cn.itcast.demo5;

import java.math.BigInteger;
/*
 * 超级大的整数运算
 * 超过long取值范围整数，封装成BigInteger类型对象
 */
public class BigIntegerDemo_001{
    public static void main(String[] args){
        function();
    }
    /*
     * BigInteger对象的四则运算
     * 调用方法计算，计算结果也只能是BigInteger对象
     */
    public static void function_1(){
        BigInteger b1 = new BigInteger("993274923784102384092843298470912837491287598");
        BigInteger b2 = new BigInteger("898304859480348953453561353458683469346865736986294635");

        //计算 b1+b2对象的和，调用方法add
        BigInteger bigAdd = b1.add(b2);
        System.out.println(bigAdd);

        //计算b1-b2对象的差，调用方法subtract
        BigInteger bigSub = b1.subtract(b2);
        System.out.println(bigSub);

        //计算b1*b2对象的乘积，调动方法multiply
        BigInteger bigMul = b1.multiply(b2);
        System.out.println(bigMul);

        //计算b2/b1对象商,调用方法divied
        BigInteger bigDiv = b2.divide(b1);
        System.out.println(bigDiv);
    }

    /*
     * BigInteger 类的构造方法
     * 传递字符串，要求数字格式，没有长度限制
     */
    public static void function(){
        BigInteger b = new BigInteger("434238742374928774682763482674827");
        System.out.println(b);
        BigInteger b1 = new BigInteger("345324728742973492784928742384729874927");
        System.out.println(b1);
    }
}

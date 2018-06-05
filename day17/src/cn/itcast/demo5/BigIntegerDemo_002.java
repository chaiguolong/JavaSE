package cn.itcast.demo5;

import java.math.BigInteger;

/*
 * 超级大的整数运算
 *  超过long取值范围整数，封装成BigInteger类型的对象
 */
public class BigIntegerDemo_002{
    public static void main(String[] args){
        function();
    }
    /*
     * BigInteger对象的四则运算
     * 调用方法计算，计算结果也只能BigInteger对象
     */
    public static void function_1(){
        BigInteger b1 = new BigInteger("123421345345345453543");
        BigInteger b2 = new BigInteger("34523454532465353453");

        //计算 b1+b2对象的和，调用方法add
        BigInteger bigAdd = b1.add(b2);
        System.out.println(bigAdd);

        //计算b1-b2对象的差，调用方法subtract
        BigInteger bigSub = b1.subtract(b2);
        System.out.println(bigSub);

        //计算b1*b2对象的乘积，调用方法multiply
        BigInteger bigMul = b1.multiply(b2);
        System.out.println(bigMul);

        //计算b2/b1对象商，调用方法divide(b1);
        BigInteger bigDiv = b2.divide(b2);
        System.out.println(bigDiv);
    }

    /*
     * BigInteger类的构造方法
     * 传递字符串，要求数字格式，没有长度限制
     */
    public static void function(){
        BigInteger b = new BigInteger("23453554645636");
        System.out.println(b);

        BigInteger b1 = new BigInteger("34123412343415");
        System.out.println(b1);
    }
}

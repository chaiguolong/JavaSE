package cn.itcast.demo5;

import java.math.BigDecimal;

public class BigDecimalDemo_002{
    public static void main(String[] args){
        function();
    }
    /*
     * BigDecimal实现除法运算
     * divied(BigDecimal divisor, int scale ,int roundingMode)
     * int scale:保留几位小数
     * int roundingMode:保留模式
     * 保留模式 阅读API文档
     *  static int ROUND_UP 向上+1
     *  static int ROUND_DOWN 直接舍去
     *  static int ROUND_HALF_UP >=0.5 向上+1
     *  static int ROUND_HALF_DOWN >0.5向上+1 ，否则直接舍去
     */
    public static void function_1(){
        BigDecimal b1 = new BigDecimal("1.234234");
        BigDecimal b2 = new BigDecimal("100");
        //计算b1/b2的商，调用方法divied
        BigDecimal bigDiv = b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDiv);
    }

    /*
     * BigDecimal实现三则运算
     */
    public static void function(){
        BigDecimal b1 = new BigDecimal("0.09");
        BigDecimal b2 = new BigDecimal("0.01");
        //计算b1+b2的和，调用方法add
        BigDecimal bigAdd = b1.add(b2);
        System.out.println(bigAdd);

        BigDecimal b3 = new  BigDecimal("1");
        BigDecimal b4 = new BigDecimal("0.32");
        //计算b3-b2的差，调用方法subtract
        BigDecimal bigSub = b3.subtract(b4);
        System.out.println(bigSub);

        BigDecimal b5 = new BigDecimal("1.015");
        BigDecimal b6 = new BigDecimal("100");
        //计算b5*b6的乘积，调用方法 muliply
        BigDecimal bigMul = b5.multiply(b6);
        System.out.println(bigMul);
    }
}

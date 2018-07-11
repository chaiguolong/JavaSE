package cn.itcast.demo;
/*
 * Throwable
 *  Exception 异常 感冒,阑尾炎
 *  将异常处理掉,可以继续执行
 *  RuntimeException
 *  Error 非典,艾滋,癌
 *  必需修改程序
 */
public class Demo_001{
    public static void main(String[] args){
        int[] arr = new int[9999999];
        System.out.println(arr[3]);
    }
}

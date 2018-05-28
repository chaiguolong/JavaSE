package cn.itcast.demo02;

public class Test_002{
    public static void main(String[] args){
        //使用接口中定义的常量
        //常常被静态修饰，可以被类名直接调用，被接口的名字直接调用
        System.out.println(MyInter.x);

        MyInterImpl_002 my2 = new MyInterImpl_002();

        System.out.println(my2.getSum(3,4));
    }
}

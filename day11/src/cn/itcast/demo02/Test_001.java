package cn.itcast.demo02;

public class Test_001{
    public static void main(String[] args){
        //接口使用中定义的常量
        //常量被静态修饰，可以被类名直接调用，被接口的名字直接调用
        System.out.println(MyInter.x);

        MyInterImpl  my = new MyInterImpl();
        my.show();
    }
}

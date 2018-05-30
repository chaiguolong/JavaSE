package cn.itast.demo02;

public class Test_001{
    public static void main(String[] args){
        Zi zi = new Zi();
        zi.show();
        zi.function();

        final int i = 10;//被final修饰，一次赋值，终生不变
        System.out.println(i);

        //final修饰引用变量问题
        //变量，保存内存地址，终生不变
        final Zi z2 = new Zi();
        z2.function();
    }
}

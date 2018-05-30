package cn.itast.demo07;

public class Test_002{
    public static void main(String[] args){
        Outer.Inner in = new Outer().new Inner();
        in.inner();
    }
}

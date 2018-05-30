package cn.itast.demo08;
/*
 * 局部内部类
 *  将一个雷，定义在方法中
 */
public class Outer_001{

    public void out(){
        class Inner {
            public void inner(){
                System.out.println("局部内部类方法");
            }
        }

        Inner in = new Inner();
        in.inner();
    }
}

package cn.itast.demo02;
/*
 * 定义父类
 * 一部分方法，写成final修饰
 * 子类可以继承的，但是不能做重写
 */
public class Fu_001{
    public final void show(){
        System.out.println("父类最终的方法");
    }

    public void function(){
        System.out.println("父类的一般方法");
    }
}

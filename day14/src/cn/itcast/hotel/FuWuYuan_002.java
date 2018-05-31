package cn.itcast.hotel;
/*
 * 定义服务员类
 *  属于员工一种，具有额外服务功能
 *  继承Employee，实现vip接口
 */
public class FuWuYuan_002 extends Employee implements VIP{
    //空参数构造方法
    public FuWuYuan_002(){
        super();
    }

    //满参数构造方法
    public FuWuYuan_002(String name,String id){
        super(name,id);
    }

    //抽象方法重写
    public void work(){
        System.out.println("服务员在上菜");
    }

    public void services(){
        System.out.println("服务员给顾客倒酒");
    }
}

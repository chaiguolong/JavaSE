package cn.itcast.hotel;
/*
 * 定义经理类
 * 属于员工一种，没有VIP功能
 * 自己有奖金属性
 */
public class JingLi_001 extends Employee{
    //空参数构造方法
    public JingLi_001(){
    }

    //满参数构造方法
    public JingLi_001(String name,String id,double money){
        super(name,id);
        this.money = money;
    }

    //定义奖金属性
    private double money;

    public double getMoney(){
        return money;
    }

    public void setMoney(double money){
        this.money = money;
    }

    public void work(){
        System.out.println("管理，谁出错我罚谁");
    }
}

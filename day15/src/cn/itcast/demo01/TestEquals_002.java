package cn.itcast.demo01;

public class TestEquals_002{
    public static void main(String[] args){
        //Person类继承了Object类，继承下来了父类的方法equals
        Person p1 = new Person("张三",20);
        Person p2 = new Person("李思",20);

        //Person对象p1，调用弗雷德方法equals，进行对象比较
        boolean b = p1.equals(p1);
        System.out.println(b);
        boolean bo = p1.equals(p2);
    }
}

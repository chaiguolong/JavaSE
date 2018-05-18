package cn.itcast.demo05;

public class PersonTest_002{
    public static void main(String[] args){
        Person_002  p = new Person_002();
        //调用set方法，对成员变量赋值
        p.setAge(18);
        p.setName("旺财");
        p.speak();

        //调用get方法，获取成员变量的值
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}

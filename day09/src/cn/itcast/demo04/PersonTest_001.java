package cn.itcast.demo04;
/*
 * 定义好的Person类进行测试
 * 创建对象，对象调用属性和方法
 */
public class PersonTest_001{
    public static void main(String[] args){
        //创建Person_001类的对象 new
        Person_001 p = new Person_001();
        //对成员变量赋值
        // p.age = -200;
        //对成员变量age赋值，只能调用set方法赋值
        p.setAge(50);

        p.name = "张三";
        //调用类中的方法
        p.speak();

        //输出成员变量age值，必须调用get方法
        System.out.println(p.getAge());
    }
}

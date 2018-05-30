package cn.itcast.demo03;

public class Test_002{
    public static void main(String[] args){
        //创建Person对象，调用的是空参数的构造方法
        //运行的结果 null 0
        Person p = new Person();

        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

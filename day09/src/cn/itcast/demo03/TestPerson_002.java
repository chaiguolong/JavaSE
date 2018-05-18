package cn.itcast.demo03;
/*
 * 方法的参数类型，是基本数据类型，引用数据类型
 */
public class TestPerson_002{
    public static void main(String[] args){
        int a = 1;
        function(a);
        System.out.println(a);

        Person_002 p = new Person_002();
        p.name = "郑三";
        System.out.println(p.name);

        function(p);
        System.out.println(p.name);
    }


    /*
     * 定义方法，参数类型是引用数据类型
     * 参数是Person_002类型
     * p接受的是一个内存的地址
     * main中的变量p
     * function 中的变量p 保存的地址是一样的
     */
    public static void function(Person_002 p){
        p.name = "李四";
    }

    /*
     * 定义方法，参数类型是基本数据类型
     */
    public static void function(int a ){
        a += 5;
    }
}

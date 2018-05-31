package cn.itcast.interfaces;

public class TestReturn_002{
    public static void main(String[] args){
        //调用GetSmoking类的方法GetSmoking获取smoking接口的实现类的对象
        GetSmoking g = new GetSmoking();
        Smoking s = g.getSmoking();//方法的执行结果是接口的实现类对象 new Student();
        s.smoking();
    }
}

package cn.itcast.interfaces;

public class TestReturn_001{
    public static void main(String[] args){
        //调用getSmoking类的方法getSmoking获取smoking接口的实现类的对象
        GetSmoking g = new GetSmoking();
        Smoking s = g.getSmoking();//方法的执行结果是接口的实现类对象 new student()
        s.smoking();
    }
}

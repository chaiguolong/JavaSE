package cn.itcast.interfaces;

public class GetSmoking_002{
    /*
     * 定义方法，方法的返回值是接口类型
     * 接口是不能创建对象，return语句后面返回的是他实现类的对象
     */
    public Smoking getSmoking(){
        return new Student();
    }
}

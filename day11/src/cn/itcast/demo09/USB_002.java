package cn.itcast.demo09;
/*
 * 自定义的USB接口类
 * 规范，就是抽象方法
 * 开，关
 */
public interface USB_002{
    public abstract void open();
    public abstract void close();
}

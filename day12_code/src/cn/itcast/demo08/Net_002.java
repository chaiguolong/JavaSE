package cn.itcast.demo08;
/*
 * 网络工程师，维护部的
 * 继承维护部类
 */
public class Net_002 extends Maintainer{
    public Net_002(String name,String id){
        super(name,id);
    }

    public void work(){
        System.out.println(super.getName()+"..."+super.getId()+"...正在检查网络是否畅通");
    }
}

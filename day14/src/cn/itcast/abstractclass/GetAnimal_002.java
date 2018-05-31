package cn.itcast.abstractclass;

public class GetAnimal_002{
    /*
     * 定义方法，方法的返回值是Animal类型
     * 抽象类，抽象类没有对象的，因为在方法的return后，返回Animal的子类的对象
     */
    public Animal getAnimal(int i ){
        if(i==0){
            return new Cat();
        }
        return new Dog();
    }
}

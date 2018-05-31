package cn.itcast.abstractclass;

public class TestReturn_002{
    public static void main(String[] args){
        //调用getAnimal类的方法，getAnimal，返回值是Animal
        GetAnimal g = new GetAnimal();

        Animal a = g.getAnimal(9);//方法的返回了Animal类型，return new Cat();
        a.eat();
    }
}

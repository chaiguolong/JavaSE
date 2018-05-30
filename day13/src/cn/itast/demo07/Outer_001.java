package cn.itast.demo07;

public class Outer_001{
    int i = 1;
    class Inner{
        int i = 2;
        public void inner(){
            int i = 3;
            System.out.println(Outer_001.this.i);
        }
    }
}

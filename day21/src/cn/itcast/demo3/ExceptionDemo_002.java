package cn.itcast.demo3;

public class ExceptionDemo_002{
    public static void main(String[] args){
        int avg = getAvg(50,60,-70,80);
    }

    public static int getAvg(int...source){
        int sum = 0;
        for(int s : source){
            if(s < 0 ){
                throw new FuShuException("成绩错误 " + s);
            }
            sum = sum + s;
        }
        return sum/source.length;
    }
}

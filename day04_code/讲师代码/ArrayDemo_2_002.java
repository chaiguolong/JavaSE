/*
 * 数组的两个定义方式
 *  数组类型[] 变量名 = new 数据类型[]{元素1，元素2，元素3}
 *  注意事项:new 后面的中括号中，不允许写任何内容，写了就编译失败
 *
 *  数据类型[] 变量名 = {元素1，元素2，元素3}
 */
public class ArrayDemo_2_002{
    public static void main(String[] args){
        //定义数组，定义的同时，对元素进行复制
        int[] arr = new int[]{1,2,3,45,5};
        System.out.println(arr.length);
        System.out.println(arr[3]);

        System.out.println("===================");
        //定义数组，直接大括号赋值
        int[] arr2 = {0,2,4,6,8};
        System.out.println(arr2.length);
        System.out.println(arr2[3]);
    }
}

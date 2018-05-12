/*
 * 需求：实现商品的库存管理
 *  功能：
 *      1.展示用户选择功能清单
 *      2.根据选择的功能编号，进行不同的操作
 *          A.展示所有库存
 *          B.修改库存数量
 *  分析：
 *      1.展示用户清单：
 *          输出语句，用户输入，选择功能序号
 *          1.展示所有库存
 *          2.修改库存数量
 *          3.退出
 *          4.你所选择的功能不存在
 *      2.根据选择，调用不同的方法
 *          switch语句
 *              case 1 2 3 4
 *
 *          A 展示库存
 *              将存储商品的数组，遍历
 *          B 修改库存
 *              修改所有的库存数量
 */
import java.util.Scanner;
public class Shopp_004{
    public static void main(String[] args){
        //1.将商品信息录入到数组中，新建数组
        String[] brand = {"MacBookAir","ThinkPadT450"};
        double[] size = {13.4,15.6};
        double[] price = {7899.98,5699.98};
        int[] count = {0,0};
        while(true){
            //2.展示用户选择功能清单
            int chooseNumber = showFunction();

            switch(chooseNumber){
                case 1:
                    //展示所有库存，遍历数组
                    printGoods(brand,price,size,count);
                    break;
                case 2:
                    updateGoods(brand,count);
                    break;

                case 3:
                    return;

                default:
                    System.out.println("您要选择的功能不存在");
            }

        }
    }

    //1.修改库存数量
    //返回值类型：void
    //参数列表类型：int[] count,String[] brand
    public static void updateGoods(String[] brand , int[] count){
        //遍历一个，修改一个
        for(int i = 0 ; i < brand.length ; i++){
            System.out.println("您要修改的品牌为:"+brand[i]);
            System.out.println("请输入要修改的库存数量");
            Scanner sc = new Scanner(System.in);
            int newCount = sc.nextInt();
            count[i] = newCount;
        }
    }

    public static void printGoods(String[] brand, double[] price, double[] size ,int[] count){
        System.out.println("----------------商品的库存管理-----------------------");
        System.out.println("品牌        尺寸            单价        数量");
        for(int i = 0 ; i < brand.length ; i++){
            System.out.println(brand[i]+"       "+size[i]+"         "+price[i]+"        "+count[i]);
        }
    }

    //1.展示用户选择功能清单
    //2.返回类型：void
    //3.参数列表：无
    public static int showFunction(){
        System.out.println("----------------请输入相应的序号选择功能------------------");
        System.out.println("1.展示所有库存");
        System.out.println("2.修改库存数量");
        System.out.println("3.退出");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
}

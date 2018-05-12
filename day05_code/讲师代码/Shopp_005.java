/*
 * 需求：
 *  1.展示用户选择功能清单
 *  2.根据选择的功能编号，进行不同的操作
 *      A.展示所有库存
 *      B.修改库存数量
 *
 * 分析：
 * 前期准备工作：定义数组，输入商品信息
 * 1.用打印输出的方法，展示选择功能清单,因功能清单许不断让用户选择，所以放在while(true)之中
 * 2.通过switch语句，通过不同编号，运行不同方法，从而实现不同功能
 *      A.遍历数组，输出语句
 *      B.循环数组，通过Scanner类输入库存数量
 *
 */
import java.util.Scanner;
public class Shopp_005{
    public static void main(String[] args){
        //1.定义数组，输入商品信息
        String[] brand = {"MacBookAir","ThinkpadT450"};
        double[] size = {13.4,15.6};
        double[] price = {9888.98,6998.98};
        int[] count = {0,0};
        while(true){
        //2.展示用户选择功能清单
        showFunction();
        System.out.println("请输入相应功能代码,从而选择相应功能");
        int chooseNumber =  chooseNumber();
            switch(chooseNumber){
                case 1:
                    //展示所有库存，遍历数组
                    printGoods(brand,size,price,count);
                    break;
                case 2:
                    //修改库存数据
                    updateGoods(brand,count);
                    break;
                case 3:
                    return ;
                default:
                    System.out.println("您选择的功能不存在");
            }
        }
    }

    /*
     * 定义一个修改库存数量的方法
     * 返回类型:void
     * 参数列表：String[] brand , int[] count
     */
    public static void updateGoods(String[] brand , int[] count){
        for(int i = 0 ; i < brand.length ; i++){
            System.out.println("您要修改的库存商品为:"+brand[i]);
            System.out.println("请输入库存的数量");
            Scanner sc = new Scanner(System.in);
            count[i] = sc.nextInt();
        }
    }


   /*
    * 定义一个展示所有库存的方法
    * 返回值类型：void
    * 参数列表：String[] brand ,double[] size, double[] price , int[] count
    */

    public static void printGoods(String[] brand ,double[] size, double[] price , int[] count){
        int totalCount = 0;
        double totalMoney = 0;
        System.out.println("--------------------展示商品库存信息-----------------------------");
        for(int i = 0 ; i < brand.length ; i++){
            System.out.println(brand[i]+ "      "+size[i]+"     "+price[i]+"        "+count[i]);
            totalCount += count[i];
            totalMoney += price[i]*count[i];
        }
        System.out.println("商品总库存为:"+totalCount);
        System.out.println("商品库存总金额为:"+totalMoney);


    }

    /*
     * 定义功能：选择功能
     * 返回类型：int
     * 参数列表：空
     */
    public static int chooseNumber(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /*
     * 定义方法，展示功能清单
     * 返回类型：void
     * 参数列表：空
     */
    public static void showFunction(){
        System.out.println("-------------商品的库存管理---------------");
        System.out.println("1.展示所有库存");
        System.out.println("2.修改库存的数量");
        System.out.println("3.退出");
    }
}

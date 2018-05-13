/*
 * 实现库存管理案例：
 *  1.存储商品信息
 *      存储商品类型变量
 *      将商品类型的变量，存储到集合中
 *
 *  2.查看库存清单
 *      将集合进行遍历，获取出集合中存储的Goods类型变量
 *      输出每一个Goods类型的属性
 *      计算求和：总库存，总金额
 *
 *  3.修改商品的库存
 *      集合遍历，获取出集合中存储的Goods类型变量
 *      变量调用Goods类属性count值，进行修改（键盘输入）
 */
import java.util.*;
public class Shopp_002{
    public static void main(String[] args){
        //创建ArrayList集合，存储Goods类型
        ArrayList<Goods> array = new ArrayList<Goods>();
        //调用添加商品信息的方法
        addGoods(array);
        //进入死循环
        while(true){
            //调用选择功能的方法，获取到用户输入的功能序号
            int number = chooseFunction();
            //对序号判断，如果=1，进入查看库存功能  =2  进入修改库存功能    =3  结束
            switch(number){
                case 1:
                    printStore(array);
                    break;
                case 2:
                    //进入修改库存功能，调用修改库存的方法，传递集合
                    update(array);
                    break;
                case 3:
                    return ;
                default:
                    System.out.println("无此功能");
            }
        }
    }

    /*
     * 定义一个功能，修改库存数
     * 返回值类型：void
     * 参数列表：ArrayList<Goods> array
     */
    public static void update(ArrayList<Goods> array){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < array.size(); i++){
            //集合方法get获取的是集合的元素，元素类型Goods类型
            Goods good = array.get(i);
            System.out.println("请输入"+good.brand+"的库存数");
            int newCount = sc.nextInt();
            good.count = newCount;
        }
    }

    /*
     * 定义一个查看库存的功能
     * 返回值类型：void
     * 参数列表：ArrayList<Goods> array
     */
    public static void printStore(ArrayList<Goods> array){
        System.out.println("-----------------商场库存清单----------------------");
        System.out.println("品牌        尺寸        价格        库存数");
        //定义变量，保存总库存和总金额
        int totalCount = 0;
        double totalMoney = 0;
        for(int i = 0 ; i < array.size() ; i++){
            Goods good = array.get(i);
            System.out.println(good.brand + "       "+good.size+"       "+good.price+"      "+good.count);
            totalCount = totalCount + good.count;
            totalMoney = totalMoney + good.count*good.price;
        }
        System.out.println("总库存数:"+totalCount);
        System.out.println("商品库存总金额:"+totalMoney);
    }

    /*
     * 定义选择功能的方法
     * 返回值类型：int
     * 参数列表：空
     */
    public static int chooseFunction(){
        System.out.println("库存管理");
        System.out.println("1.查看库存清单");
        System.out.println("2.修改商品库存数量");
        System.out.println("3.退出");
        System.out.println("请输入要执行的功能的序号");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    /*
     * 定义方法，添加商品信息Goods类型进array集合
     * 返回值类型：void
     * 参数列表：ArrayList<Goods> array
     */
    public static void addGoods(ArrayList<Goods> array){
        Goods good1 = new Goods();
        Goods good2 = new Goods();

        good1.brand = "MacBook";
        good1.size = 13.3;
        good1.price = 9888.98;
        good1.count = 4;

        good2.brand = "ThinkpadT450";
        good2.size = 15.6;
        good2.price = 6778.98;
        good2.count = 5;

        array.add(good1);
        array.add(good2);
    }
}

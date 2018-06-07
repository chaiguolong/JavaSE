package cn.itcast.demo;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection閹恒儱褰涙稉顓犳畱閺傝纭
 * 閺勵垶娉﹂崥鍫滆厬閹甸張澶婄杽閻滄壆琚箛鍛淬忛幏銉︽箒閻ㄥ嫭鏌熷▔
 * 娴ｈ法鏁ollection閹恒儱褰涢惃鍕杽閻滄壆琚敍宀鈻兼惔蹇曟畱濠曟梻銇
 * ArrayList implements List
 * List extends Collection
 * 閺傝纭堕惃鍕⒔鐞涘矉绱濋柈鑺ユЦ鐎圭偟骞囬惃鍕櫢閸
 */
public class CollectionDemo_001{
    public static void main(String[] args){
        function();
    }
    /*
     * Collection閹恒儱褰涢弬瑙勭《
     * boolean remove(Object o)缁夊娅庨梿鍡楁値娑擃厽瀵氱规氨娈戦崗鍐
     */
    private static void function_3(){
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc");
        coll.add("money");
        coll.add("itcast");
        coll.add("itheima");
        coll.add("money");
        coll.add("123");
        System.out.println(coll);

        boolean b = coll.remove("money");
        System.out.println(b);
        System.out.println(coll);
    }

    /*
     * Collection閹恒儱褰涢弬瑙勭《
     * Object[] toArray() 闂嗗棗鎮庢稉顓犳畱閸忓啰绀岄敍宀冩祮閹存劒绔存稉顏呮殶缂佸嫪鑵戦惃鍕畱閸忓啰绀岄敍宀勬肠閸氬牐娴嗛幋鎰殶缂
     * 鏉╂柨娲栭弰顖欑娑擃亜鐡ㄩ崒銊ヮ嚠鐠烇紕娈戦弫鎵矋閿涘本鏆熺紒鍕摠閸屻劎娈戦弫鐗堝祦缁鐎烽弰鐤ject
     */
    private static void function_2(){
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc");
        coll.add("itcast");
        coll.add("itheima");
        coll.add("money");
        coll.add("123");

        Object[] objs = coll.toArray();
        for(int i = 0; i < objs.length; i++){
            System.out.println(objs[i]);
        }

    }

    /*
     * 鐎涳缚绡凧ava娑擃厾娈戞稉澶岊潚闂鍨鐞涖劎骞囪ぐ銏犵础
     *  閺佹壆绮.length     鐏炵偞    鏉╂柨娲栭崐 int
     *  鐎涙顑佹稉.length() 閺傝纭    鏉╂柨娲栭崐绯筺t
     *  闂嗗棗鎮.size()     閺傝纭    鏉╂柨娲栭崐绯筺t
     */

    /*
     * Collection閹恒儱褰涢弬瑙勭《
     * boolean contains(Object o) 閸掋倖鏌囩电钖勯弰顖氭儊鐎涙ê婀禍搴ㄦ肠閸氬牅鑵戦敍灞筋嚠鐠炩崇摠閸︺劏绻戦崶鐎焤ue
     * 閺傝纭堕崣鍌涙殶閺勭枾bject缁鐎
     */
    private static void function_1(){
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc");
        coll.add("itcast");
        coll.add("itheima");
        coll.add("money");
        coll.add("123");

        boolean b = coll.contains("itcast");
        System.out.println(b);
    }

    /*
     * Collection閹恒儱褰涢惃鍕煙濞
     * void clear() 濞撳懐鈹栭梿鍡楁値娑擃厾娈戦幍閺堝鍘撶槐
     * 闂嗗棗鎮庣圭懓娅掗張顒冮煩娓氭繄鍔х涙ê婀
     */
    public static void function(){
        //閹恒儱褰涙径姘胶娈戦弬鐟扮础鐠嬪啰鏁
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc");
        coll.add("bcd");
        System.out.println(coll);

        coll.clear();

        System.out.println(coll);
    }
}

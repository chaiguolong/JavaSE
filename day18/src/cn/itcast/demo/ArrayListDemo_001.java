package cn.itcast.demo;

import java.util.ArrayList;
/*
 * 闂嗗棗鎮庢担鎾堕兇閿
 *      閻╊喗鐖 闂嗗棗鎮庨張顒冮煩閺勵垯绔存稉顏勵啇閸ｎ煉绱
 *          韫囧懘銆忔担璺ㄦ暏闂嗗棗鎮庣涙ê鍋嶇电钖
 *          闁秴宸婚梿鍡楁値閿涘苯褰囬崙鍝勵嚠鐠
 *          闂嗗棗鎮庨懛顏勭箒閻ㄥ嫮澹掗幀
 */
public class ArrayListDemo_001{
    public static void main(String[] args){
        /*
         * 闂嗗棗鎮嶢rrayList,鐎涙ê鍋峣nt缁鐎烽弫
         * 闂嗗棗鎮庨張顒冮煩娑撳秵甯撮崣妤鐔閺堫剛琚敍宀冨殰閸斻劏顥婄粻鍗炵摠閸
         */
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(11);
        array.add(22);
        array.add(33);
        array.add(44);
        array.add(55);
        array.add(66);
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
        /*
         * 闂嗗棗鎮庣涙ê鍋嶉懛顏勭暰娑斿娈慞erson缁顕挒
         */
        ArrayList<Person> arrayPer = new ArrayList<Person>();
        arrayPer.add(new Person("a",20));
        arrayPer.add(new Person("b",18));
        arrayPer.add(new Person("c",22));
        for(int i = 0 ; i < arrayPer.size();i++){
            //get(0),閸欐牕鍤惃鍕嚠鐠烆摉erson鐎电钖
            //閹垫挸宓冮惃鍕Ц娑撴稉顏勵嚠鐠炩槄绱濊箛鍛淬忕拫鍐暏閻ㄥ墖oString()
            System.out.println(arrayPer.get(i));
        }
    }
}

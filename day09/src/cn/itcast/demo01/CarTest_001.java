package cn.itcast.demo01;
/*
 * 娴嬭瘯锛岃嚜瀹氫箟鐨勭被Car
 * 鍒涘缓鍑篊ar_001绫荤殑鍙橀噺
 * 鍙橀噺锛岃皟鐢ㄥ睘鎬э紝鎴愬憳鍙橀噺
 * 鍙橀噺锛岃皟鐢ㄦ柟娉
 */
public class CarTest_001{

    public static void main(String[] args){
        //鍒涘缓鍑篊ar绫荤殑鍙橀噺锛屽垱寤哄嚭Car绫荤殑瀵硅薄锛屽皬姹借溅鐪熺殑鏈変簡
        Car_001 c = new Car_001();
        //瀵硅薄锛岃皟鐢ㄧ被涓殑灞炴у拰鏂规硶
        c.color = "鏃犺壊";
        c.count = 5;

        c.run();
    }
}

package cn.itcast.demo01;
/*
 *   娴嬭瘯,鑷畾涔夌殑绫籆ar
 *   鍒涘缓鍑篊ar绫荤殑鍙橀噺
 *   鍙橀噺,璋冪敤灞炴,鎴愬憳鍙橀噺
 *   鍙橀噺,璋冪敤鏂规硶
 */
public class CarTest {

	public static void main(String[] args) {
		//鍒涘缓鍑篊ar绫荤殑鍙橀噺 , 鍒涘缓鍑篊ar绫荤殑瀵硅薄,灏忔苯杞︾湡鐨勬湁浜
		Car c = new Car();
		//瀵硅薄.璋冪敤绫讳腑鐨勫睘鎬у拰鏂规硶
		c.color = "鏃犺壊";
		c.count = 5 ;
		
		c.run();
	}

}

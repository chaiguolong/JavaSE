package cn.itcast.demo2;
/*
 *  缁ф壙鍚,鍦ㄥ瓙绫婚噸鍐欑埗绫绘柟娉曠殑鏃跺,寮傚父澶勭悊
 *  缁撹:
 *    鐖剁被鐨勬柟娉,濡傛灉鎶涘嚭寮傚父,瀛愮被閲嶅啓鍚
 *      鍙互涓嶆姏鍑哄紓甯
 *      涔熷彲浠ユ姏鍑哄紓甯,浣嗘槸,濡傛灉瀛愮被瑕佹姏,鎶涘嚭鐨勫紓甯镐笉鑳藉ぇ浜庣埗绫荤殑寮傚父
 *        澶т簬,閮芥寚鐨勬槸缁ф壙鍏崇郴
 *        
 *    鐖剁被鐨勬柟娉,娌℃湁寮傚父鎶涘嚭,瀛愮被閲嶅啓鍚
 *       涔熶笉鑳芥姏鍑哄紓甯
 *       濡傛灉瀛愮被涓皟鐢ㄤ簡鎶涘嚭寮傚父鐨勬柟娉,鍒棤閫夋嫨,鍙兘try..catch澶勭悊
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		Fu f = new Zi();
		f.function();
	}
}

class Fu{
	public void function(){
		
	}
}
class Zi extends Fu{
	public void function(){
		
			try {
				method();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	
	}
	public void method()throws Exception{
		
	}
}

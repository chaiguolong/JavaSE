package cn.itcast.demo2;
/*
 *  Throwable绫讳腑鐨勬柟娉
 *  涓変釜鏂规硶,閮藉拰寮傚父鐨勪俊鎭湁鍏崇郴
 *    String getMessage() 瀵瑰紓甯镐俊鎭殑璇︾粏鎻忚堪       寮傚父浜!
 *    String toString()   瀵瑰紓甯镐俊鎭殑绠鐭弿杩       java.lang.Exception: 寮傚父浜!
 *    void printStackTrace() 灏嗗紓甯镐俊鎭拷韪埌鏍囧噯鐨勯敊璇祦  寮傚父淇℃伅鏈鍏,JVM榛樿璋冪敤鏂规硶涔熸槸杩欎釜鏂规硶
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
	  try{	 
		function();
	  }catch(Exception ex){
		  //System.out.println(ex.toString());
		  ex.printStackTrace();
	  }
	}
	
	public static void function() throws Exception{
		throw new Exception("寮傚父浜!");
	}
}

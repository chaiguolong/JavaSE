package cn.itcast.demo2;
/*
 * 缁ф壙鍚,鍦ㄥ瓙绫婚噸鍐欑埗绫绘柟娉曠殑鏃跺,寮傚父澶勭悊
 * 缁撹:
 *      鐖剁被鐨勬柟娉,濡傛灉鎶涘嚭寮傚父,瀛愮被閲嶅啓鍚庡彲浠ヤ笉鎶涘嚭寮傚父,涔熷彲浠ユ姏鍑哄紓甯,
 *      浣嗘槸,濡傛灉瀛愮被瑕佹姏,鎶涘嚭鐨勫紓甯镐笉鑳藉ぇ浜庣埗绫荤殑寮傚父
 *
 *      鐖剁被鐨勬柟娉,娌℃湁寮傚父鎶涘嚭,绱儓閲嶅啓鍚庝篃涓嶈兘鎶涘嚭寮傚父,
 *      濡傛灉瀛愮被涓皟鐢ㄤ簡鎶涘嚭寮傚父鐨勬柟娉,鍒棤閫夋嫨,鍙兘try...catch澶勭悊
 */
public class ExceptionDemo_001{
    public static void main(String[] args){
        Fu_001 f = new Zi_001();
        f.function();
    }
}

class Fu_001{
    public void function(){

    }
}

class Zi_001 extends Fu_001{
    public void function(){
        try{
            method();
        }catch(Exception e){

            e.printStackTrace();
        }
    }

    public void method() throws Exception{

    }
}

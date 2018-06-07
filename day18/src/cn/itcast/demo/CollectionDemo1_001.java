package cn.itcast.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1_001{
    public static void main(String[] args){
        //闆嗗悎鍙互瀛樺偍浠绘剰绫诲瀷鐨勫璞
        //闆嗗悎涓紝涓嶆寚瀹氬瓨鍌ㄧ殑鏁版嵁绫诲瀷锛岄泦鍚堜粈涔堥兘瀛
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add("uyyoiuo");

        //杩唬鍣ㄨ幏鍙
        Iterator it = coll.iterator();
        while(it.hasNext()){
            //it.next()鑾峰彇鍑烘潵鐨勬槸浠涔堟暟鎹被鍨嬶紝Object绫
            //Object obj = it.next();
            //System.out.println(obj);
            String s = (String)it.next();
            System.out.println(s.length());
        }
    }
}

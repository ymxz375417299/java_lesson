package lesson01;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Demo01 {
  public static void main (String[] args) {
    //# LinkedHashMap的概述和作用
    //- LinkedHashMap的特点： 底层是链表实现的可以保证怎么存就怎么取
    //- HashMap是存和取的顺序是不一样的，而且每次都不同)
    
    Map<String, String> map = new LinkedHashMap<String, String>();
    map.put("zhangsan", "广州");
    map.put("lisi", "广西");
    map.put("wangwu", "湖南");
    map.put("zhaoliu", "湖北");
    map.put("xiaoqi", "复检");

    // 获取Entry对象
    // Set<Entry<String, String>> entries = map.entrySet();

    for  (Entry<String, String> entry : map.entrySet()){
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }

}


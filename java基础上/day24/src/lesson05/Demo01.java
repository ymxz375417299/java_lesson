package lesson05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo01 {
  public static void main (String[] args) {
    
    // ### 面试题： HashMap和Hashtable的区别
    // #### Hashtable是JDK1.0 版本出现的，是线程安全的，效率慢，有加锁（看源码）， HashMap是JDK1.2版本出现的，是线程不安全的。效率高
    //
    // #### Hashtable不可以存null键和null值。HashMap可以存储null键和null值


    // HashMap对象
    Map<String, String> map = new HashMap<String, String>();
    map.put("name", "gyf");
    map.put(null, null); // 不报错
    System.out.println(map);


    // HashTable 比较少用
    Map<String, String> table = new Hashtable<String, String>();
    table.put("name", "gyf");
    // table.put(null, null); // 存空，报错

    System.out.println(table);

  }

}


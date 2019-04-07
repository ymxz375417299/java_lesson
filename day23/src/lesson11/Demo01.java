package lesson11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Demo01 {
  public static void main (String[] args) {
    //# Map集合的遍历而（键值对对象找键和值）
    //
    //### 键值对对象找键和值思路
    //1. 获取所有键值对对象（Entry） 的集合  
    //其实map的每个键值，都有对应的对象，即有多少个键值对，就有多少个Entry
    //2. 遍历键值对对象的集合，获取到每一个键值对对象
    //3. Entry这个对象相当于内部有个key和name属性
    //4. 根据键值对对象找键和值)
    
    // 创建Map
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("zhansan", 100);
    map.put("list", 89);
    map.put("wangwu", 1000);

    // 2. 增强for循环遍历Set
    Set<Entry<String, Integer>> entries = map.entrySet();
    for (Entry<String, Integer> entry : entries){
      //Map.Entry的实现类是HashMap$Node
      System.out.println(entry.getClass());
      String key = entry.getKey();
      int value = entry.getValue();

      System.out.println(key + " : " + value);
    }

    // 3. 通过迭代器来遍历Set
    Iterator<Entry <String, Integer>> iterator = entries.iterator();
    while(iterator.hasNext()){
      Entry<String, Integer> entry = iterator.next();
      String key = entry.getKey();
      int value = entry.getValue();
      System.out.println("迭代器遍历:" + key + " : " + value);




    }

  }


  public static void test1(){
    // 1. 创建Map对象
    Map<String, String> map = new HashMap<String, String>();
    map.put("name", "刘姐姐");
    map.put("age", "48");
    map.put("gender", "女");
    map.put("height", "2.09");

    // Java。util.Map.Entry
    /**
     * Entry: 称为 键值对 对象
     */

    Set<Entry<String, String>> entries = map.entrySet();

    // 遍历
    for (Entry<String, String> entry : entries){
      String key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + " : " + value);
    }
  }

}


package lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {
  public static void main (String[] args) {
    
    //Map集合的遍历一（键找只）
    Map<String, String> map = new HashMap<String, String>();
    map.put("name", "刘姐姐");
    map.put("age", "48");
    map.put("gender", "女");
    map.put("height", "2.09");

    // 2. 取Key对应的值
    String name = map.get("name");
    String  age = map.get("age");
    String gender = map.get("gender");

    // 3. 遍历
    // 3.1 获取map所有的键
    Set<String> keys = map.keySet();

    // 3.2 遍历键
    for (String key : keys){
      // 3.3. 通过key找值
      String value = map.get(key);
      System.out.println(key + " : " + value);
    }


  }

}


package lesson08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {
  public static void main (String[] args) {
    //# 1. 获取功能
    
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("name", "zhangsan"); 
    map.put("age", 30); // int 提升为Integer
    map.put("gender", '男'); //char 自动提升为character
    map.put("height", 1.90); //char 自动提升为character


    //### V get(Object kye): 根据键获取值
    System.out.println(map.get("name"));
    System.out.println(map.get("age"));
    System.out.println(map.get("gender"));
    //### set<K> keySet(); 获取集合中所有键的集合
    Set<String> keys = map.keySet();
    System.out.println("map所有键值" + keys);
    //### Collection<V> values(); 获取集合中所有值的集合
    Collection <Object> values = map.values(); // 返回值是Collection集合 
    System.out.println("map所有的值：" + values);
    System.out.println("map所有的值返回的类型：" + values.getClass());// 输出是class java.util.HashMap$Values ,HashMap里面的values的内部类 

    // 2. 长度功能
    // int size(); //返回集合中键值对的格式
    System.out.println("map的长度" + map.size());
  }

}


package lesson07;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {
  public static void main (String[] args) {
    // Map集合的功能概述（一）

    // 1. 创建一个Map对象
    Map<String, String> map = new HashMap<String, String>();
    

    // 2. 添加功能
    // *V put(K key, V value) ： 添加元素
    // 2.1 如果键是第一次存储，就是直接存储元素，返回null
    // 2.1 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值

    String value = map.put("name", "zhangsan");
    System.out.println(value);
    // 第一次把新的键放进去，会返回空

    System.out.println("Map：" + map);
    System.out.println("第二次添加=====");
    value = map.put("name", "rock");
    System.out.println("被替换的数据" + value);
    System.out.println("Map：" + map);

    System.out.println("分割。。。。。。");
    //map.put("age", 30); // 报错！ 因为前面的泛型指定了，必须存String
    map.put("gender", "男");
    System.out.println(map);

    // 3. 删除功能
    // void clear() 移除所有键值对
    // V remove(Object key); 根据键，删除对应的值 ,并把删除的值返回
    // map.clear();
    value = map.remove("gender");
    System.out.println("移除的元素的值： " + value);
    System.out.println(map);

    // 4. 判断功能
    // boolean containsKey(Object key): 判断集合是否包含指定的键
    System.out.println(map.containsKey("name"));
    // boolean containsValue(Object value) 判断结合是否包含指定的值
    System.out.println(map.containsValue("rock"));

    // boolean isEmpty(); 判断集合是否为空
    // map.clear();
    System.out.println(map.isEmpty());

  }

}


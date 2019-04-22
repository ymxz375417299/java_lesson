package lesson09;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {
  public static void main (String[] args) {
    //### HashMap使用注意事项
    //1. 声明HashMap是的键值可以是任意对象
    Map<String, String> map1 = new HashMap<String, String>();
    Map<String, Integer> map2 = new HashMap<String, Integer>();
    Map<Integer, String> map3 = new HashMap<Integer, String>();
    Map<String, Object> map4 = new HashMap<String, Object>();

    //2. 如果有重复的键，会把以前的替换
    map1.put("name", "rock");
    map1.put("name", "rockhansom");
    System.out.println(map1);

    //3. 值能为空
    map1.put("age", null);
    System.out.println(map1);
    //4. 件能为空，但是这样写没意义
    map1.put(null, "XXXX");
    System.out.println(map1);
    //
    //### 5. put方法的返回值
    //- 如果见是第一次存储，就直接存储元素，返回值null
    //- 如果见不是第一次存在，就用值把以前的值替换掉，返回以前的值
    
  }

}


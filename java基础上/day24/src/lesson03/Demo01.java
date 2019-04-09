package lesson03;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {
  public static void main (String[] args) {
    //### 案例： 统计字符串中每个字符出现的次数
    //String Str = "aaaabbbccccccccccccc"
    //

    String str = "abbccc";
    // 1. 存储字符次数的Map集合
    Map<Character, Integer> map = new HashMap<Character, Integer>();

    // 2. 遍历字符串的每一个字符
    for (int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      // 第一次出现这个字符，直接添加
      if (!map.containsKey(ch)){ // 判断是否包含key
        map.put(ch, 1);
      }else{
      // 如果不是第一次出现这个这次，累加
        map.put(ch, map.get(ch) + 1);
      }

    }

    System.out.println(map);
    
  }

}


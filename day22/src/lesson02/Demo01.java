package lesson02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01 {
  public static void main(String[] args) {
    // # HashSet
    // ### 1. 此类实现Set接口
    // ### 2. 由哈希表（实际是一个HashMap 实现） 支持。
    // ### 3. 它不保证Set的迭代顺序； 特别是它不保证该顺序恒久不变
    // ### 4. 此类允许shiyongnull元素
    //
    // ### 面试题：你在开发中经常使用Java的哪些包
    // 1. java.util包， 这个包有很多集合框架： LIst/Set/Map
    //
    //

    // Set遍历一，增强for循环
    // Set遍历二，迭代器
    Set<String> set = new HashSet<String>();
    set.add("大巴");
    set.add("火车");
    set.add("高铁");
    set.add("飞机");

    // 迭代器
    Iterator<String> iterator = set.iterator();
    
    // 遍历
    while (iterator.hasNext()){
      String str = iterator.next();
      System.out.println(str);
    }






  }
}

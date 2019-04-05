package lesson10;

import java.util.HashSet;
import java.util.Set;

import java.util.LinkedHashSet;

import com.gyf.model.Person;

public class Demo01 {
  public static void main (String[] args) {
    //# LinkedHashSet的概述和使用
    //### LinkedHashSet是一个具有可预知迭代顺序的Set接口
    //### 内部实现是使用哈希表和链表列表
    //### LinkedHashSet的特点是可以保证怎么存就怎么取
    //### LinkedHashSet是set集合中唯一一个能保证怎么存就怎么取的集合对象
    //### LinkedHashSet是HashSet的子类。所以也是保障元素为唯一的，与HashSet原理一样
    //)

    // HashSet集合
    // Set<Person> set1 = new HashSet<Person>();
    Set<Person> set1 = new LinkedHashSet<Person>();
    set1.add(new Person("张xx", 29));
    set1.add(new Person("李xx", 29));
    set1.add(new Person("非xx", 29));
    set1.add(new Person("罗xx", 29));

    // 遍历
    for(Person p : set1){
      System.out.println(p);
    }


    //

    
  }

}


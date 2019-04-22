package lesson11;

import java.util.HashSet;
import java.util.Set;

import java.util.TreeSet;

public class Demo01 {
  public static void main (String[] args) {

    // TreeSet存储Interger类型的元素并遍历
    // ### TreeSet存储Integer类型的元素并遍历讲
    // 1. TreeSet 是一个可以用于排序的集合
    // 2. TreeSet: 基于 TreeMap 的 NavigableSet 实现。
    // 3. TreeSet: 排序方法有两种
    //    1. 使用元素的自然顺序对元素进行排序
    //    2. 使用构造犯法的Comparator进行排序

    // TreeSet存储数组，会自然排序（有小到大）
    // TreeSet存储字符串，会自然排序（由字母的从小到大来源Ansll 码的编码）

    // Set<Integer> set = new HashSet<Integer>();
    Set<Integer> set1 = new TreeSet<Integer>();
    set1.add(18);
    set1.add(22);
    set1.add(10);
    set1.add(58);
    set1.add(158);
    set1.add(258);
    set1.add(38);

    for (Integer i : set1){
      System.out.println(i);
    }

    Set<String> set2 = new TreeSet<String>();
    set2.add("lucy");
    set2.add("tony");
    set2.add("amy");
    set2.add("ccc");
    set2.add("banana");

    //遍历
    for (String name : set2){
      System.out.println(name);
    }

    
  }

}


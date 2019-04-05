package lesson01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo01 {
  public static void main (String[] args) {
    //# Set
    //是一个接口，所以使用的都是她的实现类
    //1. 一个不包含重复元素的collection
    //2. 最多包含一个null元素（因为去重）
    //3. 一般使用它的实现类：
    //    - HashSet
    //        - LiinkedHashSet
    //            - TreeSet
    //            4. Set集合存和取的顺序不一样
    //
    //            #### List: 接口
    //            1. List是可存储相同元素
    //            2. List存的取的元素是一样的
    //


    // 复习List
    List<String> list = new ArrayList<String>();
    list.add("春节");
    list.add("五一");
    list.add("国庆");
    list.add("国庆");
    System.out.println("list:" + list);

    // 遍历
    for (String str: list){
      System.out.println(str);
    }


    // 二， Set接口
    Set<String> set = new HashSet<String>();
    set.add("单车");
    set.add(null);
    set.add("轿车");
    set.add("单车");
    set.add("单车");

    System.out.println("set:" + set);

    // 遍历set
    // 每次遍历的顺序都不一样
    for(String str : set){
      System.out.println(str);
    }
    

    
  }

}


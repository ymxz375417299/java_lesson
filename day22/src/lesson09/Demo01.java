package lesson09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo01 {
  public static void main (String[] args) {
    //将List集合中重复元素去掉（set实现）

    List<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("a");


    // 创建Set集合
    Set<String> set = new HashSet<String>();

    for (String str : list){
      set.add(str);
    }

    System.out.println(set);

    


  }
  

}


package lesson03;

import java.util.Comparator;
import java.util.Set;

import java.util.TreeSet;

public class Demo01 {
  public static void main (String[] args) {
    //在集合中存储无序并且重复的字符串，让其有序（字典顺序），并且不能去重复

    Set<String> set = new TreeSet<String>(new Comparator<String>(){
      @Override
      public int compare(String st1, String st2){
        int num = st2.compareTo(st1);
        num = num == 0 ? 1 : num;
        return num;
      }

    });
    set.add("a");
    set.add("b");
    set.add("c");
    set.add("a");
    set.add("a");
    set.add("a");

    // 遍历
    for (String str : set){
      System.out.println(str);
    }

    
  }

}


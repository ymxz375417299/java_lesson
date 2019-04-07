package lesson01;

import java.util.Comparator;
import java.util.Set;

import java.util.TreeSet;

public class Demo02 {
  public static void main (String[] args) {
    
    // 字符串正常排序
    // Set<String> set = new TreeSet<String>();
    // 使用排序 //使用匿名内部类
    Set<String> set = new TreeSet<String>(new Comparator<String>(){
      @Override
      public int compare(String o1, String o2){
        int num = o2.compareTo(o1);
    //3. 如果希望有相同的元素存在，再compareTo或者compare方法，返回1就行了
    // 不为0，则可以重复天就啊
        num = num == 0 ? 1 : num;
        return num;
      }
    });
    set.add("banana");
    set.add("apple");
    set.add("orange");

    for(String str : set){
      System.out.println(str);
    }
  }

}


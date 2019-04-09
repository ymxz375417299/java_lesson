package lesson01;

import java.util.List;
import java.util.ArrayList;
/**
 * List: 有序集合，有索引，存与取的顺序一样，可以充分
 * 掌握：
 *  掌握contains方法领悟应用
 */
public class Demo01 {
  public static void main (String[] args) {
    // 
    // #  案例：取出ArrayList重复的字符串元素
    // ###　需求：去除ArrayList集合中重复的字符串
    // ### 思路：创建新集合的方法（画图分析）
    // ``
    // List list = new ArrayList();
    // list.add("a");
    // list.add("b");
    // list.add("d");
    // list.add("e");
    // list.add("a");
    // ```
    //
    List list = new ArrayList();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("a");
    
    // 1. 创建新的集合判断
    List newList = new ArrayList();

    // 2. 创建list集合
    for (int i = 0; i < list.size(); i++){
      // 3. 取元素
      Object obj = list.get(i); //这个是List类特有的get/ zise方法，父类的collection没有
      if(!newList.contains(obj)){
        newList.add(obj);
      }

    }
    // 打印新集合
    System.out.println("new list" + newList);

    
  }

}


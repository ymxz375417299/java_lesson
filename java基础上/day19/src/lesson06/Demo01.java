package lesson06;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo01 {

  public static void main (String[] args) {
    //ListIterator其他方法【了解】
    //boolean hasNext() 收有下一个
    //boolean hasOrevious() 是否有前一个
    //Object next() 返回下一个元素
    //Object previous() 返回上一个元素

    List list = new ArrayList();
    list.add("小胡");
    list.add("小官");
    list.add("小罗");
    list.add("小美");
    list.add("小郭");


    // 创建迭代器
    // 先向下遍历，把游标到移到最后个元素
    ListIterator iterator = list.listIterator();

    while (iterator.hasNext()){
      Object o = iterator.next();
      System.out.println(o);
    }

    System.out.println("========");

    // 向上遍历
    // 游标移到第一个元素K
    // 如果不限把游标移到最后个元素直接判断没有上个元素就退出了。！
    while (iterator.hasPrevious()){ // 判断是否有上一个元素
      // 获取上一个元素
      Object o = iterator.previous();
      System.out.println(o);

    
    }

  }
}


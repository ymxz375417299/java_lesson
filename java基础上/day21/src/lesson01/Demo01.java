package lesson01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 掌握泛型迭代器的使用
 */

public class Demo01 {

  public static void main (String[] args) {
    
    // 泛型结合
    // 1. 声明一个泛型集合
    List<String> list = new ArrayList<String>();

    list.add("anc");
    list.add("sdadsa");


    //遍历 方式一：
    for(int i = 0; i < list.size(); i++){
      // 泛型可以避免强制类型转换
      String str = list.get(i);
      System.out.println(str);
    
    }


    // 遍历 方式2： 使用泛型迭代器

    // 泛型迭代器
    Iterator<String> iterator = list.iterator(); // 因为list是泛型的，所以迭代也要指明泛型
    while (iterator.hasNext()){
      // 取元素
      String str = iterator.next(); //泛型迭代器，返回值不是Object(不是泛型的迭代器返回值是Object)，而是直接泛指的数据类型。所以节省了强制类型转换的不安全行为
      System.out.println(str);
    }

  }
}


package lesson11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01 {
  public static void main (String[] args) {
    //# 三种迭代器能否删除
    //### 普通for循环，可以删除，但是索引要（--减减）
    //### 迭代器，可以删除，但是必须使用迭代器自身的remove方法，否则会出现并发修改异常
    //### 增强for循环不能删除
  
    test2();
    
  }

  // 普通for循环遍历删除
  public static void test1(){
    // 普通for循环，可以删除，但是索引要（--减减） List<String> list = new ArrayList<String>();
    List<String> list = new ArrayList<String>();
    list.add("java");
    list.add("mysql");
    list.add("h5");
    list.add("css");
    list.add("h5");


    System.out.println(list);
    System.out.println("==遍历移除前==");
    // 遍历
    for(int i = 0; i < list.size(); i++){ // 注意：不要把size() 单独提出来，要每次每次执行循环就要计算一次列表长度
      // 取元素
      String str = list.get(i);
      if (str.equals("h5")){
        list.remove("h5");
        i-- ;
      }
    
    }
    System.out.println(list);
  }

    //### 迭代器，可以删除，但是必须使用迭代器自身的remove方法，否则会出现并发修改异常
  public static void test2(){
    List<String> list = new ArrayList<String>();
    list.add("java");
    list.add("mysql");
    list.add("h5");
    list.add("css");
    list.add("h5");

    // 迭代器
    Iterator<String> iterator = list.iterator();

    while (iterator.hasNext()){
      String str = iterator.next();
      if (str.equals("h5")){
        // list.remove("h5")  会报错，不能给迭代器一遍遍历一遍移除或者添加// 必须使用迭代器的remove方法
        iterator.remove(); // 删除当前元素 

      }
    }

    System.out.println(list);
  }


    //### 增强for循环不能删除
  // 内部实现的机制就是迭代器，而迭代器不能通过集合list.remove进行删除。必须使用迭代器。而迭代器又简化了。没有申明变量，无法调用迭代器的remove方法
  public static void test3(){
    List<String> list = new ArrayList<String>();
    list.add("java");
    list.add("mysql");
    list.add("h5");
    list.add("css");
    list.add("h5");

    // 迭代器
    for(String str: list){
      if(str.equals("h5")){
        list.remove(str); // 报错并发修改异常
      }
    }
  }

}



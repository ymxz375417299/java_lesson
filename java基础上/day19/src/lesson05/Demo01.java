package lesson05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo01 {
  public static void main (String[] args) {
    // 并发修改异常产生的原因以及解决方案:
    // 需求： 有一个集合，判断里面又没有“word"这个元素，如果哟，就添加一个”javaee“ 元素
    //
    //
    //1. 变异没有问题，但是运行就抛出了一个异常：
    //ConcurrentModificationException
    //并发修改异常
    //2. 默认情况下，不能一边遍历一边添加元素！
    //3. 如果真想一边遍历元素，一边添加元素，建议使用另一个类型的迭代器ListIterator
    //
    //
    // Collection col1 = new ArrayList();

    test2();
    
  }

  // 使用Iterator
  public static void test1(){
    List list = new ArrayList();


    list.add("hello");
    list.add("word");
    list.add("weclome");
    System.out.println("list" + list);

    // 遍历元素
    // 使用迭代器的是，元素并没有遍历完，就添加元素，这个是java不允许的
    Iterator iterator = list.iterator();

    while(iterator.hasNext()){
      // 取元素
      Object obj = iterator.next();
      String str = (String)obj; // 强制类型转换成字符串 //因为Object obj = String "字符串" //这样可以强制类型转换成String
      if(str.equals("word")){ // 比较值是否word,
        list.add("java ee");

      }

    
    }
  }


  // ListIterator 的解决方法 继承Iterator
  public static void test2(){
    //  创建对象
    List list = new ArrayList();


    list.add("hello");
    list.add("word");
    list.add("weclome");
    System.out.println("list" + list);

    // 遍历元素
    // 使用迭代器的是，元素并没有遍历完，就添加元素，这个是java不允许的
    ListIterator li = list.listIterator();

    while(li.hasNext()){
      // 取元素
      Object obj = li.next();
      String str = (String)obj; // 强制类型转换成字符串 //因为Object obj = String "字符串" //这样可以强制类型转换成String
      if(str.equals("word")){ // 比较值是否word,
        // list.add("java ee");  // 【注意】： 不要使用集合对象list.add来添加元素， 需要使用迭代器来添加add
        li.add("javaee"); // 使用迭代器的add方法
      }
    }

    System.out.println(list);
  
  }

}


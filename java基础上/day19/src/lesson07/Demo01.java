package lesson07;

import java.util.Enumeration;
import java.util.Vector;
public class Demo01 {
  public static void main (String[] args) {
    // Vector 介绍
    //Vector 在JDK1.0 版本就有了，从Java2平台 v1.2开始，此类改进为可以实现的list接口
    //使它成为Java Collection Framework 【集合框架】的成员，
    //**Vector是同步的** 即加锁，安全的

    //  方法
    //  ### Vector类特有的功能
    //  - public void addElement(E obj)
    //  - publlic E elementAt(int index)
    //  - public enumeration elements() // 返回enumeration 枚举类。和迭代器相似
    //
    //
    //  enumeration的用法
    //  hasMoreElements 是否还有下一个元素
    //  nextElements 获取下一个元素


    Vector vector = new Vector();

    // 添加元素
    // synchromized: 同步， 加锁，线程安全
    vector.addElement("瑜伽");
    vector.addElement("添加元素");
    vector.addElement("打篮球");

    
    // 取元素 // 通过索引添加元素
    System.out.println(vector.elementAt(2));

    // 遍历Vector集合
    // 注意： 取名时不要用enum 因为enum是一个关键字
    Enumeration enumeration = vector.elements(); //返回枚举 类似迭代器

    while(enumeration.hasMoreElements()){
      Object o = enumeration.nextElement();
      System.out.println(o);
    }
  }

}


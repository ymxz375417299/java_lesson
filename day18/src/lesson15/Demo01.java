package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.gyf.model.Student;

public class Demo01 {
  public static void main (String[] args) {
    //# 集合的遍历之接待器遍历
    //### 1. 迭代器的 概述
    //迭代器用来遍历集合的每一个元素
    //### 2. 查看Iterator 文档，介绍接口Iterator 方法
    //### 迭代器的使用（案例）
    //- 一个字符串集合的遍历
    //- 一个学生对象的 遍历
    //
    //
    //### 迭代器有两个方法hasNest() 和 next()
    //### 迭代器的使用（案例）
    //- 一个字符串集合的遍历
    Collection col1 = new ArrayList();
    col1.add("苹果");
    col1.add("芒果");
    col1.add("奇异果");


    // 获取迭代器【迭代器不需要new， 通过方法获取即可】
    Iterator iterator = col1.iterator(); // collection.iterator返回Iterator迭代器的类
    System.out.println(iterator.getClass()); // 输出 class java.util.ArrayList$Itr 有个$符号，说明是一个内部类
    // iterator 是ArrayList的内部类

    
    // 遍历
    while(iterator.hasNext()){ // hasNext判断是否有下一个元素，返回booleankk
      Object o = iterator.next(); // 获取下一个元素
      System.out.println(o);
    
    }



    // 案例2
    //- 一个学生对象的 遍历
    //
    //
    Collection col2 = new ArrayList();
    col2.add(new Student("tony" , 22));
    col2.add(new Student("amy", 18));
    col2.add(new Student("lucy", 29));

    // 获取迭代器
    Iterator iterator2 = col2.iterator();

    // 遍历
    while(iterator2.hasNext()){
      Object o = iterator2.next();
      System.out.println(o);
    
    }





  }

}


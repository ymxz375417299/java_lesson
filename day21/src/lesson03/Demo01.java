package lesson03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.gyf.model.Student;

public class Demo01 {

  public static void main (String[] args) {
    //# 泛型ArrayList的遍历
    //### 使用泛型ArrayList存储字符串并遍历
    //### 使用泛型ArrayList存储学生对象并遍历)
    //
    //
    //1. 声明集合添加学生对象
    List<Student> list = new ArrayList<Student>();
    list.add(new Student("流", 23));
    list.add(new Student("李", 23));
    list.add(new Student("李", 23));
    list.add(new Student("罗", 23));

    // 遍历
    Iterator<Student> iterator = list.iterator();
    while(iterator.hasNext()){
      Student std = iterator.next();
      System.out.println(std);
    }

    
  }
}


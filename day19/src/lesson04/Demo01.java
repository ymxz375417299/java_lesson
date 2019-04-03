package lesson04;

import java.util.List;
import java.util.ArrayList;
import com.gyf.model.Student;


/**
 * 集合的遍历方式
 * 1. 把集合转成数组
 * 2. 使用集合中的迭代器
 * 3. 通过list的size()和get()方法结合来遍历list集合
 */
public class Demo01 {
  public static void main (String[] args) {
    //04.List集合存储学生对象并遍历讲解
 //  通过list的size()和get()方法结合来遍历list集合
 //
    List list = new ArrayList();
    list.add(new Student("apple", 19));
    list.add(new Student("banana", 22));
    list.add(new Student("orange", 32));


    // 遍历
    // list.get(0);
    // list.get(1);
    // list.get(2);

    for (int i=0; i < list.size(); i++){
      Object o = list.get(i);
      System.out.println(o);
    
    }
    
  }

}


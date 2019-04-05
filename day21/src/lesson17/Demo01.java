package lesson17;

import java.util.ArrayList;
import java.util.Collection;

import com.gyf.model.Student;



public class Demo01 {
  public static void main (String[] args) {
    //### Collection中toArray(T[] a)泛型集合转数组
    
    Collection<String> co1 = new ArrayList<String>();
    co1.add("Gosing");
    co1.add("gyf");

    // 声明了一个字符串数学组，而且值指定了容量2，但是没有元素 // 默认是null
    String[] strs = new String[2];
    System.out.println(strs);

    // 把集合的元素存在的指定的数组中
    // co1集合存在strs数组总
    co1.toArray(strs);

    for (String str:strs){
      System.out.println(str);
    }

    // 案例2 
    // 实例化数组 并泛指Strudent类型
    Collection<Student> co2 = new ArrayList<Student>();
    Student[] stus = new Student[2];
    co2.toArray(stus); // 把集合中co2的元素放在数组stus中


    
  }


}


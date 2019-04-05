package lesson16;


import java.util.List;
import java.util.Arrays;

import com.gyf.model.Student;


public class Demo01 {

  public static void main (String[] args) {
    //# 16.Arrays工具类的asList()方法讲解
    //
    //### Arrays工具类的asList()方法使用
    //### Collection中toArray(T[] a)泛型的集合转数组]))

    //asList查看源码发现，传入的参数是
    //T...a 泛型参数
    //asList: 把参数转成数组
    List<String> list1 = Arrays.asList("Gosling", "Lubcy", "Lily");
    System.out.println(list1);

    List<Student> list2 = Arrays.asList(new Student(), new Student(), new Student());
    System.out.println(list2);
    
  }
}


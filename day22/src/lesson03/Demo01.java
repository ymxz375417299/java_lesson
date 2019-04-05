package lesson03;

import java.util.HashSet;
import java.util.Set;

import com.gyf.model.Person;

public class Demo01 {
  public static void main (String[] args) {
    //1. HashSet 存储字符串保证元素的唯一性
    Set<String> set1 = new HashSet<String>();
    set1.add("刘");
    set1.add("张");
    set1.add("关");
    set1.add("刘");
    set1.add("刘");

    System.out.println(set1);

    // ### 02.HashSet存储自定义对象保证元素唯一性讲解
    // 如何保证对象的完整唯一性
    // 思路：
    // 1. 重写对象的hashCode()
    // 2. 重写对象的equals方法();
    Set<Person> set2 = new HashSet<Person>();
    set2.add(new Person("李四", 20));
    set2.add(new Person("老张", 20));
    set2.add(new Person("小长", 20));
    set2.add(new Person("李四", 20));
    set2.add(new Person("李四", 20));
    set2.add(new Person("李四", 20));

    System.out.println("set2" + set2); //发现， 李四即使重复了！也打印出来，所以过滤失败！
                                        // 原因是因为：引用对象存的是内存地址，而Set集合过滤本质上是调用了对象的equal方法进行比较，默认equal比对的是内存地址！所以才出现重复
                                        // 需要重写person的equals方法
                                        //
                                        // 发现重写了equals方法也不能过滤，看文档说明：还要Person重写HashCode(获取逻辑内存）方法
                                        //
    


  }

}


package lesson12;

import java.util.Set;

import java.util.TreeSet;

import com.gyf.model.Person;

public class Demo01 {
  public static void main (String[] args) {
    //### TreeSet存储自定义对象
    //使用TreeSet存储自定义对象时会出现异常：Person cannot be cast to java.lang.Comparable
    //
    //1. 如果想用TreeSet存储自定义对象，这个对象必须要实现Comparable接口
    //2. 此接口强行对实现它的每个类的对象进行整体排序。
    //3. 这种排序被称为自然排序，类的compareTo方法被称为它的自然比较方法。
    //4. 当compareTo方法返回0的时候集合中只有一个元素
    //5. 当compareTo方法返回整数到时候集合会怎么存就怎么取
    //6. 当compareTo方法返回负数的时候集合会倒叙存储



    Set<Person> set = new TreeSet<Person>();
    set.add(new Person("刘能", 10));
    set.add(new Person("赵四", 10));
    set.add(new Person("小沈阳", 10));
    set.add(new Person("鸭蛋", 10));

    // 遍历
    for(Person p : set){
      System.out.println(p); // 报错 ClassCastException类型转换错误
    }
  }

}


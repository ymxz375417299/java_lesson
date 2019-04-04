package lesson07;

import java.util.ArrayList;
import java.util.List;

import com.gyf.model.Student;
import com.gyf.model.Person;

public class Demo01 {
  public static void main (String[] args) {
    //# 泛型高级之通配符
    //### 1. 泛型通配符<?>
    //代表任意类型，如果没有明确，那么就是Object以及任意的Java类了
    //
    //
    
    List<Object> list = new ArrayList<Object>();
    list.add(1);
    list.add("abc");
    list.add(9.28);
    list.add(new Student("rock", 21));


    List<String> list2 = new ArrayList<String>();
    list2.add("a");
    list2.add("b");
    print(list2);
    
    List<Student> list3 = new ArrayList<Student>();
    list3.add(new Student("rock", 22));
    list3.add(new Student("lucky", 35));
    print(list3);

    //### 2. ? extends E
    //向下限定，E及其子类
    List<Person> list4 = new ArrayList<Person>();
    list4.add(new Person());
    list4.add(new Person());

    /**
     * addALL(Collection <? extends Person> c)
     * 添加的集合可以是Person类型【List<Person> list4】, 或者是Person的子类【List<Student> list6>】
     */

    List<Person> list5 = new ArrayList<Person>(); // addAll(? extends Person)
    /**
     * addAll(Collection<? extend Student> c)
     * 添加的集合可以是Student类型【List<student> list6】, 或者是Student的子类【List<Person> list5】
     */
    // List<Student> list5 = new ArrayList<Student>(); // addAll（？ extend是Student )
    list5.add(new Person());
    list5.addAll(list4);
    System.out.println(list5);

    List<Student> list6 = new ArrayList<Student>();
    list6.add(new Student());
    list6.add(new Student());
    list5.addAll(list6); // 把list6的2个元素添加到list5中
    System.out.println(list5);

    //### 3。 ? super E
    //向上限定，E及其父类
  }

  // 打印集合对象
  public static void print(List<?> list){
    System.out.println(list);
  }
}



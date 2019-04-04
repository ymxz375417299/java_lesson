package lesson02;

import java.util.List;
import java.util.ArrayList;

import com.gyf.model.Student;
import com.gyf.model.Person;

public class Demo01 {

  public static void main (String[] args) {
    
    //# 泛型使用的注意事项
    //1. 默认声明一个泛型集合，前后类型要一致\
    List<Student> list = new ArrayList<Student>();

    //2. 这样声明前面类型不一致是不可以的
    // List<Object> list2 = new Arraylist<Student?()

    //3. 集合泛型的声明，可以只声明前面的泛型，JdK1.7的新特性： 菱形泛型， 开发室建议还是写成前后一致
    List<Student> list3 = new ArrayList<>();


    //4. 集合声明的泛型，代表此类或者子类都可以成为集合的**元素**
    //写一个class Person, Student继承Person
    List<Person> list4 = new ArrayList<Person>();
    list4.add(new Person());
    list4.add(new Person());
    list4.add(new Person());

    list4.add(new Student());
    list4.add(new Student());
    list4.add(new Student());
    //5. 声明的泛型类型一定是引用数据类型
    //)

  }
}


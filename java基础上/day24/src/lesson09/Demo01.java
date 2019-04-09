package lesson09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo01 {
  public static void main (String[] args) {
    //### 泛型固定下边界【？super E】讲解

    //##### 1.  回顾【? extends E】 - 表示泛型固定上边界
    // ？表示子类 e表示父类 ,意思是，除了传泛指的类型，还可以传子类的 ,如何记忆, 记住E是传入的泛型,如Student, ?代表可以兼容的类型， extends代表是可以传子类
    //ArrayList.addAll(Collection<? extends Person> c)
    //
    //##### 2. 【? super E】 (E的父亲) 表示泛型固定下边界
    //? 表示父类，E 表示子类, 意思是 除了泛指的类型，还可以传父类
    //ArrayList.sort(comparator<? super Student> c)
    //
    //
    //#### ? extends E 针对存的操作
    //？ super E 针对取的操作
    
    List<Student> list = new ArrayList<Student>();

    list.add(new Student("e", 23));
    list.add(new Student("f", 123));
    list.add(new Student("g", 3));
    list.add(new Student("h", 45));

    /**
     * Comparator<? super E Student> c
     * 泛型固定下边界
     * comparator中的泛型可以是Student,也可以是Student的父类Person
     */
    // list的排序方法，需要传入Comparator 的实现类。或者内部类
    list.sort(new Comparator<Person>(){ // 是下边界的，可以是Strude, 也可以是父类Person
    // list.sort(new Comparator<Student>(){ // 是下边界的，可以是Strude, 也可以是父类Person
      @Override
      public int compare(Person o1, Person o2){
        return o2.age - o1.age;
      }
    });
    for (Student stu : list){
      System.out.println(stu);
    }
  }



  public static void test1(){
    List<Person> list1 = new ArrayList<Person>();
    list1.add(new Person("a", 23));
    list1.add(new Person("b", 45));

    List<Person> list2 = new ArrayList<Person>();
    list2.add(new Person("c", 23));
    list2.add(new Person("d", 45));

    List<Student> list3 = new ArrayList<Student>();
    list3.add(new Student("e", 23));
    list3.add(new Student("f", 45));

    /**
     * List.addAll(Collection<? extends Person> c)
     * 是固定上边界
     * 上面List传入的泛型是Person
     * <? extends Person> 可以传Person 和 Person的子类Student
     * 意识是：这个集合也可以是Person类型，也可以是Person的子类类型
     */
    list1.addAll(list2); //传Person类型
    list1.addAll(list3); // 传Person的子类Student集合


    // 遍历list1
    for(Person p : list1){
      System.out.println(p);
    }
  }

}


class Person{
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }


  @Override
  public String toString() {
    return "Person{" +
      "name = " + name +
      ", age = " + age +
      "}";
  }

}


/**
 * 子类
 */
class Student extends Person{


  public Student(String name, int age) {
    super(name,  age);
  }

}



package lesson02;

import java.util.Comparator;
import java.util.Set;

import java.util.TreeSet;

public class Demo01 {
  public static void main (String[] args) {
    //### 两种比较方式的区别
    //1. TreeSet构造方法什么都不穿，默认按照类中的**Comparable顺序**（没有就报错，ClassCastException）
    //2. TreeSet如果传入了comparator就优先按照**Comparator**
    //3. 如果既类实现Comparable又传入了比较器顺序类，则优先**Comparator**


    Set<Student> set = new TreeSet<Student>(new Comparator<Student>(){
      @Override
      public int compare(Student s1, Student s2){
        return s2.age - s1.age;
      }
    });
    set.add(new Student("猴子", 28));
    set.add(new Student("猪", 18));
    set.add(new Student("龙", 38));
    set.add(new Student("老虎", 8));

    // 遍历
    for (Student stu : set){
      System.out.println(stu);
    }
  }
}


class Student implements Comparable<Student>{
  String name;
  int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
      "name = " + name +
      ", age = " + age +
      "}";
  }

  // 重写自然排序compareTo排序
  @Override
  public int compareTo(Student old){
    return this.age - old.age;
  }

}


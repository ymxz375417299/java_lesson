package lesson04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import java.util.Map.Entry;

/**
  掌握：
  1. HashMap签到HashSet,或者说Map里签到Set
  2. 集合嵌套的遍历
 */
public class Demo01 {
  public static void main (String[] args) {
    //### 集合嵌套之HashMap签到HashSet
    //### 需求
    //1. 一个学校有两个班
    //2. 一个班有多个学生
    //3. 通过HashMap与HashSet来实现数据存储)
    
    // 1. 创建两个班（set)
    Set<Student> javaClass = new HashSet<Student>();
    javaClass.add(new Student("rock", 28));
    javaClass.add(new Student("小妞", 35));

    Set<Student> h5Class = new HashSet<Student>();
    h5Class.add(new Student("小丽", 18));
    h5Class.add(new Student("小红", 14));

    // 2. 创建一个学校Map
    // key: 班级名字， Value: HashSet;
    Map<String, Set<Student>> school = new HashMap<String, Set<Student>>();
    school.put("java班级", javaClass);
    school.put("H5班级", h5Class);

    // 3. 遍历
    // 使用Entry键值对对象
    // 3.1 遍历学校的班级
    Set<Entry<String, Set<Student>>> entries = school.entrySet();
    for (Entry<String, Set<Student>> entry : entries){
      System.out.println("班级名称: " + entry.getKey());

      // 3.2 编辑班级里的学生
      Set<Student> myClass = entry.getValue();
      for (Student stu : myClass){
        System.out.println(stu);
      }
    }



  }

}

class Student {
  String name;
  private int age;

  // 有参构造方法
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }


  @Override
  public String toString() {
    return "Student{" + "name = " + name + ", age = " + age + "}";
  }
}

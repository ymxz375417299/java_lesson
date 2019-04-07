package lesson13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.Map.Entry;

public class Demo01 {
  public static void main (String[] args) {
    /* 案例 ：HashMap集合键是Student,值是String
     键是学生对象，代表每一个学生
     值是字符串对象，代表学生归属地


     注意事项：
     1. 打印的key是Student的toString方法返回的字符串
     2. 如果key相同，会把前面的值替换掉,但是必须是同一个对象，同一个地址
     3. HashKey是无序的,遍历的顺序每次都不一样的
     4. new 出来的都不是相同的key,因为地址不同，如果属性一样，想替换前面对应属性一样的Value时，需要重新equlas和hashCode方法

    
    
    
    */



    Map<Student, String> map = new HashMap<Student, String>();
    map.put(new Student("小刘", 18), "湖北");
    map.put(new Student("小胡", 18), "湖南");
    map.put(new Student("小管", 18), "广东");
    // 4. new 出来的都不是相同的key,因为地址不同，所以不会替换
    map.put(new Student("小管", 18), "广西"); // 不会替换，因为new出了新地址
    Student stu = new Student("小鹏", 22);
    map.put(stu, "海南");
    map.put(stu, "海北"); // 会替换，因为键的Student都是同一个地址
    
    //4. new 出来的都不是相同的key,因为地址不同，如果属性一样，想替换前面对应属性一样的Value时，需要重新equlas和hashCode方法
    map.put(new Student("小官", 18), "梅州");
    map.put(new Student("小官", 18), "梅县");
    
    System.out.println("map: " + map);

    Set<Entry<Student, String>> entries = map.entrySet();
  }


}


class Student{
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


  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (int)age;
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Student object = (Student) o;

    if (name != null ? !name.equals(object.name) : object.name != null) return false;
    return !(age != object.age);
  }

}

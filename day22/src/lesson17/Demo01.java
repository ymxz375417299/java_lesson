package lesson17;

import java.util.Set;

import java.util.TreeSet;


public class Demo01 {
  public static void main (String[] args) {
    //# 案例： TreeSet存储自定义对象并遍历
    //### TreeSet存储自定义对象并遍历，按照==长度姓名长度，字母，年龄排序
    //#### 注意：
    //1. 通过比较字符串的compareTo方法可以比较大小
    //2. 排序是按照unicode码大小进行排序
    //3. 防止名字相同，但是年龄不同的bug
    
    Set<Student> stus = new TreeSet<Student>();

    stus.add(new Student("bb", 18));
    stus.add(new Student("eee", 18));
    stus.add(new Student("bbb", 18));
    stus.add(new Student("a", 18));
    stus.add(new Student("cccc", 118));
    stus.add(new Student("cccc", 28));


    // 遍历
    for (Student stu : stus){
      System.out.println(stu);
    }
  }

}



class Student implements Comparable<Student>{
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
      "name = " + getName() +
      ", age = " + getAge() +
      "}";
  }

  public Student() {
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Student other){
    // 1. 按照名字的长度进行排序
    int num =  this.name.length() - other.name.length();
    // 2. 按照字母排序
    // if (num == 0){
      // num = this.name.compareTo(other.name); // string.compareTo字母排序
    // }
    num = (num ==0)?this.name.compareTo(other.name) : num;
    

    // 3. 年龄
    // if (num == 0){
      // num = this.age - other.age;
    // }
    num = (num == 0) ? this.age - other.age : num;


    return num;

  }
}


package lesson02;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Demo01 {
  public static void main(String[] args) {
    // ### 案例： TreeMap集合键是Student值 是String
    // - TreeMap是Map接口的实现类
    // - TreeMap与TreeSet一样，是可以排序
    //
    // ### 实现排序的两种方法
    // 1. 学生类内部实现comparable接口
    // 2. 在new TreeMap中传入匿名类comparator

    /** TreeMap对key进行排序 */
    // test1();
    // test2();

    test3();
  }

  // 基本数据类型的String的TreeMap默认排序
  public static void test1() {
    Map<String, String> map = new TreeMap<String, String>();
    map.put("zhangsan", "广州");
    map.put("lisi", "广西");
    map.put("aangwu", "湖南");
    map.put("zhaoliu", "湖北");
    map.put("xiaoqi", "复检");

    // 获取Entry对象
    // Set<Entry<String, String>> entries = map.entrySet();

    for (Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }

  // 排序方式一： 自然顺序： 使用Comparable进行TreeMap的key进行排序
  public static void test2() {
    Map<Student, String> map = new TreeMap<Student, String>();
    map.put(new Student("banna", 18), "gz");
    map.put(new Student("cc", 18), "gz");
    map.put(new Student("apple", 18), "sz");
    map.put(new Student("cc", 18), "gz"); // 允许同名

    for (Entry<Student, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }

  // 排序方式二： 排序顺序，使用Comparator 进行TreeMap的key排序
  // 给TreeMap有参传入 new Comparator 接口，使用了匿名内部类对象调用
  // 重写compare方法
  public static void test3() {
    Map<Student, String> map =
        new TreeMap<Student, String>(
            new Comparator<Student>() {
              @Override
              public int compare(Student o1, Student o2) {
                int num = o2.name.compareTo(o1.name);
                num = num == 0 ? 1 : num; // 允许同名
                return num;
              }
            });
    map.put(new Student("banna", 18), "gz");
    map.put(new Student("cc", 18), "gz");
    map.put(new Student("apple", 18), "sz");
    map.put(new Student("cc", 18), "gz"); // 允许同名

    for (Entry<Student, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}

// 需要实现升级Comparable 接口，并重写CompareTo方法，实现排序规则
class Student implements Comparable<Student> {
  String name;
  private int age;

  // 有参构造方法
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // 重写CompareTo方法
  @Override
  public int compareTo(Student o) {
    // 按字母排序
    int num = this.name.compareTo(o.name);

    // 同名可以存储
    num = num == 0 ? 1 : num;
    return num;
  }

  @Override
  public String toString() {
    return "Student{" + "name = " + name + ", age = " + age + "}";
  }
}

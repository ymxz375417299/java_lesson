package lesson16;

import java.util.Set;

import java.util.TreeSet;

public class Demo01 {
  public static void main (String[] args) {
    Set<Person> set = new TreeSet<Person>();
    set.add(new Person("acc", 28));
    set.add(new Person("abc", 18));
    set.add(new Person("aad", 38));
    set.add(new Person("aad", 48));



    // 遍历
    for (Person p : set){
      System.out.println(p);
    }
  }

}

class Person implements Comparable<Person>{
  private String name;
  private int age;

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

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
    return "person{" +
      "name = " + getName() +
      ", age = " + getAge() +
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

    Person object = (Person) o;

    if (name != null ? !name.equals(object.name) : object.name != null) return false;
    return !(age != object.age);
  }

  @Override
  public int compareTo(Person other){
    // 1. 按年龄由小到大排序
    int num = this.age - other.age;
    System.out.println(this.name + "..比较.." + other.name + "年龄差" + num);
    // 判断，如果年龄差为了0, 因为年龄差为0比较特殊，只能存一个对象，所以就判断改成1
    // 出现问题，那名字也一样，是需要过滤的，改成1后去重失效了！
    if (num == 0){
      // num = 1;
      // 2. 如果年龄意义，根据名字排序[字符串一样，比较的结果也是一样]
      num = this.name.compareTo(other.name); // String.compareTo是字符串的排序方法
    }


    // 2. 如果年龄一样，按照名字排序
    return num;

  }

}

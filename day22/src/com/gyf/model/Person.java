package com.gyf.model;

public class Person {
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
    return "Person{" +
      "name = " + getName() +
      ", age = " + getAge() +
      "}";
  }

  // 重写HashCode
  // @Override
  // public int hashCode(){
    // 因为对象的内存地址不同，所以默认的HashCode返回内存地址也不同，所以HashSet去重才失败，我们只要让他返回它属性name的hanCode就能过滤了
    // 因为相同的字符串公用一个内存地址的
    // return this.name.hashCode();
//
  // }
//
  // 重写equals方法
  // @Override
  // public boolean equals(Object obj){
    // 强转
    // Person other = (Person) obj;
    // return this.age == other.age && this.name.equals(other.name);
  // }

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

}


package com.gyf.model;

public class Student {
  private String name;
  int age;




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

  // 重写equals比对方法

  @Override
  public boolean equals(Object obj){
    // 重写比较规则
    Student other = (Student)obj;
    return this.name.equals(other.name) && this.age == other.age;

  
  }

  

}


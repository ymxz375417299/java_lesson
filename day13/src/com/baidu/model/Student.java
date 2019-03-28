package com.baidu.model;

public class Student {
  String name;
  int age;

  public Student(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  public void say() {
    System.out.println("I' m " + name + age + "years old!");
  }
}

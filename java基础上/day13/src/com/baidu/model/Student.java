package com.baidu.model;

// 默认情况下public声明，允许导入
public class Student {
  public String name;
  int age;

  public Student(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  public void say() {
    System.out.println("I' m " + name + age + "years old!");
  }

  // 2. 如果方法声明不写权限，则是**默认**的权限，打代表这个方法在同一个包可以被访问，其他包不能访问
  void run() {
    System.out.println("run");
  }
}

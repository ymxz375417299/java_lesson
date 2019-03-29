package com.baidu.model;

public class Teacher {
  String name;
  int age;

  public Teacher(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  public void say(){
    System.out.println("I am a Theacer");
    System.out.printf("I'm " + name + "," + age + "year old");
  }
}

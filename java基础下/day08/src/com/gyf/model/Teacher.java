package com.gyf.model;

public class Teacher {
  private String name;
  private String hometown;
  private double height;
  public String color;
  



  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHometow() {
    return hometown;
  }

  public void setHometow(String hometow) {
    this.hometown = hometown;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  // 无参构造方法
  public Teacher() {
    super();
  }

  // 有参构造方法1
  public Teacher(String name, String hometown){
    super();
    this.name = name;
    this.hometown = hometown;
  }

  // 有参构造方法2
  public Teacher(String name, double height){
    super();
    this.name = name;
    this.height = height;
  }

  // 有参构造方法3
  public Teacher(String name, String hometow, double height) {
    this.name = name;
    this.hometown = hometown;
    this.height = height;
  }

  @Override
  public String toString() {
    return "Teacher{" +
      "name = " + getName() +
      ", hometown = " + hometown +
      ", height = " + getHeight() +
      ", color = " + color +
      "}";
  }

  public void say1(){
    System.out.println("我是一只小丑鸭，没有名字，呜呜~~~");
  }

  public void say2(String name){
    System.out.println("我是一只小天鹅，名字叫 " + name);
  }

  public void say3(String name, int age){
    System.out.println("我是一只" + name + "今年" + age + " 岁");
  }

  // 私有方法
  private void say4(String name){
    System.out.println("私有方法：" + name);
  }
}


package com.gyf.model;

public class Student {
  private String name;
  private String country;
  // 无参构造
  public Student() {
    super();
  }

  // 有参构造
  public Student(String name, String country) {
    super();
    this.name = name;
    this.country = country;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  // 我自己重写系统自动的toString.
  // @Override
  // public String toString(){
    ////返回该类的属性值
    // return "name:" + name + "country" + country;
//
//
  // }

  

  // 快捷键生成的
  @Override
  public String toString() {
    return "Student{" +
      "name = " + getName() +
      ", country = " + getCountry() +
      "}";
  }

}

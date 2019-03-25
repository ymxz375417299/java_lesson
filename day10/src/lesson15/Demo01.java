
/**
 * java 有三大特性
 * 1. 封装
 * 私有变量的封装
 * 2. 继承
 * 3. 多态
 *
*/
public class Demo01 {

  public static void main(String[] args) {

    // 继承extends
    // 继承： 让类与类之间产生关系。子父类关系
    //
    // 案例1： 
    // 猫类，够类
    // 定义两个属性（颜色， 腿的个数） 两个功能（吃饭， 睡觉）
    //
    // 问题：
    // 猫和狗虽然不类，但是他们属性和方法都一样，怎样减少代码量?
    // 猫和狗都属于动物，所以定义一个上一级的类（动物类），然后猫和狗类来继承即可
    //
    //
    //Animal: 称为父类
    //Cat: 称为子类
    //Dog: 称为子类
    //
    //Cat和Animal 称为子父关系
    //Dog和Animal 称为子父关系
    //
    //
    Cat cat = new Cat();
    cat.color = "小花";
    cat.legs = 4;
    cat.eat();
    cat.sleep();

    Dog dog = new Dog();
    dog.color = "小黑";
    dog.legs = 3;
    dog.eat();
    dog.sleep();

  }

}

// 动物类

class Animal{
  String color; //颜色
  int legs; //腿的格式

  public void eat(){
    System.out.println("吃饭...");
  }

  public void sleep(){
    System.out.println("睡觉..");
  }

}

class Cat extends Animal{ // 添加继承
  // String color; //颜色
  // int legs; //腿的格式
//
  // public void eat(){
    // System.out.println("吃饭...");
  // }
//
  // public void sleep(){
    // System.out.println("睡觉..");
  // }
}


class Dog extends Animal{ // 添加继承
  // String color; // 颜色
  // int legs; // 腿的个数
//
  // public void eat(){
    // System.out.println("吃饭...");
  // }
//
  // public void sleep(){
    // System.out.println("睡觉..");
  // }
}

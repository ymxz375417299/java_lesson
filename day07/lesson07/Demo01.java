
public class Demo01 {

  public static void main(String[] args) {
    //
    //如果生命一个类
    //1. 类的声明： class关键词， 例： class Student
    //2. 属性的声明： 数据类型，属性名 例： String name;
    //3. 方法声明： public 返回值类型 方法名（）{} 这里的方法和之前学的方法有点不同 
    //
    //案例1：学生类的定义
    // 声明学生类
    // 属性： 姓名， 年龄， 行不
    // 行为： 学习， 睡觉
    //


  }

}


// 
// 类是用于描述事物
// 类中有属性和行为
//
//
// 声明一个学生类

class Student{
  // 添加属性
  String name; //名字
  int age; // 年龄
  char gender; // 行不

  // 添加方法1
  public void study(){ //这里和之前学的方法有点不同，没有static关键词，具体再后面的章节有说明
    System.out.println("学习Java..");
  
  }
  // 添加方法2
  public void sleep(){
    System.out.println("在桌子趴着睡...");
  }
  

}

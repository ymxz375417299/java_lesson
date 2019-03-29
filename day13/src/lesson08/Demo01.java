package lesson08;

import com.baidu.model.Student;


import com.baidu.model.Teacher;

public class Demo01 {

  public static void main(String[] args) {



    // 定义包的注意事项
    //
    // 通过eclipse创建包，然后再包下面创建的java文件，默认会在第一行加入package代码
    // 如果在一个的类中使用另一个包的类，需要使用import导入包的类
    //
    // import com.baidu.model.Student
    // package语句必须是放在第一行的代码位置
    //
    // package语句在一个java文件中只能有一个
    // 项目中src和bin路面的区别
    // src是源码
    // bin是存放编译后的class文件

    Student stu = new Student("哈哈哈，rock you sucess ", 20);
    stu.say();
  }
}

class abc{
  String name;

}


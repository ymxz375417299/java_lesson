
public class Demo01 {

  public static void main(String[] args) {
    //# 练习1
    //### 学生和老师的案例
    //- 分别写老师和学生类
    //- 相同属性： 姓名， 年龄
    //- 相同行为：吃饭
    //- 老师有特有的方法： 讲课
    //- 学生特有的方法： 学习
    //
    //使用继承将学生和老师代码进行改进

  }

}


class Person{
  String name;
  int age;
  public void eat(){
    System.out.println("次饭。。。。");
  }
}



class Student extends Person{

  public void study(){
    System.out.println("学习Java 争取找到一份待遇好的工作。。。");
  }


}


class Teacher extends Person{

  public void speak(){
    System.out.println("教学生Java");
  }
}

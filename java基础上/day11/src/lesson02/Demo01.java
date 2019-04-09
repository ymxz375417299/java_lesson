
public class Demo01 {

  public static void main(String[] args) {
  // # 继承的注意事项
  // # ### 1. 子类只能继承父类的所有非私有的成员（成员方法和成员变量）
  // # ### 2. 子类可以通过spuer(马上将) 关键词去访问父类构造方法

    Student stu = new Student();
    stu.name = "毛爷爷"; //子类智能访问父类的非私有成员变量（属性）
    stu.age = 100;
    stu.say(); // 子类只能访问父类的非私有成员方法

  }

}


class Person{
  String name;
  int age;

  // 以后开发，一般的方法都声明public公有变量/方法
  public void say(){
    System.out.println("I' m " + name + "," + age+ "years old.");
  }
}



class Student extends Person{

}

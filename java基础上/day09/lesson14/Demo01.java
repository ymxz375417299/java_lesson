
public class Demo01 {

  public static void main(String[] args) {
    // 1. 静态属性正确的访问方式： 【类名.属性】
    // 2. stud1.className = "Java 1期"以前的这种写法教【对象名.属性】
    // 下面三个学生对象，都有相同的className
    Student stud1 = new Student();
    //
    //规范不够
    //the sttic field student.className
    //shuld be accessed in static way
    //Student类中的className是一个静态属性，应该以静态的方式访问
    //
    stud1.name = "张飞";
    // stud1.className = "java 1期"; // 虽然不报错，但是不规范
    Student.className ="Java 2期";
    stud1.say();

    Student stud2 = new Student();
    stud2.name = "刘备";
    // stud2.className = "java 1期";
    stud2.say();

    Student stud3 = new Student();
    stud3.name = "关羽";
    // stud3.className = "java 1期";
    stud3.say();

  }

}


class Student{
  static String className; // 班级名称
  String name;
  public void say(){
    System.out.println("我是" + name + "在" + className);
  }
}


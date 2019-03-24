
public class Demo01 {

  public static void main(String[] args) {
    // 下面三个学生对象，都有相同的className
    Student stud1 = new Student();
    stud1.name = "张飞";
    stud1.className = "java 1期";
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


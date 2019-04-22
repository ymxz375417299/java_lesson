
public class Demo01 {

  public static void main(String[] args) {
    // static的特性
    // 1. 随着类的加载而加载
    // 2. 优先于对象存在
    
    // 对学生的静态className属性赋值
    Student.name = "java 2019期";

    Student stu1 = new Student();
    stu1.id = "aa"; //属性与对象相关成员
    Student.name = "XXX"; //属性与类相关的类成员

    // 2. 获取静态属性的值
    // 注意：我并没有创建对象，直接用类名获取，也可以获取到静态属性值，说明静态属性是独立于对象，优先级高于对象
    System.out.println(Student.name);


  }

}

class Student{

  static String name;
  String id;
}

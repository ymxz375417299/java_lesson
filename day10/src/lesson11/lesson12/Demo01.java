
public class Demo01 {

  public static void main(String[] args) {
    // 2 构造代码块（初始化快）
    // - 在类中方法外出现的花括号，多个构造方法中相同的代码存放在一起
    // - 构造代码块在构造方法前执行
    // - 每次调用构造方法，构造代码块都会执行
      // - 每次调用构造都执行，并且在构造方法中执行
      // - 构造代码块有什么用
      // - 局部代码块作用： 在方法内部可以提前释放变量
      // - 构造代码块： 在相同的代码方法放在构造代码块

    Student stu1 = new Student("rock", "abc");

  }

}


class Student{
  String name ; 
  String className; 
  String country; // 过期
  {
    // 构造代码块
    // 用途：
    // 把相同的代码部分放在构造代码块中
    country = "中国";
    System.out.println("构造代码块");
  }


  // 构造方法
  public Student(String name, String className) {
    System.out.println("构造方法");
    this.name = name;
    this.className = className;
  }

}

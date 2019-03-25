
public class Demo01 {

  public static void main(String[] args) {
    // 3. 静态代码块【常用】
      // 1. 在类中方法外出现，并加上static关键词修饰
      // 2. 用于给类进行初始化，在加载的时候执行，并且值执行一次
      // 3. 一般用于加载驱动

    Student stu1 = new Student("aaaaaa", "java");
    Student stu2 = new Student("bbbbbb", "java");

  }

}

class Student{
  String name;
  String className;
  static String country = "中国";

  // 静态代码块
  // 1. 用于给类进行初始化
  // 2. 一般用于加载mysql驱动
  // 3. 如果有一段代码从始至终，只运行一次，可以写到静态代码块
  {
    System.out.println("构造代码块");
  }
  static {
    
    // 静态代码块只会运行一次。不管创建多少变量
     
    // className = xxx, 报错静态代码只能访问静态变量
    country = "中国";
    
    System.out.println("静态代码块");
  }

  // 构造方法
  public Student(String name, String className) {
    this.name = name;
    this.className = className;
  }

}


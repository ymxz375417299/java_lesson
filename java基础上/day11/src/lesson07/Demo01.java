
public class Demo01 {

  public static void main(String[] args) {
    // # 07.继承中构造方法的注意事项讲解
    // # ### 1. 父类没有无参构造方法，子类报错怎么办？
    // # - 子类必须创建无参构造方法，方法内还要调用父类的有参构造方法
    // # - 子类实现有参的构造方法，方法内还要调用父类的有参构造方法
    // # - 父类自己实现无参构造方法
    // #
    // #
    // # ### 2. 注意事项
    // # super(..)或this(xxx)来调用父类或本类构造方法，必须出现构造方法的第一条语句上

  }

}

// Person提供了有参构造方法，系统不再提供无参构造方法

class Person{
  String name;
  int age;


  // 解决方法3 直接给父类加一个无参构造方法
  public Person(){
    this("xxx", 28); // 如果需要调用本类的构造方法this(xxx，xxx)，也必须在构造方法的第一条语句
  }

  // 这里写有参构造方法，不写无参构造方法
  public Person(String name, int age){
    super();
    this.name = name;
    this.age = age;
  }
}


// 学生类默认有一个无参构造方法
class Student extends Person{
  // public Student(){
    //// super(); // 默认有这行代码，调用父类的无参构造方法，而父类Person定义了有参构造方法，系统则不再给父类提供无参构造方法，所以报错
    // super("小黄"， 40) // 解决方法1， 不调用父类的有参构造方法
  // }

  // 解决方法2， 子类定义有参构造方法，不写无参构造方法，因为系统不再提供
  // public Student(String name, int age){
    // // 但是还会报错。因为默认有super();这行代码，所以需要直接调用父类的有参构造方法
    // /super(name, age);
//
  // }

  
} 

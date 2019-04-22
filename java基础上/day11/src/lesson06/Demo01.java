
public class Demo01 {

  public static void main(String[] args) {
      // # 继承中构造方法的关系
      // # 子类中所有的构造方法默认都会访问父类的空参的构造方法
      // # 每一个构造方法第一条语句默认都是： super()
      // # Object类是最顶层的父类。
            // clss Person extends Object{
            // class Person{
            // 上面两个父类写法 一样的
      
    //1. 使用子类
    // Student stu1 = new Student();
    Student stu2 = new Student("小李", 40);
    // ### 为什么非要调用父类的构造方法？
    // 因为子类会继承父类的数据，可能还会使用父类的数据。所以子类初始化之前，一定要先完成父类的数据的初始化
    stu2.useMoney(); // 子类用钱


  }

}

class Person{
  int money;
  public Person(){
    super(); // Person是父类，他没有继承，那super() 怎么调用父类的无参构造方法？ 其实所有的类最顶层的父类都是Object，调用的是Object的无参构造方法
    money = 1000;
    System.out.println("父类的无参构造方法");
  }
}


class Student extends Person{
  //如果一个类里面不写任何的构造方法，系统会提供一个无参的构造 方法
  public Student(){
    super(); //调用父类的无参构造方法，不管写还是不写， 系统默认也会调用父类的无参构造方法
    System.out.println("子类Student的无参构造方法。。");
  }

  public Student(String name, int age){
    super(); // 默认情况下会调用父类的无参构造方法，不管写还是不写这行
    System.out.println("子类的有参构造方法");
    
  }

  public void useMoney(){
    System.out.println("子类： 我要用钱");
  }
}


class Person{
  static {
    System.out.println("Person 静态代码块"); //3
  }

  {
    System.out.println("Person 构造代码块"); //4 //6
  }


  public Person(){
    System.out.println("Person 无参构造方法"); // 5  //7
  }
}
public class Demo {
  // 静态代码块
  static {
    System.out.println("Domo静态代码块"); // 1 第一个输出
  }

  public static void main(String[] args) {
    System.out.println("我是main方法"); // 2
    Person p1 = new Person();
    Person p2 = new Person();

  }

}


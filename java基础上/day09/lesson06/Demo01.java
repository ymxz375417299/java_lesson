
public class Demo01 {

  public static void main(String[] args) {

    Person p1 = new Person();
    p1.name = "关公";
    p1.setAge(20);
    p1.say();

    Person p2 = new Person("刘备", 100);
    p2.say();

  }

}


class Person{
  String name;
  private int age;

  public void say(){
    System.out.println(name + ":" + age);
  }
  // 自动以无参构造函数
  public Person(){
    //什么都不做
  }

  // 错误的构造方法书写
  // 但是这种写法不规范，给参数名命名应该和成员变量一致，增加可读性，用this区分
  // public Person(String myName, int myAge){
    // name = myName;
    // age = myAge;
  // }

  // 正确的构造方法书写
  // 给参数名命名应该和成员变量一致，增加可读性，用this区分
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }


  // 正确的set方法书写
  public void setAge(int age){
    this.age = age;
  }
}


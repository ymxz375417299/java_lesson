
public class Demo01 {

  public static void main(String[] args) {
    // 1. 同一个文件不能有两个public class 类 
    // 2. 同一个包(最底部的子文件夹)内。不能有相同的类
    // 一个对象的内存图分析
    Person p1 = new Person();
    p1.name = "马云";
    p1.age = 45;
    p1.speak();


    Person p2 = new Person();
    p2.name = "马化腾";
    p2.age = 55;
    p2.speak();
  }

}

class Person{
  String name;
  int age;
  public void speak(){
    System.out.println("大家好，我是：" + name + " 今年" + age);
  }

}

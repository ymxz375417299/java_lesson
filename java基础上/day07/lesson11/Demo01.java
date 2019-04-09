
public class Demo01 {

  public static void main(String[] args) {
    // 一个对象的内存图分析
    Person p = new Person();
    p.name = "马云";
    p.age = 45;
    p.speak();


  }

}

class Person{
  String name;
  int age;
  public void speak(){
    System.out.println("大家好，我是：" + name + " 今年" + age);
  }

}


public class Demo01 {

  public static void main(String[] args) {
    // 方法的参数是类名 public static void print(Dog dog){}
    // 如果你看到了一个方法的形式是一个类类型（引用类型）
    // 调用方法的时候其实需要的是该类的对象。

    // 创建对象
    Dog dog = new Dog();
    dog.name = "小黑";
    dog.age = 1;

    // 调用print方法
    //print(Dog); //错误，Dog是一个类
    print(dog);  // dog 这是一个对象,传对象过去给print方法


  }

  // 在Demo01的类写的方法是需要些static，其他类的写方法不用
  // 把整个对象都传过去
  public static void print(Dog dog){
    // 打印狗的名字和年龄
    System.out.println(dog.name + ":" + dog.age);
  }

}


class Dog{
  String name;
  int age;

}

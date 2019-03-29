package lesson13;

public class Demo01 {

  public static void main (String[] args) {
    // 用在构造方法的修饰符
    // Car car = new Car("yellow", 4); // 报错 ,因为构造方法为私有privat
    // 1. 如果构造方法声明为publuic，代表这个类的外面可以调用构造方法来创建对象
    // 2. 如果构造方法声明了private, 代表这个类外面不可以调用构造方法来创建对象，但是这个类的内部是可以调用构造方法的
    // 3. 构造方法声明为protected,很少用，不用学。。
    // 4. 构造方法前面不写，代表默认，同一个包内可以调用构造方法
  }
}


class Car{
  String color;
  int wheel; //轮子个数

  // 公有构造方法
  // public Car(String color, int wheel){
    // super();
    // this.color = color;
    // this.wheel = wheel;
  // }



  // 私有构造方法
  private Car(String color, int wheel){
    super();
    this.color = color;
    this.wheel = wheel;
  }
}


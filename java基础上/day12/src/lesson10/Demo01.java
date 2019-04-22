
public class Demo01 {

  public static void main(String[] args) {
    //### 成员变量： 即可以是变量，也可以是常量。
    //### abstract 不能修饰成员变量，只能修饰类和方法
    //### 构造方法： 抽象类也是有构造方法，用于子类访问父类数据的初始化
    //### 成员方法： 抽象类的方法可以是抽象的，也可以非抽象的
    //
    //### 抽象类的方法特性
    //- 抽象方法： 强制要求子类的实现
    //- 非抽象方法：子类继承实现自己的业务，提高代码的复用性)

    // 写多态
    Animal cat = new Cat();
    cat.name = "小花";
    cat.eat();
    cat.say();
  }

}


abstract class Animal{
  //abstract String name; //不能修饰成员变量
  String name;
  final int MAX_LEGS = 3; // 抽象类可以有常量 // 动物最多有多少条腿
  
  // 无参构造方法
  public Animal(){};

  //### 构造方法： 抽象类也是有构造方法，用于子类访问父类数据的初始化
  public Animal(String name){
    super();
    this.name = name;
  }

  public abstract void eat(); //抽象方法
  //### 成员方法： 抽象类的方法可以是抽象的，也可以非抽象的
  public void say(){
    System.out.println("I' am " + name);
  }

  
}


class Cat extends Animal{
  // 因为父类写了有参构造方法，所以需要子类补一个构造方法
  // public Cat(String name){
    // super(name);
  // }
  @Override //重写
  public void eat(){
    System.out.println("吃鱼。。。");
  }


  // 也可以重写抽象类的非抽象方法
  @Override //重写
  public void say(){
      super.say();
      System.out.println("我很漂亮 ");
  
  }
}

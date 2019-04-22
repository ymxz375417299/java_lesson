package lesson17;

public class Demo01 {
  public static void main (String[] args) {
    //# 抽象类与接口的区别
    //
    //### 成员区别
    //#### 1. 抽象类：
    //
    //成员变量： 可以变量，也可以常量  
    //构造方法： 有  
    //成员方法： 可以抽象，也可以非抽象  
    //
    //#### 2. 接口
    //成员变量： 只能常量
    //成员方法： 只可以抽象
    //#### 3. 关系区别
    //类与类： 继承关系。单继承
    //
    //类与接口： 实现关系， 单实现和多实现都可以
    //
    //接口与接口： 继承关系，单继承和多继承
    //
    //4. 设计理念区别
    //抽象类： 定义的是该继承体系的共性功能
    //接口： 定义的是该继承体系的拓展功能
    

  }
}


// 抽象类
abstract class Animal{
  String name;
  final int MAX_LEGS = 4; //抽象类可以有常量

  public Animal(String name){
    super();
    this.name = name;

  }
  // 非抽象方法
  public void say(){}

  // 抽象方法
  abstract void run();

}



// 接口
interface AnimalInterface{
  //String name; // 接口不能写变量
  final int MAX_LEGS = 4; // 接口只能写常量。默认加了静态static装饰。 所以调用接口的常量，直接【类名.常量】名即可
  public void say(); // 默认就是抽象方法，abstract ，而且接口只能写抽象方法
  // public void run(){} // 报错，不成立。智能写抽象方法
}

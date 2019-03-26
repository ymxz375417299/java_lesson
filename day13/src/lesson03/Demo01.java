
public class Demo01 {

  public static void main(String[] args) {
    //# 接口概述
    //- 从狭义的角度讲就是==java中的interface==
    //- 从广义的角度讲==对外提供规则的==都是接口
    //- 接口就是对外访问的规则
    //
    //# 接口的特点
    //### 1. 接口用关键字interface表示
    //interface 接口名{}
    //
    //### 2. 类实现接口用implements表示
    //class 类名 implements 接口名{}
    //
    //### 3. 接口不能实例化
    //按照多态的方式来实例化
    //
    //### 4. 接口的子类
    //可以是抽象类，但是意义不大
    //可以是具体类，要重写接口中的所有方法


    // 接口不能直接实例化
    // 必须另外的类进行对接，用这个类实例化 (也可以称为子类)
    Cat cat = new Cat();
    cat.eat();
    cat.say();



  }

}


//AnimalInterface 动物的接口
interface AnimalInterface{
  // 在接口声明的方法都是抽象的方法
  // 在声明方法是，不加abstract，系统默认是抽象方法
  // 你在方法里写与不屑abstract 的效果一样的
  public void eat();
  public void say();
  
}

// 定义猫类，并对接AnimalInterface的接口类
// Cat 和AnimalInterface关系称呼
// 1. Cat是AnimalInerface实现类
// 2. Cat是AnimalInerface的子类
// 3. AnimalInterface 是Cat的父类
//
//
//
class Cat implements AnimalInterface{

  
  @Override
  public void eat(){
    System.out.println("我吃鱼");
  }

  @Override
  public void say(){
    System.out.println("我是一致小花猫"); 
  }

}


// 接口的子类可以是抽象，但是意义不大
abstract class Dog implements AnimalInterface{

}

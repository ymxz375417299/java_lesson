
public class Demo01 {

  public static void main(String[] args) {
    //### 抽象类
    //可以理解为看不懂的类
    //
    //### 抽象类的特点
    //1. 抽象类和抽象方法必须用abstract 关键词修饰
    //    - abstract class 类名{}
    //        - public abstract void eat();
    //        2. 抽象类不一定有抽象方法，有抽象方法的类一定是一个抽象类或者是接口
    //        3. 抽象类不能实例化（new）, 那么如何进行抽象类实例化？
    //            - 由具体的子类实例化。 其实这也是多态的一种，抽象类多态
    //            4. 抽象类的子类
    //                - 要么是抽象类
    //                    - 要么重写抽象类中的所有抽象方法1



    // Cat cat = new Cat();
    // cat.eat();
    // Dog dog = new Dog();
    // dog.eat();
    //
    //Animal animal = new Animal(); // 抽象类是不能实例化new的，报错 ,如果想使用抽象类，必须写一个类继承抽象类，而且实现抽象类的指定抽象方法
    Cat cat = new Cat();
    cat.eat();

    Dog dog = new Dog();
    dog.eat();
  }
}



// 抽象类
// class Animal{
  ////实际上，不同类对方法eat的行为是不同的，理论上是应该写在类里面的 ,而所有子类都有eat的方法行为，理论上又应该写在父类，这时候就引入抽象类抽象方法
  // public void eat(){
    // System.out.println("吃饭。。。");
  // }
// }
//
//
// class Cat extends Animal{
  // public void eat(){
    // System.out.println("吃鱼。。。");
  // }
//
// }
//
// class Dog extends Animal{
  // public void eat(){
    // System.out.println("吃骨头。。。");
  // }
//
// }


// 抽象类
abstract class Animal{
  //抽象方法，吃偶像方法不实现，也就是不写{}花括号
  public abstract void eat();
}


// 猫这个类必须实现Animal的抽象方法
//Cat is not abstract and does not override abstract method eat() in Animal)
class Cat extends Animal{
  @Override
  public void eat(){
    System.out.println("猫类吃鱼");
  }

}


class Dog extends Animal{
  @Override //重写
  public void eat(){
    System.out.println("狗啃骨头");
  }
  
}

abstract class Duck extends Animal{
  // 鸭子子类也抽象了
  // 但是鸭子不能实例化，再下duck的子类来使用

}

class Duck_son extends Duck{
  // 也要下父类的父类的抽象方法eat
  public void eat(){
    System.out.println("唐老鸭吃饭");
  }
  
}





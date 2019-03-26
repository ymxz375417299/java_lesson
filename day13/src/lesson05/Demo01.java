


/**
 * 结论：
 * 如果一个类，即继承抽象类，又实现接口，最好不要用多台的写法
 * 如果是多态的写法，接口的方法不能被调用, 因为多态中，成员变量是编译看左边，运行看右边的，那编译的过程就不能调用Cat方法了sleep()了
 */
public class Demo01 {

  public static void main(String[] args) {
    //# 练习抽象类与接口综合案例
    //
    //动物类： 姓名， 年龄 ， 吃饭， 睡觉
    //猫和狗
    //动物培训接口： 调高

    // 使用多态来用类
    // Animal cat = new Cat(); // 多态，抽象类指向子类对象，但是有问题，jump方法不能调用，因为多态中，成员变量是编译看左边，运行看右边的，那编译的过程就不能调用Cat方法了sleep()了
    // JumpInterface cat = new Cat(); // 也是多台的写法因为JumpInterface 相当于是接口的父类， 接口自画像子类对象 ，但是也有问题，Animal的成员方法就不能用了
    Cat cat = new Cat();
    cat.name = "小花";
    cat.age = 1;
    cat.eat();
    cat.sleep();
   //* 如果是多态的写法，接口的方法不能被调用, 
    cat.jump();

    System.out.println("==========");
    Animal dog = new Dog();
    dog.name = "小黑";
    cat.age = 10;
    dog.eat();
    dog.sleep();

  }

}


// 抽象类
// 抽象类声明的是共同的属性和方法
abstract class Animal{
  String name;
  int age;
  // 抽象方法
  public abstract void eat();
  public abstract void sleep(); 
}


class Cat extends Animal implements JumpInterface{
  @Override
  public void eat(){
    System.out.println("猫吃鱼");
  
  }

  @Override
  public void sleep(){
    System.out.println("猫睡觉");
  }

  @Override
  public void jump(){
    System.out.println("猫跳火圈");
  
  }

}

class Dog extends Animal{
  @Override
  public void eat(){
  
    System.out.println("狗坑骨头");
  }

  @Override
  public void sleep(){
    System.out.println(" 狗睡觉"); 
  }

}


// 跳高不是共性，所以声明到一个接口中，不放抽象类
interface JumpInterface{
  public void jump();
  
}




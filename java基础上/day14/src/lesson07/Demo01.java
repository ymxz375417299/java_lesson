package lesson07;

public class Demo01 {
  public static void main(String[] args) {

    // ### 1. 匿名内部类的格式和理解
    // 匿名内部类就是内部类的简化写法
    // ### 2. 写匿名内部类前提是存在一个抽象类或者接口
    // ### 3. 匿名内部类格式：
    //    new 抽象类或者接口名(){重写方法；}
    //
    //        ### 4. 匿名内部类本质是什么呢？
    //        是一个继承了该类或者实现了该接口的子类匿名对象
    //
    //        ### 5. 匿名内部类的特点
    //        - 匿名内部类必须实现接口的所有方法
    //        - 匿名内部类必须实现抽象类的所有方法
    //
    //        ### 6. 匿名内部类的方法调用
    //        像普通对象一样，调用方法即可}
    //
    //
    Dog dog = new Dog();
    dog.eat();

    // 抽象类匿名内部类使用
    // 用法1
    // 这是一个匿名内部类，也是一个匿名对象
    // new即是创建一个对象。只是写法和创建类一样
    // 匿名内部类就相当于实现抽象类的子类，但是不给它起名
    new Animal() { // Animal声明成抽象类，本来是不能直接new创建实例化的
      // 因为写在main方法内的类，所以也属于内部类
      @Override // 重写
      public void eat() {
        System.out.println("猫类 ，吃鱼");
      }
      @Override
      public void sleep() {
        System.out.println("猫类吃鱼");
      }
    }.eat(); // 调用方法，但是有个问题。这样只能调用一个方法，想调用多个怎么办？ 在前面赋值个变量，这里的例子赋值Animal cat变量



    // 用法2
    // 起了名，所以这个不是匿名对象。而是抽象 匿名内部对象
    
    Animal cat = new Animal(){
      @Override // 重写
      public void eat() {
        System.out.println("猫类 ，吃鱼");
      }
      @Override
      public void sleep() {
        System.out.println("猫类吃鱼");
      }
      
    };
    cat.eat();
    cat.sleep();
  }
}

// 抽象类
abstract class Animal {
  public abstract void eat();
  public abstract void sleep();
}

class Dog extends Animal {
  @Override
  public void eat() {
    System.out.println("狗吃肉");
  }

  @Override
  public void sleep(){
    System.out.println("狗睡觉"); 
  }
}

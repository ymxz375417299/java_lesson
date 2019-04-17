package lesson17;

public class Demo01 {

  public static void main (String[] args) {
    
    //# 17.JDK8的新特性讲解
    //
    //### 接口中可以定义由方法体的方法
    //- 如果是非静态的，必须用default修饰
    //- 如果是静态的就不用了
    //- 
    //
    //### JDK1.8之前接口只能声明方法，不能有方法体{}，JDK1.8又可以了

    Dog dog = new Dog();
    dog.eat();

    // 静态的调用
    Animal.sleep();
    
  }
}



// 接口
interface Animal{
  // 1.8 之前只能声明方法，不能实现，即不能有方法体
  // public void eat();

  // jdk1.8 可以有方法体
  // - 非静态方法，必须用default修饰
  public default void eat(){
    System.out.println("吃饭");
  }

  // - 静态方法，可以直接写方法体
  public static void sleep(){
    System.out.println("睡觉");
  }
}


// 实现类
class Dog implements Animal{
}

package lesson01;

// 继承抽象类Animal
public class Dog extends Animal{
  // 重写抽象方法
  @Override
  public void eat(){
    System.out.println("狗啃骨头。。。");
  }

}


package lesson02;

import com.gyf.model.Dog;
import com.gyf.model.Pig;

public class Demo01 {
  public static void main(String[] args) {

    // 【简单工厂设计模式】
    // 创建对象，通过静态工厂类创建
    Dog dog = AnimalFactory.createDog();
    Pig pig = AnimalFactory.createPig();
    dog.eat();
    pig.eat();

  }
}

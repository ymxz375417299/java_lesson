package lesson02;

import com.gyf.model.Dog;
import com.gyf.model.Pig;

public class AnimalFactory {

  // 直接使用静态方法，创建类
  public static Dog createDog(){
    Dog dog = new Dog();
    return dog;
  }

  public static Pig createPig(){
    Pig pig = new Pig();
    return pig;
  }
}


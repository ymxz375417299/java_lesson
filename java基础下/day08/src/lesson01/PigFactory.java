package lesson01;

public class PigFactory extends AnimalFactory{
  // 重写工厂类的createAnimal
  @Override
  public Animal createAnimal(){
    // Pig工厂类返回Pig对象
    return new Pig();
  }

}


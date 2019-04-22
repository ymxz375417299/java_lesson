package lesson01;

// 继承父工厂
public class DogFactory extends AnimalFactory{
  // 狗工厂返回狗对象
  @Override
  public Animal createAnimal(){
    
    Dog dog = new Dog();
    // dog.setName("小黑");
    // dog.setColor("Black");
    return dog;
  }


}


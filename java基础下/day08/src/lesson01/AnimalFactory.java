package lesson01;

// 工厂类，改成接口和抽象类都可以
// 这里先用抽象
public abstract class AnimalFactory {
  // 声明抽象方法
  public abstract Animal createAnimal(); // 声明抽象类，生产动物对象
}


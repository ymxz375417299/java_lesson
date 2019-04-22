package lesson01;

public class Demo01 {

  public static void main (String[] args) {
    
    /**
     * ## 工厂设计模式【接口工厂】的概述和使用（了解）
     *    - 简单工厂模式， 之前学的Executors.newCachedTHreadPool(); 创建线程池就是简单工厂模式
     *
     *   ### 工厂方法模式概述
     *   - 工厂方法模式中抽象工厂类负责定义创建对象的接口，具体对象的创建工作由继承抽象工厂的具体类实现
     *   - 
     *   ### 优点
     *   - 客户端不需要在负责对象的创建，从而明确了各个类的职责
     *   - 如果有新的对象增加，值需要增加一个具体的类和具体的工厂类即可，不影响已有diamante
     *   - 后期维护容易，增强了系统的拓展性
     *
     *   ### 缺点
     *   - 需要额外的编写代码，增加了工作量
     */
    
    // [以前] 无设计模式的创建对象
    // Dog dog = new Dog();
    // dog.setName("小黑");
    // dog.setColor("Black)
    // 问题： 创建多个对象，每次都要重复创建实例，并重新复制变量。则非常繁琐
    //      而使用工厂模式，值需要把需要创建对象，初始化变量的代码放在该类的子工厂类就可以了
    // Pig pig = new Pig();
    // dog.eat();
    // pig.eat();

    //  [工厂设计模式] 
    // 1. 写一个父亲工厂类AnimalFactory.java
    //    - 专门负责生产对象
    //    - 是抽象或者接口，所以被子工厂继承
    //
    // 2. 写子工厂类DogFactory.java继承父工厂类 
    // 3. 写子工厂类PigFactory继承父工厂类 

    // 使用工厂方法模式创建对象
    // 实例化狗工厂对象
    DogFactory dogFactory = new DogFactory();
    Animal dog1 = dogFactory.createAnimal();
    dog1.eat();

  
    // 实例化猪工厂类的对象
    PigFactory pigFactory = new PigFactory();
    Animal pig1 = pigFactory.createAnimal();
    pig1.eat();



  }
}


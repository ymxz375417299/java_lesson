
public class Demo01 {

  public static void main(String[] args) {
    //# 好处
    //### 提高了代码的维护性（继承的保证）
    //例子： 在父类改一个属性不用每个子类都改属性
    //
    //### 提高了代码的拓展性（多态保证）
    //例子： 方法中使用父类为参数，来实现方法和属性调用
    Cat cat = new Cat();
    cat.name = "小花猫";
    // 如果一个方法的参数是类，应该穿这个类的对象，或者他的子类的对象
    // test1(cat);
    test(cat);



    Dog dog = new Dog();
    dog.name = "小黑狗";
    // test2(dog);
    test(dog);


  }
  //父类当做方法的参数
  public static void test(Animal animal){
    animal.say();

    //animal.country();// 假设传入的对象是cat,即（Animal animal = cat） , 是不能访问cat的特有属性country,因为多态中访问成员变量是编译和运行都是看左边的，即智能访问animal的属性，访问不了cat的属性


    //这个代码这样写不安全，因为动物是狗，狗就不能转成猫的类型
    // Cat cat = (cat)annimal;
    // System.out.println(cat.country);
  }
  

  // public static void test1(Cat cat){ // 用子类作为参数
    // cat.say();
  // }
//
  // public static void test2(Dog dog){ // 用子类作为参数
    // dog.say();
  // }

}


class Animal{
  String name;
  public void say(){
    System.out.println("动物");
  }
}


class Cat extends Animal{
  String conntry = "中国"; // 多态不能访问 
  public void say(){
    System.out.println(name);
  }

}


class Dog extends Animal{
  public void say(){
    System.out.println(name);
  }
}

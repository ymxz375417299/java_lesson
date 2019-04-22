
public class Demo01 {

  public static void main(String[] args) {

    Cat cat1 = new Cat();
    cat1.eat();


    // 其实抽象类就是多态，所以有多态的用法
    // 叫法：
    // 1. 父类指向子类对象
    // 2. 抽象类指向子类对象
    // 3. 抽象类指向实现类对象
    //
    Animal cat2 = new Cat();
    cat2.eat();
  }

}


abstract class Animal {
  public abstract void eat();
}


class Cat extends Animal{
  public void eat(){
    System.out.println("吃鱼");
  }


}

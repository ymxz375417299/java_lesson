
public class Demo01 {

  public static void main(String[] args) {

  }

}


abstract class Animal{
  String name;
  int age;
  public abstract void eat();

}


class Cat extends Animal{
  @Override
  public void eat(){
    System.out.println("毛吃鱼");
  }

  public void catchMouse(){
    System.out.println("猫抓老鼠");
  }

  
}


class Dog extends Animal{
  @Override
  public void eat(){
    System.out.println("够啃骨头");

  }

  public void lookhome(){
    System.out.println("狗看家。。。");
  }
}

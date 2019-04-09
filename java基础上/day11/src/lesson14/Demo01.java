
public class Demo01 {

  public static void main(String[] args) {
    // 猫狗案例（使用继承实现猫类和狗类）
    // 共有属性和行为
    //  属性：猫的颜色，退的个数
    //  行为：吃饭
    //
    //特有行为：
    //  猫特有行为： 抓老鼠catchMOuse
    //  狗特有的行为：看家lookHome

  }

}


class Animal{
  String color;
  int legs;

  public void eat(){
    System.out.println("次饭");
  }
}


class Cat extends Animal{

  public void cathMouse(){
    System.out.println("抓老鼠..");

  }
}

class Dog extends Animal{
  public void lookHome(){
    System.out.println("看家。。。");
  }
}

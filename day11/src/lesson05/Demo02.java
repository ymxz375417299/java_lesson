
public class Demo02 {

  public static void main(String[] args) {
    // 4. this 可以调用本类的构造方法
    Cat cat = new Cat();
    cat.say();


  }

}



class Animal{
  String name;
  int legs;

  public void say(){
    System.out.println("i'm " + name + ", i have " + legs + "legs！");
  }

}


class Cat extends Animal{
  // 无参 构造方法
  public Cat(){
    // 在无参的构造方法里调用有参的本类构造方法
    // this 可以调用本类的构造方法 this(..)
    this("小花", 4); // 因为this是指向本类， 所以this("小花", 4) 等于Cat("小花", 4) ,即调用的下面的有参构造方法，zk
  
  }


  // 有参构造方法
  public Cat(String name, int legs){
    this.name = name;
    this.legs = legs;
  }


}


public class Demo01 {

  public static void main(String[] args) {
    // 4. super 可以调用父类的构造方法super(..)
    
    // 第一种使用cat类的方式
    // Cat cat = new Cat(); // 如果子类实现了无参的构造方法，系统不在提供这个无参 的构造方法,所以需要给子类定义无参构造方法
    // cat.name = "小花";
    // cat.leg = 3;
    // cat.say();

    // 第二种使用cat类的方式
    // 但是这个方法，子类还是要重写有/无参构造方法
    Cat cat = new Cat("小黑hrock", 4);
    cat.say();

    // super可以调用父类的构造方法super(...)

  }

}



class Animal{
  String name;
  int legs;


  // 无参构造方法
  public Animal(){}

  // 构造方法
  public Animal(String name, int legs){
    this.name = name;
    this.legs = legs;
  }

  // say方法
  public void say(){
    System.out.println("我是" + name + "我有" + legs + "条腿");
  }
}

class Cat extends Animal{
  // 如果父类有参构造方法，没有声明无参构造方法，子类也会报错
  //无参构造
  public Cat(){}
  //有参构造
  public Cat(String name, int legs){
    // this.name = name; //疑问，默认this指向cat,但是cat是没有name属性的！ 这个时候，就会自动去父类找，所以this.name 也会访问父类的
    // this.legs = legs; //疑问，默认this指向cat,但是cat是没有name属性的！ 这个时候，就会自动去父类找，所以this.name 也会访问父类的
    //super可以调用父类的够高方法super(...)
    // super() //则调用无参构造方法
    super(name, legs); //super指向父类，所以super(name) 等同于Animal(name, legs) 即调用了有参的构造方法
  }

}

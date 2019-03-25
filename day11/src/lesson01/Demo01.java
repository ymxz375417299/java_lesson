
public class Demo01 {

  public static void main(String[] args) {
    // 
    // # Java类的继承特点
    // 1. Java 只支持单继承，不支持多继承（一个儿子只能有一个爹）
    // 2. 有些语言支持多继承，多继承的格式： extends 类1, 类2...
    // ### 3. Java 支持多层继承（继承体系）
    // - 如果想用这个体系的所有功能用最底层的类创建对象
    // - 如果想看这个体系的共性功能，看最顶层的类
    //

    // 如果想用这个体系的所有功能， 直接用嘴底层的类创建对象，即最底层的子类
    Son1 son1 = new Son1();
    System.out.println(son1.car);
    System.out.println(son1.money);


    // 如果想看这个体系的共性功能，看最底层的类
    Son1 son2 = new Son1();
    System.out.println("儿子用了：" + son2.money);
    
    Father1 father1 = new Father1();
    System.out.println("爸爸用了" + father1.money);


    GrandFather1 grandFather1 = new GrandFather1();
    System.out.println("爷爷用了：" + grandFather1.money);
    // grandFather1.car 错误，上一级是不能用下一级的属性的！


  }



}


// 爷爷
class GrandFather1{
  double money = 88888888.8;
}

// 爸爸
class Father1 extends GrandFather1{
  String car = "特斯拉";
}

class Father2{
  String house;
}


// 1. 1个子类只能有一个父类
// 2. 一个父类可以有多个子类
// class son1 extends Father1, Father2 // java不支持继承多个父类

class Son1 extends Father1{
  
}  


public class Demo01 {

  public static void main(String[] args) {

    // # final 修饰局部变量的特性
    // 1. 修饰**基本类型**， 是值不能被改变；
    // 2. 修饰**引用类型**，是地址值不能被改变，对象的属性还是可以改变的
    // 3. 修饰**引用类型**不能再new

    // 1. 修饰**基本类型**， 是值不能被改变；
    final int a = 10;

    // 2. 修饰**引用类型**，是地址值不能被改变，对象的属性还是可以改变的
    final Cat cat = new Cat("小花", 4) ;
    //cat = new Cat("小黑", 5); //报错， 修饰引用类型后，这个变量cat不能再指向其他内存地址，简单理解就是不能再new
    //但是对象的属性是可以改变，只是内存地址不能再改而已
    cat.name = "小黑xxxxx";
    cat.say();

  }

}



class Cat{
  String name;
  int legs ;

  public Cat(String name , int legs){
    super();
    this.name = name;
    this.legs = legs;
  }

  public void say(){
    System.out.println("i am " + name + " have " + legs + "legs");
  }
  
}

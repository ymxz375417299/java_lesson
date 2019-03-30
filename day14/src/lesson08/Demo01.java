package lesson08;

//
//匿名内部类在工作用的情况
//1. 一般很少自己生命匿名内部
//2. 用的比较多的是线程的匿名内部类
//
//
public class Demo01 {

  public static void main (String[] args) {
    Dog dog = new Dog();
    dog.jumpFireCircle();

    // 用法1， 
    // 这是一个匿名内部类，也是一个匿名对象
    new Animal(){
      @Override
      public void jumpFireCircle(){
      
        System.out.println("猫跳了1米的火圈");
      
      }
    
    }.jumpFireCircle();
    

    // 用法2，
    // 起了名，所以这个不是匿名对象。而是接口 匿名内部对象
    Animal cat = new Animal(){
      @Override
      public void jumpFireCircle(){
      
        System.out.println("猫跳了1米的火圈");
      
      }
    
    };

    cat.jumpFireCircle();

  }
}


interface Animal{
  // 跳火圈
  public void jumpFireCircle();


}


// 
// 以前的接口不能用
// 如何实现接口？
// 1. 写一个类实现
// 2. new一个接口的匿名内部类
//
class Dog implements Animal{
  @Override
  public void jumpFireCircle(){
  
    System.out.println("跳火圈");
  }

}

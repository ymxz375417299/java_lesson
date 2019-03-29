package lesson02;

public class Demo01 {
  public static void main (String[] args) {
    //# 私有内部类
    //1. 权限修饰符： private, default, protected, public
    //2. 类包含的元素：类的成员， 属性，方法， 内部类
    //3. 权限修饰符default表示同一个包可以访问
    //4. 私有private内部类无法在outer的外面创建内部类对象, 只能在包括内部类的外部类那里实例化对象
    //5. 如果是**私有的内部类**， 那么私有的内部类中的方法应该怎么调用？ 
    //    解决方法： 在外部类创建一个方法，在这个方法内实例化这个私有内部类，并执行内部类的方法
    //
    
    // 私有内部类不能创建内部类对象
    Outer outer = new Outer();
    outer.test1();
  }

}

class Outer{
  private int a = 12;
  
  private class Inner{
    public void test2(){
      System.out.println(a);
    }
  }
  
  //4. 私有private内部类无法在outer的外面创建内部类对象, 只能在包括内部类的外部类那里实例化对象
  public void test1(){
    System.out.println("我是外部类的方法， 创建内部类并执行内部类的test2方法");

    Inner inner = new Inner();
    inner.test2();

  
  }




}

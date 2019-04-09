package lesson03;

public class Demo01 {
  public static void main (String[] args) {
    // 
    // # 03.静态内部类讲解
    //
    // ### 1. 创建静态内部类对象语法==对比==默认内部类语法
    // - 创建静态内部类对象语法： 外部类名.内部类 对象名 = 外部类名。内部类对象;
    // ``
    // Outer.Inner inner = new Outer.Inner(); 
    // inner.test2();
    //
    // ```
    // - 创建默认内部类对象语法： 外部类名.内部类名 对象名 = 外部类对象.内部类对象
    // ``
    // Outer.Inner inner = new Outer().new Inner();
    // ```
    
    // ### 1. 创建静态内部类对象语法==对比==默认内部类语法
    // 因为对象方法（非静态）是放在堆区的，调用前。必须先new创建对象来调用
    Outer.Inner inner = new Outer.Inner();
    inner.test2();

    //3. 调用内部类的静态方法
    // 因为静态方法是放在方法区里面的，直接调用即可
    Outer.Inner.test1();

  }

}

class Outer{
  static int a = 10086;

  // 静态内部类
  static class Inner{
    
    // 内部类的对象方法
    public void test2(){
      //静态只能访问静态。之前学过。所以Outer的成员变量的a,需要时静态才能访问
      System.out.println(a);
    
    }

    // 调用内部类的静态方法
    public static void test1(){
      System.out.println("内部类的静态方法");
    
    }
  }

}


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
    
    Outer.Inner inner = new Outer.Inner();
    inner.test2();

  }

}

class Outer{
  static int a = 10086;

  // 静态内部类
  static class Inner{
    
    public void test2(){
      //静态只能访问静态。之前学过。所以Outer的成员变量的a,需要时静态才能访问
      System.out.println(a);
    
    }
  }

}


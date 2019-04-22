package lesson05;

public class Demo01 {
  public static void main (String[] args) {
    Outer outer = new Outer();

    outer.test1();
    

  }

}


// 问题： 局部内部类在访问他所在的方法中的局部**变量**必须用finnal 修饰，为什么？
// 答： JDK1.8 不加final 代码不会报错，但是1.7以下的就会报错
class Outer{
  // 对象方法
  public void test1(){
    int a =10; // 局部变量 // 为了和其他版本兼容，局部内部类要访问的局部变量必须final(常量)修饰

    class Inner{ //局部内部类 // 
      public void test2(){ // 内部类的方法
        System.out.println(a); // 如果是
      
      }
    }

    Inner inner = new Inner(); //实例化局部内部类
    inner.test2();
  
  }
}

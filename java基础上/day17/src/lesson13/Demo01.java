package lesson13;


/** 掌握：
* 1. finalize方法作用： 当对象从内存消失时，会调用
* 2. System.gc的方法几乎不用，因为java中垃圾的回收不需要程序员去管理，是由java垃圾回收机制管理hh
*/
public class Demo01 {
  public static void main (String[] args) {
    //# System类的概述
    //System类包含一些有用的类字段【也叫静态属性】和方法。 它不能被实例化。
    //
    //### 成员方法
    //- public static void gc() // 运行垃圾回收
    for (int i = 0; i < 10; i++){
    
      // new 香烟
      new Cigarette();
      System.gc(); // 只要创建对象，我就回收一个对象
    }
    //- public static void exit(int statics) // 
    //- public static long currentTimeMillis()
    //- public static void arraycooy(Object src, int srcPos, Object dest, int destPos, int )
    
    System.out.println("hah ");
  }

}



// Cigerette 香烟
class Cigarette{
  // finalize: 当 对象从内存消失时，会调用
  @Override
  protected void finalize() throws Throwable{
    System.out.println(this + "对象从内存消失了");
  
  }

}

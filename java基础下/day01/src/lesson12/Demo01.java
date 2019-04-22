package lesson12;

public class Demo01 {
  public static void main(String[] args) {
    // # finally关键字的面试题
    // ### 1. final, finally和finalize的区别
    // - final可以修饰类，不能被继承；修饰方法，不能被重写，修饰变量，只能赋值一次
    // - finnal是try语句中一个与具体，不能单独使用，用来释放资源
    // - finalize是一个方法，当垃圾回收器 确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法
    //
    //
    // ### 2. 如果catch里面又return语句，请问finally的代码还会执行吗？ 如果会， 请问是在return前还是return后
    // )

    // 1. finnal类
    // String s;
    // Integer i ;

    // 2. finnally 一定要和try...catch一起使用
    try {
      int i = 10 / 0;
    } catch (Exception e) {
      System.out.println("报错了");
    } finally {
      System.out.println("一定指定的finally代码块");
    }

    // - finalize是一个方法，当垃圾回收器 确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法
    for (int i = 0; i < 10; i++) {
      new Person(); // 在堆区创建对象，但是没有被变量引用
      System.gc(); // 回收没有引用的对象。 即会立刻回收Person.从而调用Person类的finalize的方法
    }
  }
}

class Person {
  // 当对象从内存中释放是会调用
  @Override
  protected void finalize() throws Throwable {
    System.out.println("对象从内存释放...");
  }
}

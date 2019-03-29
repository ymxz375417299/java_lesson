package lesson15;

public class Demo01 {
  public static void main(String[] args) {
    //
    // ### 成员方法的配合使用
    // - public static
    // - public abstract
    // - public final
    // -
    // ### 成员变量： public static finnal
    // 为什么成员变量是final常量的时候需要static?
    // 因为既然是常量，不能被修改，那直接声明静态提升性能，不用每次使用都new，占内存
    //

  }
}

abstract class A {
  // 公共静态常量
  public static final int MAX_INI = 100;
  // 这个方法任何人都能访问，使用静态方法访问
  public static void test1() {

    System.out.println("text1");
  }

  // 这个方法是公用。需要子类实现
  public abstract void test2();

  // 这个方法也是公共，任何人都能访问，但是不能被子类继承
  public final void test3() {
    System.out.println("test3");
  }
}

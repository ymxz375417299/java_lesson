package lesson03;

public class Demo01 {
  public static void main(String[] args) {

    // 自己处将该问题/异常处理方法
    /** 方式一： try...catch（捕获） */

    // java.lang.ArithmeticException: /算数异常
    try {
      int a = 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println(e.getClass());
      System.out.println("算数异常： 除数不能为0");
    }
  }
}

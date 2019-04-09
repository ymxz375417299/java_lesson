package lesson02;

public class Demo01 {
  public static void main (String[] args) {
    // ### JVM虚拟机默认是如何处理异常
    // main函数收到异常会有两种处理方法会
    // 1. 自己将该问题处理，然后继续运行【try-catch】 ==后面学==
    // 2. 自己没有针对的处理方式，只有交给调用main的jvm虚拟机来处理
    //
    // jvm有一个默认的异常处理机制，就将该异常进行处理，并将该异常的名称，异常的信息，异常 出现的位置 打印在控制台上，同时程序停止运行
    int[] arr = {2, 3, 4, 5};
    System.out.println(arr[0]);
    //ArrayIndexOutOfBoundsException 数据越界异常
    // System.out.println(arr[4]);
    
    // 2. 空指针异常
    arr = null;
    //java.lang.NullPointerException 
    // System.out.println(arr[0]);

    // 3. 类型转换异常
    // Object s = "abc";
    // Integer i = (Integer) s;

    // Rasndom r = (String)s;


    // 一旦程序出现异常，后面的代码的不会执行了
    System.out.println("========");

  }

}


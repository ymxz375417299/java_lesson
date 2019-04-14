package lesson02;

public class Demo01 {
  public static void main (String[] args) {
    /** JVM启动是多线程的吗？【面试题】
    * 1  JVM启动至少启动了垃圾回收线程和主线程，所以是多线程
    * 2 main方法的代码执行的位置就是主线程（路径）
    * 3 一个进程有多个线程
    * 4 finalize()这个方法在子线程中执行的（Finalizer 垃圾回收线程）
    */
    System.out.println("AAAAA");
    System.out.println("BBBBBB");
    System.out.println("CCCCCCC");
    System.out.println("DDDDDD");
    
    // 打印线程名称
    System.out.println("main的线程 " + Thread.currentThread()); // 打印主线程

    // 创建Student后立刻回收
    for(int i = 0; i < 2; i++){
      new Student();
      // 手动开启垃圾回收
      System.gc();
    }
  }

}



class Student{
  // 被垃圾回收器回收时，会调用
  // 对象从内存释放时，会被调用
  @Override
  protected void finalize() throws Throwable{
    System.out.println("============");
    System.out.println("Student 被回收了");
    System.out.println("打印一下线程。看下和主线程有什么不同");
    System.out.println(Thread.currentThread());
  }
}


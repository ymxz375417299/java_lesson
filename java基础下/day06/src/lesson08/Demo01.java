package lesson08;

public class Demo01 {
  public static void main(String[] args) {

    /**
     * ### 08.获取当前线程的对象(掌握)讲解 - Thread.currentThread(), 主线程也可以获取 -
     * Thread.currentThread().setName("我是主线程"); 设置当前线程名称 -
     * Thread.currentThread().getClass().getName(); 获取线程类名
     */

    // 打印主线程的类型
    System.out.println("主线程" + Thread.currentThread().getClass());
    // 开启子线程
    MyThread mt = new MyThread();
    mt.start();
  }
}

class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("任务。。。");
    Thread subThread = Thread.currentThread();
    System.out.println(subThread);
    // 打印当前线程对象的类
    System.out.println(subThread.getClass());
    // 打印类名
    System.out.println(subThread.getClass().getName());
  }
}

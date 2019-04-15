package lesson06;

public class Demo01 {

  public static void main(String[] args) {
    // 06.匿名内部类实现线程的两种方式讲解

    /** 实现线程2种方式 1 继承Thread 2 实现Runnable 接口 */

    // 匿名内部类写法1
    Thread t1 =
        new Thread() {
          @Override
          public void run() {
            System.out.println("任务1.。。" + Thread.currentThread());
          }
        };
    t1.start();

    // 简写
    new Thread() {
      @Override
      public void run() {
        System.out.println("任务2..." + Thread.currentThread());
      }
    }.start();

    // 匿名内部类写法2 ，传入Runnable 的匿名内部类
    Thread t2 =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                System.out.println("任务3。。。" + Thread.currentThread());
              }
            });
    t2.start();

    // 简写
    new Thread(
            new Runnable() {
              @Override
              public void run() {
                System.out.println("任务4.。。" + Thread.currentThread());
              }
            })
        .start();
  }
}

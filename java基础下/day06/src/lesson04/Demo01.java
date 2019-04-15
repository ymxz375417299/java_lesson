package lesson04;

public class Demo01 {

  public static void main(String[] args) {
    /**
     * ## 使用步骤
     * ### 1 定义类实现Runnable接口
     * ### 2 实现run方法
     * ### 3 把新线程要做的事情写在run方法汇总
     * ### 4 创建自定义的Runnable的子类对象
     * ### 5 创建Thread对象，并传入Runnable对象
     * ### 5. 调用start()开启新线程，内部会自动调用Runnable的run()方法
     */

    // 1. 创建Runnable对象
    BankTask task = new BankTask();

    // 2. 创建Thread对象
    Thread t1 = new Thread(task);

    // 3. 启动线程
    t1.start();

    // 4. 开启第二个线程
    Thread t2 = new Thread(task);
    t2.start();
  }

}

class BankTask implements Runnable {
  @Override
  public void run() {
    System.out.println("支付宝到账1万元！" + Thread.currentThread());
    System.out.println("当前线程名" + Thread.currentThread().getName());
  }
}

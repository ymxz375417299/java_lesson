package lesson03;

public class Demo01 {

  public static void main (String[] args) {
    // 线程的实现方式（1） - 继承Thread

    // # 03.线程实现的方式 (1) - 继承Thread讲解
    //
    // ## 使用步骤
    //
    // ### 1 定义类继承Thread
    // ### 2 重写run方法
    // ### 3 把新县城要做的事情写在run方法中
    // ### 4 创建线程对象
    // ### 5 开启新县城，内部会自动执行run方法)


    // 使用子线程
    /**
     * 主线程， 程序员是不能创建的！
     * 程序员只能穿件子线程
     */

    // 1. 创建子线程对象
    MyThread t1 = new MyThread();
    /** 不能通过下面的方式来执行任务
     * 因为这种方式的任务是使用主线程执行run方法*/
    // t1.run();  // 错误方法
    
    /** 2 正确的执行任务方式，调用star他，内部会 开启新线程，调用run方法*/
    t1.start();

    // 3. 再创建子线程
    MyThread t2 = new MyThread();
    t2.start();

    // 5 循环调用子线程
    for (int i = 0 ; i < 10; i++){
      MyThread th = new MyThread();
      th.start();
      System.out.println(th.getName());
      
      
    }
  }
}


class MyThread extends Thread{
  @Override
  public void run(){
    System.out.println("银行信用卡还款短信任务。。。" +Thread.currentThread());
  }


}

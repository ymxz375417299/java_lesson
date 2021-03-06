package lesson07;

public class Demo01 {

  public static void main (String[] args) {
    /**
     * ![image](D143E136E3044B2681DD694918CECCEB)
     *
     *
     * # 两个线程间通讯（掌握）
     * ### 什么时候需要通讯
     * - 多个线程并发执行时，在默认情况下CPU是随机切换线程的。
     *   - 如果我们希望他们又规律的执行，就可以使用通讯， 例如： 每个线程执行一次打印
     *   - 
     *
     *   ### 怎么通讯？
     *   - 如果希望线程等待，就调用wait()
     *   - 如果希望唤醒其他等待中的线程，就调用notify();
     *   - ==这两个方法必须在同步代码中执行，并且使用同步锁对象来调用==
     *   - 
     *
     *   ### 案例： 线程任务的顺序执行
     */

    // 1. 实例化任务对象
    MyTask task = new MyTask();

    // 2. 开启两个线程执行2个任务
    // 线程1
    new Thread(){
      @Override
      public void run(){
        while(true){
          try{
            task.task1();
          }catch(InterruptedException e){
            e.printStackTrace();
          }
        }

      }
    }.start();

    // 线程2
    new Thread(){
      @Override
      public void run(){
        while(true){
          // 因为定义的类，会往抛出异常，所以这里需要捕获异常
          try{
            task.task2();
          }catch(InterruptedException e){
            e.printStackTrace();
          }
          // 加个睡眠时间
          try{
            Thread.sleep(10);
          }catch(InterruptedException e){
            e.printStackTrace();
          }
        }

      }
    }.start();
  }

}


class MyTask{
  // 标志 1: 可以执行1， 2： 可以执行任务2
  int flag = 1;
  public synchronized void task1() throws InterruptedException{ // 抛出异常，外面需要接受一下
    // 不为1 ，则线程等待
    if (flag != 1){
      this.wait();//线程等待 // 需要抛出异常
    }
    System.out.println("1. 银行行用卡自动还款任务。。。");
    flag = 2;
    this.notify(); // 唤醒其他正在等待的线程
  }
  public synchronized void task2() throws InterruptedException{
    if (flag != 2){
      this.wait(); // 线程等待
    }
    System.out.println("2. 银行还款成功！ ");
    flag = 1;
    this.notify(); // 唤醒其他正在等待线程等待

  }
}

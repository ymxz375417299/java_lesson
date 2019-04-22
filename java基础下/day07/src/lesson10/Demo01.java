package lesson09;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo01 {

  public static void main (String[] args) {
    /**
     * ![image](B1157A3631ED4B5D8021F2E2DB15AFAB)
     *
     * # 同步加锁
     * - 使用ReentranLock类[互斥锁]的lock() 和unlock()方法进行同步
     *
     *   ### 通讯
     *   - 使用ReentrantLock类的newCondition()方法可以获取Condition对象
     *   - 需要等待的时候使用Condition的await()方法，唤醒的时候用sinal()方法
     *   - ==不同的线程使用不同的Condition,这样就能区分唤醒的时候找哪个线程了==
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
        }
      }
    }.start();

    // 线程3
    new Thread(){
      @Override
      public void run(){
        while(true){
          try{
            task.task3();
          }catch(InterruptedException e){
            e.printStackTrace();
          }
        }
      }
    }.start();
    
  }
}



/** 
 * 互斥锁的使用步骤
 * 1 创建互斥锁的对象
 * 2 创建3个（多少个线程就使用多少个）Condition
 * 3 加锁，解锁（指定代码）
 * 4 线程等待 Condition的await方法
 * 5 指定线程（Condition对象）的signal唤醒
 *
 */
class MyTask{
  // 创建互斥锁对象
  ReentrantLock r1 = new ReentrantLock();
  // 创建3个Condition对象
  // 有多少个线程就创建多少个
  Condition c1 = r1.newCondition();
  Condition c2 = r1.newCondition();
  Condition c3 = r1.newCondition();


  // 标志 1: 可以执行1， 2： 可以执行任务2
  int flag = 1;
  public void task1() throws InterruptedException{ // 抛出异常，外面需要接受一下
    r1.lock();// 加锁
      // 不为1 ，则线程等待
      if (flag != 1){
        c1.await(); // Condition 对象c1等待
      }
      System.out.println("1. 银行行用卡自动还款任务。。。");
      flag = 2;
      c2.signal(); // 指定Condition对象c2唤醒
    r1.unlock(); // 解锁
  }

  public void task2() throws InterruptedException{
    r1.lock(); // 上锁
      if (flag != 2){
        c2.await(); // Condition 对象c2等待
      }
      System.out.println("2. 银行还款成功！ ");
      flag = 3;
      // 唤醒线程3
      c3.signal(); // 指定Condition对象c3唤醒
    r1.unlock(); // 解锁
  }

  public void task3() throws InterruptedException{
    r1.lock(); // 上锁
      if (flag != 3){
        c3.await(); // Condition 对象c3等待
      }
      System.out.println("3. 短信提醒任务");
      flag = 1;
      // 唤醒线程1
      c1.signal();
    r1.unlock(); // 解锁
  }
}


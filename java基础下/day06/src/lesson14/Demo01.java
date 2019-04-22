package lesson14;

public class Demo01 {

  public static void main (String[] args) {
    // 同步代码块和同步方法

    // 火车站卖票
    /**
     * 湖南到广州火车票： 今天13:00 的只有100张票
     * 火车站有4个窗口在同时卖票（并行）
     * 【问题】 保证一张票只能被卖一次
     *
     * 需求：
     * 1 4个线程表示4个窗口
     *
     * 问题： 同一张票被不同的用户购买了
     * 解决： 
     * 通过加锁可以解决被重复购买的问题
     */

    // 创建卖票的线程
    TicketTask task = new TicketTask(); 
    // 窗口1
    Thread t1 = new Thread(task);
    t1.setName("窗口A");
    // 窗口2
    Thread t2 = new Thread(task);
    t2.setName("窗口B");
    // 窗口3
    Thread t3 = new Thread(task);
    t3.setName("窗口C");
    // 窗口4
    Thread t4 = new Thread(task);
    t4.setName("窗口D");
    
    // 开启线程
    // 【问题：】 相同的票号被重复购买！
    t1.start();
    t2.start();
    t3.start();
    t4.start();

  }
}


// 卖票任务的类
class TicketTask implements Runnable{
  // 只有100张票
  int ticket = 100; 


  // @Override
  // public void run(){
    /**
     * 同步代码块, 保证同步代码块内的代码同步
     * synchronized参数： this是锁对象，可以传任意对象,
     * (this) this指的传入的task对象本身,同一把锁
     * 必须同一把锁，让不同线程强，才能保证线程安全
     */
    // synchronized(this){
      // 卖票
      // while (true){
        // if (ticket <= 0){
          // System.out.println("不好意思，票已经卖光了");
          // break;
        // }else{
          // System.out.println(Thread.currentThread().getName() + ": 恭喜买到票了！， 票号：" + ticket);
          // ticket --;
        // }
      // }
    // }
  // }


  // 上面的 锁的代码太多,连while循环也锁了。导致，第一个线程抢占了。其他线程都等这个线程while循环结束后才解锁,导致的问题就是 谁抢到锁就谁一直卖票
  // 这里的锁写在while内
  @Override
  public void run(){
    /**
     * 同步代码块, 保证同步代码块内的代码同步
     * synchronized参数： this是锁对象，可以传任意对象,
     * (this) this指的传入的task对象本身,同一把锁
     * 必须同一把锁，让不同线程强，才能保证线程安全
     */

    // 卖票
    while(true){
      synchronized(this){
        if (ticket <= 0){
          System.out.println("不好意思，票已经卖光了");
          break;
        }else{
          System.out.println(Thread.currentThread().getName() + ": 恭喜买到票了！， 票号：" + ticket);
          ticket --;
        }
      }
    }
  }
}

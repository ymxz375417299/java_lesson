package lesson01;

public class Demo01 {

  public static void main (String[] args) {
    // 同步代码块和同步方法

    // 火车站卖票
    /**
     * # 线程锁的参数
     * - 可以任意一个参数，this ，new对象， class字节码
     *   - 锁： this，代码当期那对象
     *   - 锁： 如果new 对象， 就不是同一把锁
     *   - 锁： 字节码对象。如String.calss ,因为内存只有一个字节码对象
     *   - 开发中，一般都是用this
     *   - 
     *
     *   ### 同步代码块
     *   在方法内部声明synchronized 就是同步代码块
     *
     *   ### 同步方法 
     *   在声明方法时声明synchronize关键字 是同步方法
     *
     *  前面同步代码块我们会传入this或者class字节码对象，指向同一把锁，但是这里，同步方法，没有传参，怎么制定同意吧锁
     * 其实它内部有个默认值
     * - 如果是非静态方法，锁就是this
     *   - 如果是静态方法，锁就是该类的字节码对象 xxx.class
     *
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

  // 静态同步方法
  // 这里的锁就是所在类对象的字节码对象即TicketTask.class 字节码对象
  public static synchronized void test1(){
    
  }
  // 非静态同步方法 
  @Override
  public synchronized void run(){
    /**
     * 这里同步方法的锁就是this
     */

    // 卖票
    while(true){
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

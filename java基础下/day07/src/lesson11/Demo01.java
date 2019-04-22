package lesson11;

/**
 * 掌握
 * 1 如何获取一个线程所属的线程组
 * 2 如何在创建一个子线程时，设置它所属的线程组
 */

public class Demo01 {

  public static void main (String[] args) {
    // 线程组的概述和使用（了解）
    /**
     * # 线程组的概述和使用（了解）
     * ### 1 Java中使用ThreadFGroup来表示线程组，它可以对一批线程进行分类管理，Java允许程序直接对线程组进行空
     * ### 2 默认情况下，所有线程都属于**主线程组**
     * - public final ThreadGroup getThreadGroup() // 通过线程对象获取他所属的组
     *   - public final String getName() // 通过线程对象获取他组的名字
     *
     *   ### 3 我们也可以给线程设置分组
     *   - ThreadGroup(String name)创建线程组对象并给其赋值名字
     *   - 创建线程对象
     *   - Thread(ThreadGroup?group, Runnable?target, String?name)
     *   - 设置整组的又相继和守护线程
     */
    
    Thread mainThread = Thread.currentThread();
    /**
     * Thread[main,5,main]
     * main: 线程名称
     * 5： 代表优先级
     * main: 当前线程所属的组名
     */
    System.out.println(mainThread);
    
    // 获取线程的“线程组”对象
    ThreadGroup tg = mainThread.getThreadGroup();
    System.out.println("线程组：" + tg.getName());

    // 创建一个子线程
    Thread t1 = new Thread(){
      @Override
      public void run(){
        System.out.println("线程A....");
      }
    };
    // t1.start();
    System.out.println("子线程的线程组：" + t1.getThreadGroup().getName());

    // 创建一个线程组
    ThreadGroup abcGroup = new ThreadGroup("abc组"); // 创建 线程组，并命名为abc组
    // 创建子线程组对象
    Thread t2 = new Thread(abcGroup, new Runnable(){
      @Override
      public void run(){
        System.out.println("线程B");
      }
    });

    System.out.println("子线程组的线程组：" + t2.getThreadGroup().getName());

  }
}



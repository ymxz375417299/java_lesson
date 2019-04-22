package lesson06;

import java.util.Date;

import java.util.Timer;
import java.util.TimerTask;

public class Demo01 {

  public static void main (String[] args) {
    /**
     * ![image](10E9E74A8F3D46559D362174BBE0A4B9)
     *
     *
     * # Timer(计时器， 定时器)
     * 一共工具，用于在后台线程中执行的任务。可安排任务执行一次，或者定时重复执行
     *
     * ### 方法
     * - public void schedule(TimeTask task, long delay)
     *   - public void schedule(TimeTask task, long delay, long period)
     *    // 指定时间 执行任务
     *   - public void schedule(TimeTask, Date firstTime, long period)
     */


    // 1. 创建定时器
    Timer timer = new Timer();

    // 3秒后执行任务，每隔两秒重复执行
    timer.schedule(new TimerTask(){
      int count = 5; // 不能写在main的属性,因为mian方法自动会加final修饰
      @Override
      public void run(){
        System.out.println("任务A..." + count + "..."+ new Date());
        count --;
        if (count == 0){
          // 取消定时器
          timer.cancel();
        } 
      }
    }, 3000, 2000);
    // 取消定时器
    // timer.cancel(); // 这样写，定时器是会不执行，直接关闭的，因为这里是主线程，定时器是子线程开启的，所以子线程还没执行就被主线程关闭了



  }
  /**
   * 1 3秒后执行一次任务
   * 2 任务执行完成后，程序没有退出
   */
  public static void test1(){
    Timer timer = new Timer();
    timer.schedule(new TimerTask(){
      @Override
      public void run(){
        System.out.println("任务A");
      }

    }, 1000);
  }

  /** 3秒后执行任务，每隔两秒重复执行*/
  public static void test2(){
    // 1. 创建定时器
    Timer timer = new Timer();

    timer.schedule(new TimerTask(){
      @Override
      public void run(){
        System.out.println("任务A..." + new Date());
      }
    }, 3000, 2000);
  }
}


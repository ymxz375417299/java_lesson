package lesson13;

import java.util.concurrent.Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01 {

  public static void main (String[] args) {
    /**
     *
     * ### 内置线程池的使用概述
     * #### JDK5新增了一个Executors工厂类来产生线程池，有如下几个方法
     * - public static ExecutorService newFIxedThreadPool(int nThreads)
     *   - public static ExecutorService newSingleThreadExcutor()
     *   - 这些方法的犯规之是ExecutorService对象，该对象表示一个线程池，可以执行Runnable对象或者Callable对象代表的线程，它提供了如下方法
     *   - Future<?> submit(Runnable task)
     *   - <T> Future<T> submit（Callable<T> task)
     *
     *   ### 使用步骤
     *   1 创建线程池对象
     *   2 创建Runnable实例
     *   3 提交Runnable实例
     *   4 关系线程池
     */

    // 之前的开启10个线程完成10个洗车任务
    // for (int i =  0; i  < 10; i++){
      // new Thread(){
        // @Override
        // public void run(){
          // System.out.println("洗车任务" + Thread.currentThread());
        // }
      // }.start();
    // }
    
    // 案例： 创建5个线程的线程池，完成10个洗车的任务！
    // 1. 创建线程池
    ExecutorService es = Executors.newFixedThreadPool(5);

    // 2. 添加任务方式一
    // 像线程池传入Runnable线程对象
    for(int i = 0; i < 10; i++){
      // 给线程池提交 Runnable线程
      es.submit(new Runnable(){
        @Override
        public void run(){
          System.out.println("洗车任务1" + Thread.currentThread());
        }
      });
    }

    // 3. 添加任务-方式3
    /**Callable是一个接口， 需要类实现
     * 这个接口。需要制定泛型，而且有返回值，Runnable是没有返回值的
     * 重写的是call()方法
     */
    for (int i = 0; i < 10; i ++){
      es.submit(new MyTask());
    }
    es.shutdown(); // 关闭线程池
  }
}


class MyTask implements Callable<Integer>{
  @Override 
  public Integer call() throws Exception{

    System.out.println("洗车任务2" + Thread.currentThread());
    return 110;
  }


}

package lesson09;

public class Demo01 {

  public static void main (String[] args) {
    /**
     * ![image](910B7C9A3F1E40D9993943F3AF1A52F4)
     *
     * ## 线程休眠（掌握)
     * - Thread sleep(毫秒), 控制当前线程休眠若干毫秒
     *   - 1秒 = 1000毫秒
     *   - 1秒 = 1000毫秒 * 1000微秒 * 1000 纳秒
     */
    
    // 主线程休眠
    // test();

    
    // 创建子线程休眠（使用匿名内部类)
    new Thread(){
      @Override
      public void run(){
        for (int i = 0; i < 10; i++){
          System.out.println(Thread.currentThread() + " " + i);
          try{
            Thread.sleep(1000);
          }catch(InterruptedException e){
            e.printStackTrace();
          }
        }
      }
    }.start();

    // 结果会先执行AAA,再执行上面的子线程！ 为什么？？
    // 因为子线程是不会阻塞主线程休眠
    // 
    System.out.println("AAAAAAAAAAAAAAAAAAA");
  }

  /**
   * 主线程休眠
   */

  public static void test(){
    for (int i = 0; i < 10; i++){
      System.out.println(Thread.currentThread() + " " + i);
      // 使用sleep会有报异常的可能
        // 处理1. 直接抛出
        // 处理2. try..catch
      try{
        Thread.sleep(1000); // 在主线程休眠
      }catch(InterruptedException e){
        e.printStackTrace();
        
      }
    }

  }
}


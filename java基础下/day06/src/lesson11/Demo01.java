package lesson11;

public class Demo01 {

  public static void main (String[] args) {
    
    //### 守护线程
    //- setDaemon(), 设置一个线程为守护线程，该线程不会单独执行，当其他非守护线程都执行结束后，自动退出

    // 女线程
    Thread t1 = new Thread(){
      @Override
      public void run(){
        for (int i = 0; i < 5; i++){
          System.out.println("线程-女" + i);
          try{
            Thread.sleep(10); //睡眠10毫秒

          }catch(InterruptedException e){
            e.printStackTrace();
          }
        }
      }
    }; // 不能又赋值线程给t1, 而内部类直接.start(); 因为start是没有返回值，不能复制

    t1.start();

    // 男线程
    Thread t2 = new Thread(){
      @Override
      public void run(){
        for (int i = 0; i < 15; i++){
          System.out.println("线程-男" + i);
          try{
            Thread.sleep(10);
          }catch(InterruptedException e){
            e.printStackTrace();
          }
        }
      }
    };
    // 设置t2男线程为守护线程
    // 设置为守护线程后，另一个线程如果提前结束，则守护线程t2也强制退出
    t2.setDaemon(true);

    t2.start();
  }
}


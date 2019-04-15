package lesson12;

public class Demo01 {

  public static void main(String[] args) {

    /** ### 加入线程 - join() ，当前线程暂停，等待**指定**的线程执行结束后，当前线程再继续 - join(int), 可以等待指定的毫秒后，继续执行 */
    Thread t1 =
        new Thread() {
          @Override
          public void run() {
            for (int i = 0; i < 100; i++) {
              System.out.println("线程A " + i);
              try {
                Thread.sleep(10);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
          }
        };
    t1.start();

    Thread t2 =
        new Thread() {
          @Override
          public void run() {
            for (int i = 0; i < 100; i++) {
              System.out.println("线程B " + i);
              if (i > 10) {
                try {
                  // 加入线程A
                  // t1.join(); // t2暂停，直到t1执行结束后，t2才继续执行
                  t1.join(50); // t2 暂停50毫秒，暂停结束后，t2线程才继续执行
                  Thread.sleep(10);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
              }
            }
          }
        };
    t2.start();
  }
}

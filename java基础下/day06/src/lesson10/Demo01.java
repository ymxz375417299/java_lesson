package lesson10;

public class Demo01 {

  public static void main (String[] args) {
    // 倒计时60秒

    // 1. 创建时间
    // final int seconds = 60;

    // 2. 开启倒计时 （使用匿名内部类）
    new Thread(){
      @Override
      public void run(){
        int seconds = 60;
        for (int i = seconds; i > 0; i--){
          System.out.println("剩余" + (i) + "秒");
          // 注意： 局部内部类访问局部变量，这个变量必须声明final 类型, 而final 又只能赋值一次！就不能seconds--,所以需要把seconds写在内部类里面 ,这个是个基础知识；
          // seconds --;
          try{
            Thread.sleep(1000);
          }catch (Exception e){
            e.printStackTrace();
          }
        }
      }
    }.start();
  }
}


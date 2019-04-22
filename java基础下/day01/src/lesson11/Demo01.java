package lesson11;

public class Demo01 {
  public static void main (String[] args) {
    // ### finaly关键字的特点及作用
    // #### finally的特点
    // 1. finally 的语句体一定会执行
    // 2. 特殊情况： 在执行到finally之前jvm退出了（比如System.exit(0))
    //
    // #### finally的作用
    // - 用于释放资源，在IO流操作和数据库操作中会见到
    
    try{
      int a = 10 / 0;
    }catch(ArithmeticException e){
      System.out.println("算术异常。。");
    }finally{
      // 因为不管报不报错都会执行，所以一般finally用来释放内存，不管报不报错。 
      // 特殊请： 如果执行了System.ext(0)   强制关闭虚拟机JVMk
      System.out.println("finally的代码块执行了。。。");
    }
  }

}


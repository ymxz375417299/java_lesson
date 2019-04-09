package lesson08;

public class Demo01 {
  public static void main (String[] args) {
    //# 08.Throwable有几个常用的方法
    //子类： Exception
    //
    //- getMessage(); 获取异常信息，返回字符串
    //- toString(); 获取异常类名和异常信息，返回字符串
    //- printStackTrace(); 打印异常类名和异常信息，已经异常出现在程序中位置
    
    try{
      int a = 10 /0;
    }catch(Exception e){
      System.out.println(e.getClass());
      System.out.println(e.getMessage()); // 异常描述属性
      System.out.println(e.toString()); // 异常类型+异常信息
      e.printStackTrace(); // 这个方法，打印异常类名，信息message, 出现的程序位置
      System.out.println("算术异常");
    }
    
  }

}


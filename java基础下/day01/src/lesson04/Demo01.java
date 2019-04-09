package lesson04;

public class Demo01 {
  public static void main (String[] args) {
    // 自己将该问题/ 异常处理方法
    /** 
     * 方式2： try...catch多个异常
     */

    try {
      
      int[] arr = {1, 2, 3};
      // System.out.println(arr[3]); // 数组越界异常

      // int a = 10 / 0;
      // System.out.println(a); // 会报错，报算数异常

      int[] arr1 = null;
      System.out.println(arr1[1]); // 
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("数组越界异常");
    }catch(ArithmeticException e){
      System.out.println("算数异常，分母不能为0");
    }catch(NullPointerException e){
      System.out.println("空指针异常");
    }
    
    System.out.println("....");
  }

}


package lesson05;

public class Demo01 {
  public static void main (String[] args) {
    // try...catch捕抓多个异常的另一写法
    // 使用 | 或语法，铺抓多个异常
    
    try {
      
      int[] arr = {1, 2, 3};
      System.out.println(arr[3]); // 数组越界异常

      int a = 10 / 0;
      System.out.println(a); // 会报错，报算数异常

    }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
      System.out.println(e.getClass());
      System.out.println("数组越界异常");
      System.out.println("或");
      System.out.println("算数异常，分母不能为0");
    }  

  }

}


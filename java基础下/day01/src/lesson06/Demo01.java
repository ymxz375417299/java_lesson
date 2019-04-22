package lesson06;

public class Demo01 {
  public static void main(String[] args) {
    // 多个异常的一个主意事项
    // 多个异常是，不能把Exception异常放在最前面，相当于Exception 是所有异常类的父类，先由子类处理，子类不能处理再交给父类异常

    try {
      // 1. 有可能出现数组越界异常
      int[] arr = {1, 2, 3};
      System.out.println(arr[1]);

      // 2. 算术异常
      int a = 10 / 2;

      // 3. 空指针异常
      int[] arr1 = null;
      System.out.println(arr1[0]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("数据越界异常");
    } catch (ArithmeticException e) {
      System.out.println("算术异常");
    } catch (Exception e) {
      System.out.println("其他异常");
    }
  }
}

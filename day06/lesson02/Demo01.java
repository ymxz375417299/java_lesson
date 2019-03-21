
public class Demo01 {

  public static void main(String[] args) {
    // 数组概述和定义格式说明
      // 数组的作用： 用来存储同种数据类型的多个值
      // 数组的概念： 数组是存储同一种数据类型多个元素的集合。也可以看成一个容器。
      // 数组既可以存储“基本数据类型”， 也可以存储“引用数据类型”。
      // 数组定义格式：
        // 数据类型[] 数组名 = new 数据类型[数组的长度]
      int a = 1;
      int b = 2;
      int c = 3;

      int[] arr1 = new int[5];
      System.out.println(arr1);

      double[] arr2 = new double[5];
      System.out.println(arr2);
      
      char[] arr3 = new char[5];
      System.out.println(arr3);
      
  }

}


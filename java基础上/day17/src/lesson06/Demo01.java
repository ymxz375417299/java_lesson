package lesson06;

import java.util.Arrays;

public class Demo01 {
  public static void main (String[] args) {
    
    //# Arrays 类概述
    //1. 针对数组进行操作的**工具类**
    //2. 提供的方法都是**通过类方法调用**， 因为构造方法==被私有了==
    //3. 提供了排序，查找等功能
    //4. 查看API
    //
    //# 成员方法
    //1. public static String toString(int[] a)
    //2. public static void sort(int[] a)
    //3. public static int binarySearch(int[] a, int key)
    //
    //
    //### 强调：二分查找的返回值
    //如果他包含在数组中，则返回搜索键的索引； 否则返回(-(插入点) -1 )]]]


    int [] arr1 = {28, 12, 38, 11, 10};
    
    //toString方法 , 把数组转成固定格式的字符串
    System.out.println(Arrays.toString(arr1));

    //2. sort 排序
    Arrays.sort(arr1);
    System.out.println(Arrays.toString(arr1));

    //3. binarySearch 二分法检索，又称折半检索
    int index = Arrays.binarySearch(arr1, 28);
    System.out.println(index);

    //### 强调：二分查找的返回值
    //如果他包含在数组中，则返回搜索键的索引； 否则返回(-(插入点) -1 )]]]
    //
    //[10, 11, 12, 28, 38]
    //找88： -6
    //9： -1
    //30： -5
    //找不到的数字都会返回负值
    //返回的负值为，这个数应该放在哪个位置

  }

}


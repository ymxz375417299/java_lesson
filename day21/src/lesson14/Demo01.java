package lesson14;

import java.util.Arrays;
import static java.util.Arrays.sort; // 静态导入了类.方法
import static java.util.Arrays.binarySearch;

public class Demo01 {
  public static void main (String[] args) {
    //# 14.静态导入的概述和使用讲解
    //### 1. 静态导入概述
    //使用类（静态）方法时，可以不用谢类名，直接调用方法
    //
    //##### 格式：
    //import static 包名... .类名。方法名；
    //可以直接导入到方法的界别
    //
    //##### 注意事项：
    //方法必须是静态的，如果有多个同名的静态方法每日一不知道使用谁？
    //
    //这个时候要使用，必须加前缀。由此可见，意义不大，所以一般不用，但是要能看懂

    /**
     * Arrays类
     * 数组的工具类
     */

    int [] arr = {23, 1, 58};
    // 排序
    // 普通调用
    // Arrays.sort(arr); 
    
    sort(arr);// 静态导入，直接使用方法,不用类名
    System.out.println(Arrays.toString(arr)); // 把数组以字符串输出

    // 二分查找
    System.out.println("58的位置" + binarySearch(arr, 58));
    
    // 遍历数组
    for (int num :arr){
      System.out.println(num);
    }
  }

}


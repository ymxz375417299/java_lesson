package lesson13;

import java.util.Arrays;

public class Demo01 {

  public static void main(String[] args) {
    // ### 案例： 把给指定字符串的数字排序
    // 需求：
    // - 我有如下一个字符串："91 27 46 38 50";
    // - 请写代码实现最终的输出结果： "237 28 46 50 91";

    String s = "91 27 150 46 38 50";
    // 拆分数组
    String[] arr = s.split("\\s");
    // String [] arr = s.split(" ");
    for (String str : arr) {
      System.out.println(str);
    }

    // 转int数组
    int[] is = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      is[i] = Integer.parseInt(arr[i]); // 字符串 转 整数int
    }

    // 排序
    Arrays.sort(is);
    System.out.println("======");
    for (int i : is) {
      System.out.println(i);
    }

    // 拼接字符串
    String newStr = "";
    for (int i : is) {
      newStr += (i + " ");
    }

    System.out.println("new String : " + newStr);
  }
}

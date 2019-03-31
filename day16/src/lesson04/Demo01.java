package lesson04;

public class Demo01 {
  public static void main(String[] args) {
    // 案例：把数组转成字符串
    // 把数组中的数据按照指定的格式拼接成字符串
    // int[] arr = {1, 2, 3}转成“[1,2,3]”

    // 1. 声明数组
    int[] arr = {1, 2, 3};

    // 声明一个字符串
    String str = "[";

    // 遍历元素
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        str += arr[i]; // 字符串和int相加结果为字符串

      } else {

        str += arr[i] + ","; // 字符串和int相加结果为字符串
      }
    }
    str += "]";

    System.out.println(str);
  }
}

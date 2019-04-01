package lesson01;

public class Demo01 {
  public static void main(String[] args) {
    // 冒泡排序

    // 1. 就是对数组进行由小到大的排序

    int[] arr = {18, 30, 69, 29, 25, 0};

    // 1. 比较4轮
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.println("第" + i + 1 + " 轮比较");

      // 2. 打印每一轮比较的对应索引
      for (int j = 0; j < arr.length - 1 - i; j++) {
        int left = j;
        int right = j + 1;
        System.out.println("left: " + j + " rigth: " + right);

        int tmp = 0;
        // 换位置
        if (arr[left] > arr[right]) {
          tmp = arr[left];
          arr[left] = arr[right];
          arr[right] = tmp;
        }
      }
    }

    // 遍历打印结果
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}

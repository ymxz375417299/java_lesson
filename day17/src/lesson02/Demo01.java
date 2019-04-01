package lesson02;

public class Demo01 {
  public static void main(String[] args) {
    // # 02.数组的高级选择排序讲解
    //
    // ### 需求：
    // 1. 有数组元素：{24， 69， 80， 57， 13}，请对数组元素进行排序
    // 2. 选择排序： 从0索引开始，一次和后面的元素比较，小的往前方，第一次完毕，最小值出现在最小的索引值
    // ``
    // int[] arr = {80, 57, 24, 69, 13}
    // ```
    // ![image](511ADF6542084DAC99F204B9F2F92C60)
    //
    // # 步骤
    // - 1: 0-1. 0-2, 0-3, 0-4
    // - 2: 1-2, 1-3, 1-4
    // - 3: 2-3, 3-4
    // - 4: 3-4
    // )

    int[] arr = {24, 69, 80, 57, 13};

    // 比较轮数
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.println("第" + (i + 1) + " 轮");
      for (int j = i + 1; j < arr.length; j++) {
        System.out.println(i + "-" + j);
        int left = i;
        int right = j;
        int tmp = 1;
        // 对换位置
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

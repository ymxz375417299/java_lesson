

public class Demo01 {

  public static void main(String[] args) {
    // 获取数组反转
    int[] arr = {1, 2,  3};

    // 1. 算下对调次数
    int count = arr.length / 2;
    // 2. 打印对调的索引
    for (int i = 0; i < count; i++){
      int left = i; //左边索引值
      int right = arr.length - i - 1; // 右边的索引J
      System.out.println("左边的索引：" + left + "右边的索引:" + right);
      // 临时遍历，先把左边的值赋值给暂存区
      int tmp = arr[left];
      // 把右边的值赋值给左边
      arr[left] = arr[right];
      // 把暂存区temp赋值给右边
      arr[right] = tmp;
    }

    // 遍历打印
    for (int i = 0;  i < arr.length; i++){
      System.out.println(arr[i]);
    
    }
    
  }

}


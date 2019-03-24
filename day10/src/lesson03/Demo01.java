
public class Demo01 {

  public static void main(String[] args) {
    // ### 制作一个工具类 ArrayTool
      // 1. 获取最大值
        // 2. 数据的遍历
        // 3. 数组的反转

    int[] arr = {18, 8, 28, 3, 1200};
    // 获取最大值
    // 非静态调用
    // ArrayTool tool = new ArrayTool();
    // int max = tool.getMax(arr);
    // System.out.println("最大值：" + max);

    // 静态调用
    // 比上面性能更高，因为不用再堆区特意创建一个内存地址来存放对象
    int max = ArrayTool.getMax(arr);
    System.out.println("最大值：" + max);

    // 打印数组
    ArrayTool.print(arr);

    // 数组反正
    System.out.println("反转前");
    ArrayTool.print(arr); 
    ArrayTool.reverse(arr);
    System.out.println("反转后");
    ArrayTool.print(arr); 

  }

}


class ArrayTool{
  // 声明构造方法变成私有
  // 因为我们是希望这些静态发方法直接使用【类名.方法】调用，限制外部犯法，胡乱new创建对象。来降低性能
  private ArrayTool(){} //public 公有，private私有

  //1。 传一个数组， 获取最大值
  // 非静态声明
  // public int getMax(int[] arr){ 
  // 静态声明
  public static int getMax(int[] arr){
    int max = arr[0];
    for(int i = 0 ; i < arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }
  
  // 遍历打印数组
  public static void print(int[] arr){
  
    System.out.println("数组打印开始..");
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
    System.out.println("数组打印结束..");

  }

  // 数组的反正
  public static void reverse(int[] arr){
    for (int i = 0 ; i < arr.length/2; i++){
      int left = i;
      int right = arr.length - i - 1;

      int tmp = arr[left];

      arr[left] = arr[right];
      arr[right] = tmp;
    }
  }
}


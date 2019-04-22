package lesson14;

public class Demo01 {

  public static void main (String[] args) {
    // 课堂案例： 把数组转成字符串，用StringBuffer实例
    // 需求： 把数组汇总的数据按照指定格式拼接成字符串
    // 举例： int[] arr = {1, 2, 3}
    // 输出结果： ”[1, 2, 3]
    //
    //

    //1. 声明一个数组
    int[] arr = {1, 2, 3};

    // 2. 声明字符串缓冲区对象
    StringBuffer sb = new StringBuffer();
    sb.append("[");

    // 3. 遍历元素
    for (int i = 0; i < arr.length; i++){
      sb.append(arr[i]);
      if(i == arr.length - 1){
        sb.append("]");
      
      }else{
        sb.append(",");
      
      }

    }

    System.out.println(sb);
    
  }
}


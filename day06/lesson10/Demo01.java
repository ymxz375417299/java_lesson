
public class Demo01 {

  public static void main(String[] args) {
    // 获取数组的最大值
    int[] arr = {1, 342424, 43, 4353, 453, 435654, 12314};

    //2. 先获取最大值
    int max = arr[0];

    for (int i = 1; i < arr.length; i++){
      System.out.println(i);
      if(max < arr[i]){
        max = arr[i]; 
      }
    
    }
    System.out.println("最大值：" + max);


  }

}


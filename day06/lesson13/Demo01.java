
public class Demo01 {

  public static void main(String[] args) {
    // 查找数字中某个元素的索引值
    int[] arr = {133, 23, 13, 11, 59};

    int a = 13;
    System.out.println("a的位置:" + getIndex(arr, a));
    }

  
  //写一个方法，实现传入元素和列表返回索引值
  public static int getIndex(int[] arr, int a){
    int index = -1; // -1代表没有找到元素
    for (int i = 0; i < arr.length; i++){
      //取出元素与a变量对比
      if (arr[i] == a){
        // 找到a的位置
          index = i;
      }
    }
    return index;
  }
}


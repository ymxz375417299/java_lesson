
public class Demo01 {

  public static void main(String[] args) {
    // 数组的变量
    // 依次输出数组的每一个元素
    // 数组的属性： arr.length 数组的长度
    // 数组的最大索引： arr.length -1
    // 数组的遍历，掌握两个方式
    // 逐一通过索引获取【麻烦， 不灵活】
    // 使用for 循环遍历【灵活】

    int[] arr = {1, 2, 4, 5, 6, 7};
    System.out.println("数组的长度:" + arr.length);

    // 遍历打印
    for (int i = 0; i < arr.length; i++){
    
      System.out.println(arr[i]);
    }
  }

}



public class Demo01 {

  public static void main(String[] args) {
    // 数组操作的两个常见小问题 越界和空指针
    // 1. 越界问题
    int[] arr = {100, 120, 119};

    System.out.println(arr[0]);
    // System.out.println(arr[3]); // 报错： 越界，超过索引值
    
    // 2. 空指针问题 NULLPointerException, 就是变了没有指向任何一个内存空间
    arr = null;
    System.out.println(arr[0]);

  }

}


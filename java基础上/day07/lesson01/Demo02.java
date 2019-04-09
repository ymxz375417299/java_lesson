
public class Demo02 {

  public static void main(String[] args) {
    // 引用数据类型的值传递:
    //    是会改变原值， 因为即使方法跳栈，但是内存的堆空间,数组对象还在，可以通过地址继续访问
    //
    // 基本数据类型： int, byte, short, long,char, double, float, boolean
    // 引用数据类型
    //    什么是引用数据类型：数组， 对象
    //    变量存的是一个内存地址，而不是真实的值，如：数组，

    int a = 10;
    int[] arr = {1, 2, 3, 4, 5}; //是  new 的简写，实际会执行new ，在内存的堆空间开辟连续的空间
    arr[2] = 10;
    System.out.println("改变前的数组的值：");
    printArr(arr);
    change(arr);
    System.out.println("改变后的数组的值：");
    printArr(arr);

  }

  // 遍历打印数组的方法
  public static void printArr(int[] arr){
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]);
    }
    System.out.println();
  }

  //方法里改变数组的某一个元素的值
  public static void change(int[] arr){
    arr[2] = 99999;
  }

}


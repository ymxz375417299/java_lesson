
public class Demo01 {

  public static void main(String[] args) {

    // 二位数组的定义
      // 二位数组本质上是以数组作为数组元素的数组， 即“数组的数组”。
      // 相当于一个箱子内有n个箱子
      // 相当于python中的字典内字典


    // 二位数组书写格式： (有三种)
      // 1. 数据类型[][] 数组名 = new 数据类型[m][n];(推荐使用这种)
   int[][] arr1 = new int[3][2];
      // 2. 数据类型 数组名[][] = new 数据类型[m][n];
   int arr2[][] = new int[3][2]; 
      // 3. 数据类型[] 数组名[] = new 数据类型[m][n]
   int[] arr3[] = new int[3][2]; 


  }

}


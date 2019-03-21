
public class Demo01 {

  public static void main(String[] args) {
    //二位数组的简便写法
    int[][] arr1 = {{120, 110, 110}, {520,20}, {99, 199, 299}};

    //二位数组的遍历
    //先遍历二位数组（二位数组的元组是一维数组）
    for(int i = 0; i < arr1.length; i++){
      System.out.println(arr1[i]);
      // int [] arr = arr1[i];
      for (int j = 0; j < arr1[i].length; j++){
        System.out.println(arr[j]);
        
      }
    }

  }

}


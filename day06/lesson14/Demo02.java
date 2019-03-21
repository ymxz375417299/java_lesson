
public class Demo02 {

  public static void main(String[] args) {
    //声明一个二位数组
    //数组的元素也是一个数组
    int[][] arr1 = new int[3][2];

    System.out.println(arr1); //结果为一个父数组的地址
    System.out.println(arr1[0]); // 结果也是一个子数组的地址
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);

    // 给二位数组赋值
    // 1. 给第一个一维数组的第二个元素赋值
    System.out.println(arr1[0][1]); //默认值为0
    arr1[0][1] = 10;
    System.out.println(arr1[0][1]);
    // 2. 给第三个一维数组的第一个元素赋值
    arr1[2][0] = 20;
    System.out.println(arr1[2][0]);



  }

}


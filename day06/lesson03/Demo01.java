
public class Demo01 {

  public static void main(String[] args) {

    // 这个数组变量可以放5个 int元素
    int[] arr1 = new int[5];

    // 2 赋值，通过索引
    arr1[0] = 1;
    arr1[1] = 2;
    arr1[2] = 3;
    arr1[3] = 4;
    arr1[4] = 5;

    // 3 取值, 通过索引
    System.out.println(arr1[3]); // 取数组第四个元素

    // boolean 数组【boolean】 默认是false
    boolean[] arr2 = new boolean[5];
    System.out.println(arr2[2]);

  }

}


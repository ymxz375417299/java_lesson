package lesson04;

public class Demo01 {
  public static void main(String[] args) {
    //# 数组==高级二分查找==原理图解
    //### 二分查找又称==折半查找==
    //- 优点： 比较次数少，查找速度快，平均性能好
    //- 缺点：要求待对查找表为==有序表（即已经排好序的）==。  当要找的数在右半部分性能才更好，如果在左边的话，和普通的查找差不多
    //- 目的： 查找元素的索引，有个前提是数组元素必须为==有序==
    //
    //
    //### 步骤
    //- 案例找22的索引值
    //- 先找对半的索引 mid（中间） 和查找的数对比
    //    - 如果22比mid小 则把max放到mid的索引值 - 1
    //        - 如果22比mid大，则把min放到mid的索引值 + 1



    int[] arr = {11, 22, 33, 44, 55, 66, 77, 88};

    // 要找的数
    int num = 88;

    // 初始化索引最小最大值
    int min = 0;
    int max = arr.length -1;
    int mid = (min + max) / 2;
    System.out.println("min:" + min + " mid: " + mid + "max " + max);

    // 查找的算法
    int index = -1; // 如果算到最后，index值没有改变， 代表数组中要找的数不存在

    while (true){
      System.out.println("mid----" + mid);
      System.out.println("min----" + min);
      System.out.println("max----" + max);
      if(arr[mid] > num){
        // 说明num在左边，需要把max到mid-1
        max = mid - 1;
        mid = (max + min) / 2; // 重新计算中间索引值
      }

      if(arr[mid] < num){
        // 说明num在右边，需要min 赋值为mid + 1k
        min = mid + 1;
        mid = (max + min) / 2; // 重新计算中间索引值
      }

      if (min > max){
        // 不符合逻辑。说明不存在查询值
        System.out.println("你要找的值不存在这个数组");
        break;
      }


      if (arr[mid] == num){
        // 找到你要查找的数
        index = mid;
        break;
      }
      
     
    
    }
    System.out.println("找到的结果: " + index);


  }



}

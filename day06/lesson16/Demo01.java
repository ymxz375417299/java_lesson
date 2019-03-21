
public class Demo01 {
  public static void main(String[] args) {
    // 练习
    // 需求： 公司年销售额求和
    // 第一季度： 22， 66, 44
    // 第二季度： 77, 33, 88
    // 第三季度： 
    // 第四季度：

    int[][] yearData = {
      {22, 66, 44},
      {77, 33, 88},
      {25, 45, 65},
      {11, 66, 99}
    };

    // 求和
    int sum = 0;
    for (int i = 0; i < yearData.length; i++ ){
      int[] seasonData = yearData[i]; //季度数据
      // 遍历季度里的月数据
      for (int j = 0; j < seasonData.length; j++){
        sum += seasonData[j]; //求和
      }
    }
    System.out.println("季度总销售额:" + sum);
  }

}


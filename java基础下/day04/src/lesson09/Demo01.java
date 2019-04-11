package lesson09;

public class Demo01 {

  public static void main(String[] args) {

    /** 
     * ### 递归就是方法内部调用自己
     * 递归是一种一种算法，在程序设计语言中广泛应用 */

    // 5! - 5的阶乘 = 5*4*3*2*1
    int r = jiecheng(5);
    System.out.println("r = " + r);
  }

  /**
   * 递归写阶乘
   * jiecheng(6) i = 6
   * 6 * jiecheng(5)
   * 6 * 5 * jiecheng(4)
   * 6 * 5 * 4 * jiecheng(3)
   * 6 * 5 * 4 * 3 * jiecheng(2)
   * 6 * 5 * 4 * 3 * 2 * jiecheng(1) 
   * 因为jiecheng(1) 直接返回1 最终结果是
   * 6 * 5 * 4 * 3 * 2 * 1 
   *
   */
  public static int jiecheng(int i){
    if (i == 1){
      return 1; // 当递减后到1后，就返回 1 ,也自然结束了
    }else{
      return i * jiecheng(i - 1); // 5
    }
  }

  /**
   * 使用for循环写阶乘
   */
  public static void test(){
    // 5! - 5的阶乘 = 5*4*3*2*1

    int r = 1;
    for (int i = 1; i <= 5; i++) {
      r *= i; // 即 r = r * i;
    }
    System.out.println("r=" + r);
  }
}

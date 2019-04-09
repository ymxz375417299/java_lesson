package lesson11;

public class Demo01 {

  public static void main(String[] args) {
    // # Math类概述和方法使用
    // ### Math 类包含用于执行基本数学运算的方法，如初等指数，对数，平方根和三角函数
    // ### 成员方法
    // 1. public static int abs(int a) // 绝对值
    System.out.println(Math.abs(-111)); // 结果111
    // 2. public static int ceil(double a) // 取天花板 四舍五入，向上（大）取整
    System.out.println(Math.ceil(3.14)); // 结果4
    System.out.println(Math.ceil(-3.14)); // 结果-3 因为-3 比-4大
    // 3. public static double floor (double a) //  四舍五入，向下取整
    System.out.println(Math.floor(3.14)); // 结果 3
    System.out.println(Math.floor(-3.14)); // 结果 -4
    // 4. public static int max(int a, int b ) // min 自学
    System.out.println(Math.max(3, 5));
    System.out.println(Math.min(3, 5));
    // 5. public static double pow (double a , double b) //返回第一个参数的第二个参数的次幂，如pow(2, 3) 2的3次方 返回double值)
    System.out.println(Math.pow(2,3));
    // 6. public static double random()// 随机值
    System.out.println(Math.random());
    // 7. public static int round (float a) // 参数为double的自学  传入float值，返回最接近的int值，
    System.out.println(Math.round(3.412)); 
    // 8. public static double sqrt(double a) // 平方根
    System.out.println(Math.sqrt(16));
    // 9. 学员需要自己去看下其他方法，有个了解
    //
    //
  }
}

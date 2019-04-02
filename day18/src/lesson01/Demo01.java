package lesson01;

import java.math.BigInteger;

public class Demo01 {
  public static void main(String[] args) {
    // # BigInteger类的概述和方法使用
    // ### BigInteger的概述
    // 可以让超过Integer范围的数据进行运算
    //
    // ### 构造方法
    // public BigInteger(String val)
    // test();
    BigInteger bi1 = new BigInteger("2147283647");
    BigInteger bi2 = new BigInteger("2147283647");

    // + 运算
    BigInteger sum = bi1.add(bi2);
    System.out.println(sum);

    // - 运算
    BigInteger substract = bi1.subtract(bi2);
    System.out.println(substract);

    // * 运算
    BigInteger multi = bi1.multiply(bi2);
    System.out.println(multi);

    // / 运算
    BigInteger divide = bi1.divide(bi2);
    System.out.println(divide);

    // % 求模  返回数组  {商,余数}
    BigInteger[] bis = bi1.divideAndRemainder(bi2);
    System.out.println(bis);


  }

  // 掌握两个最大的int值或者long值进行运行，结果超过int/log的取值范围
  //

  public static void test() {
    System.out.println("MAX Int:" + Integer.MAX_VALUE);
    int a = Integer.MAX_VALUE;
    int b = Integer.MAX_VALUE;
    System.out.println(a);
    int c = a + b;
    // 输出 -2 超出可运算范围
    System.out.println(c);

    System.out.println("MAX Long:" + Long.MAX_VALUE);
    long d = Long.MAX_VALUE;
    long e = Long.MIN_VALUE;
    System.out.println(e);
    long f = d + e;
    // 输出 -1 超出可运算范围
    System.out.println(f);
  }
}

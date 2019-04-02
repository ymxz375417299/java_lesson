package lesson02;

import java.math.BigDecimal;

/**
 * 记住：一会在公司做关于金钱结算快的时候，尽量用BigDecimal这个类
 * 因为这个类可以减少误差
 */
public class Demo01 {
  public static void main (String[] args) {
    //# BigDecimal 概述
    //由于在运算的时候，float类型和double类型很容易丢失精度。 所以 ，为了能精准表示，计算浮点数，java提供了BigDecimal
    //
    //### 构造方法
    //public BigDecimal(String val)

    System.out.println(2.0 - 1.1); // 少了1分钱。在金钱敏感的业务不适合

    BigDecimal bd1 = new BigDecimal("2.0");
    BigDecimal bd2 = new BigDecimal("1.1");

    // + 运算
    BigDecimal sum = bd1.add(bd2);
    System.out.println(sum);

    // - 运算
    BigDecimal subtract = bd1.subtract(bd2);
    System.out.println(subtract);

    // * 运算
    BigDecimal multi = bd1.multiply(bd2);
    System.out.println(multi);

    // /运算

    // 注意：在使用BigDecimal做触发运算时，这两个数要被除尽，否则报错
    // 不能除尽的直接使用 int a/b
    BigDecimal bd3 = new BigDecimal("2.0");
    BigDecimal bd4 = new BigDecimal("0.25");
    BigDecimal divide = bd3.divide(bd4);
    System.out.println(divide);

    // 例子： 借1000块，分3个月换，每个换还多少本金？ 1000 / 3。0 除不尽
    System.out.println(1000 / 3.0);   
    

  }

}


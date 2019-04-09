package lesson01;

public class Demo01 {
  public static void main(String[] args) {
    // 案例： 统计不同类型字符格式
    String password = "abcdABsda324sA#!@sd";

    // 密码； 大写，小写，数字。特殊字符

    // 1. 声明变量
    int big = 0; // 大写
    int small = 0; // 小写
    int num = 0; // 数字
    int other = 0; // 特殊字符

    // 2. 遍历字符串的字符
    for (int i = 0; i < password.length(); i++) {
      // 取字符
      char ch = password.charAt(i);

      System.out.println(ch);

      // 判断字符是否大写
      if (ch >= 'A' && ch <= 'Z') { // 因为char字符对于系统的来说 字符都是数字，是可以进行区间比较的
        big++;

      } else if (ch >= 'a' && ch <= 'z') {
        small++;
      }else if (ch >= '0' && ch <='9'){
        // 注意一定要‘ 声明为char字符
        // 因为直接输入数字，会转化成码表0~9对应的字符
        // ’0‘ 对应码表 48编号
        // ‘9’ 对应码表 57编号
        num ++;
      }else{
        other ++;
      
      }
    }
    System.out.println("大写出现了：" + big);
    System.out.println("小写:" + small);
    System.out.println("数字：" + num);
    System.out.println("特殊符号" + other);

  }
}

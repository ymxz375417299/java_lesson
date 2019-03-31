package lesson15;

import java.util.Scanner;

public class Demo01 {
  public static void main(String[] args) {
    // # 课程案例：字符串反转，用StringBuffer实现
    // ### 需求： 把字符串反转，使用StringBuffer的功能实现
    // ### 举例： 键盘录入“abc" 输出结果”cba"
    //

    // 1. 监听用户键盘输入
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入一行文字");
    String s = scanner.nextLine();

    // 2. 反转
    StringBuffer sb = new StringBuffer(s);

    // 手动写一个反转逻辑
    // for (int i = s.length() - 1; i >= 0; i--) {
      // sb.append(s.charAt(i));
    // }

    // StringBuffer的内部反转方法
    sb.reverse();
    System.out.println(sb);
  }
}

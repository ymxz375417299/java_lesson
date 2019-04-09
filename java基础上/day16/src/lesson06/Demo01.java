package lesson06;

import java.util.Scanner;

public class Demo01 {
  public static void main (String[] args) {
    // 课堂案例：字符串的反转g
    // 需求：
    // 键盘录入abc
    // 输出结果 cba
    //


    // 1. 获取用户输入
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入一段文字：");
    String str = scanner.nextLine();


    // 2. 反转输出到控制台
    // 正常遍历
    for (int i = 0; i < str.length(); i++){
      System.out.println(str.charAt(i));
    
    }

    System.out.println("========\n 开始反向打印");
    // 方向打印
    for(int i = str.length() - 1; i >= 0; i--){
      System.out.println(str.charAt(i));
    
    }
  }

}


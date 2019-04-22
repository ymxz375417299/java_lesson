package lesson08;

import java.util.HashSet;
import java.util.Set;

import java.util.Scanner;

public class Demo01 {

  public static void main(String[] args) {
    // 08.案例从键盘读取一行输入,去掉重复字符并打印讲解

    //char
    Set<Character> set = new HashSet<Character> ();
    // 1. 读取键盘输入
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入内容：");
    String str = scanner.nextLine();
    

    // 2. 遍历字符串里的字符
    // 字符串对象的长度是legth方法，不是属性，只有数组才有length属性
    for (int i = 0 ; i < str.length(); i++){
      char ch = str.charAt(i); // 获取当前索引下的字符
      // 3. 把字符放在set中
      set.add(ch); // 会自动把char基本类型升级自动包装成character类型。
    }


    // 遍历打印
    for (Character ch : set){
      System.out.println(ch);
    }
  }
}

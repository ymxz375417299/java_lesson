package lesson08;

import java.io.InputStream;
import java.io.PrintStream;

public class Demo01 {

  public static void main (String[] args) {
    // 标准输入输出流概述和输出语句（了解）
    // 标准输入: 键盘输入，就是InputStream类, System.in
    // 标准的输出流： 对控制台输出，PringtStream类 , System.out
    InputStream is = System.in;
    PrintStream ps = System.out;
  }
}


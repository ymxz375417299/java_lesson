package lesson07;

import java.io.IOException;
import java.io.PrintStream;

import java.io.PrintWriter;

public class Demo01 {

  public static void main (String[] args) throws IOException{
    // 打印流的概述和特点（掌握）
    /**
     * # 07.打印流的概述和特点讲解【掌握】
     *
     * ### 什么是打印流
     * 1. 该流可以很方便的将对象的toString()结果输出，并且自动加上换行，而且可以使用自动刷出的模式
     * 2. System.out就是一个PrintStream,默认向控制台输出
     * 3. PrintStream和PrintWriter分别是打印字节流和字符流
     */

    // 1. 打印的字节流【输出到控制台】
    PrintStream ps = System.out;
    ps.println("你好， 元宵节快乐"); // 打印字符串，并换行
    ps.print(19.8); // 不换行

    /** 2. 打印的字符流 【把输出的print的内容输出的文件中】
     *    可以充当日志功能
     *    1. 如果打印了内容，没有调用flush或者close， 则输出的数据不会输出到文件内
     */
    PrintWriter pw = new PrintWriter("test.txt"); // 需要绑定文件
    pw.println("吃汤圆");
    pw.println("超市一包汤圆10元");
    pw.println(13.01);
    pw.flush(); // 只有flush才会刷新到文件中
    pw.close(); // 因为打开了文件，所以需要关流,close内会会调用flush方法
  }
}


package lesson15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
  public static void main (String[] args) throws IOException{
    // 案例： 字符流拷贝

    // 思路： 用FileReader字符读取流读字符，使用FileWriter字符写入流写入文件
    
    // 1. 创建“读取流” 对象
    FileReader reader = new FileReader("a.txt");

    // 2. 创建“写入流"对象
    FileWriter writer = new FileWriter("c.txt");

    // 3. 读取和写入
    // 【使用缓冲思想】 使用字符数组
    char[] buf = new char [8 * 1024]; //拓展8kb的字符位置，假如都放中文，而且是utf-8 (1个字符占用3个字节）  即装满会有3 * 8 kb大小
    int len = 0;
    while((len = reader.read(buf)) != -1){  // 如果传入的是字符数组，则返回的是真实读取字符的长度// 如果什么都不传，则读取一个字符的int值
      System.out.println("读取的长度: " + len); 
      writer.write(buf, 0, len); // 可以传字符串 也可以传int值
    }

    System.out.println("复制成功");

    // 4. 关闭流
    reader.close();
    writer.close();

  }

}


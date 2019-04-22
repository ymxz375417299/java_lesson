package lesson11;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {
  public static void main(String[] args) throws IOException {
    // 案例： 读取Txt文件内容了另一种写法

    // 1. 创建文件夹输入流对象
    FileInputStream fis = new FileInputStream("a.txt");

    // 2. 读取数据

    int b = 0;
    while ((b = fis.read()) != -1) {
    
      System.out.println((char)b); // 把int转char字符类型
    }

    // 关闭流
    fis.close();
  }
}

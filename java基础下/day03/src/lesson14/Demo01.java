package lesson13;

import java.io.FileWriter;
import java.io.IOException;

/** 
 * FileWriter 
 * 掌握：
 * 1. write方法使用
 * 2. 其实内部是通过一个**字符数组缓冲区**写入文件
 * 3. 内部方法， 创建一个字符串长度的字符数组缓冲区
 */
public class Demo01 {
  public static void main (String[] args) throws IOException{
    // FileWriter 写入字符流
    // 案例: 使用FileWriter往一个文件atxt写内容

    // 1. 创建一个Writer对象
    FileWriter writer = new FileWriter("b.txt");

    // 2. 写内容
    writer.write("你好\r\n");
    writer.write("你好\r\n");
    writer.write("你好\r\n");
    writer.write("你好\r\n");
    writer.write("你好\r\n");

    // 3. 关闭留
    writer.close();
  }

}


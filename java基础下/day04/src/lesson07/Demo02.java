package lesson07;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo02 {

  public static void main (String[] args) throws IOException{
    /**
     * OutputStreamWriter
     *
     * 1. 使用指定的编码写入文件
     */
    
    FileOutputStream fos = new FileOutputStream("c.txt");
    OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); // 指定使用UTF-8，操作FileOutputStream字节输出到文件
    BufferedWriter bw = new BufferedWriter(osw); // 使用缓冲字符流进行写入，注意字符缓冲流是可以直接传字符串写入的

    // 写
    bw.write("你好， IO流，，你搞的我好晕");
    bw.newLine();
    bw.write("你好。小帅哥");
    bw.newLine();

    // 关闭流
    bw.close();
  }
}


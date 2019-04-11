package lesson12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.SequenceInputStream;

public class Demo01 {

  public static void main (String[] args) throws IOException {
    /**
     * # SequenceInputStream 序列输入流
     * ### 什么是序列流
     * 序列流可以把多个字节输入流整合成一个，从序列流中读取数据时，将从被整合的第一个流开始读，读完一个之后继续读第二个，以此类推
     */

    // 创建序列流
    // 创建输入流对象
    FileInputStream fis1 = new FileInputStream("a.txt");
    FileInputStream fis2 = new FileInputStream("b.txt");
    SequenceInputStream sis = new SequenceInputStream(fis1, fis2); // 分别要拼接的输入传禁区
    
    // 创建c.txt文件输出流对象
    FileOutputStream fos = new FileOutputStream("c.txt");

    // 读写 
    // 遍历序列输入流对象的即可J
    int  b = 0;
    while ((b = sis.read()) != -1){
      fos.write(b);
    }


    // 关闭流
    fis2.close();
    sis.close();
    fos.close();


  }

  /**
   * 以前的实现方式
   * 比较麻烦，繁琐
   */
  public static void test() throws IOException{

    // 需求： a.txt, b.txt 依次写c.txt
    // 以前的操作
    // 创建a.txt 和b.txt文件输入流对象
    FileInputStream fis1 = new FileInputStream("a.txt");
    FileInputStream fis2 = new FileInputStream("b.txt");

    // 创建c.txt文件输出流对象
    FileOutputStream fos = new FileOutputStream("c.txt");

    // 3. 先吧a文件内存写到c.txt
    int b;
    while ((b = fis1.read()) != -1){
      fos.write(b);
    }

    fos.write("\r\n".getBytes()); // 把换行符换成字节数组，并写入文件加

    while ((b = fis2.read()) != -1){
      fos.write(b);
    }

    // 4 关闭流
    fis1.close();
    fis2.close();
    fos.close();
  }
}


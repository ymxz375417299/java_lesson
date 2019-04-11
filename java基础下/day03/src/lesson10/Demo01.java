package lesson10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
  public static void main (String[] args) throws IOException{
    // 练习： 图片加密
    //
    //
    // 1. 输入输出流
    FileInputStream fis = new FileInputStream("/home/rock/java_lesson/java基础下/day03/src/testpicture-加密.jpg");
    FileOutputStream fos = new FileOutputStream("/home/rock/java_lesson/java基础下/day03/src/testpicture-解密.jpg");
  
    // 写数据

    /**
     * 加密操作
     * 解密操作
     *
     * 一个数异或2次，数据不变
     */

    int a = 0;
    while ((a = fis.read()) != -1){
      fos.write(a ^ 5); // 异或一次，加密， 异或2次 解密
    }
    System.out.println("解密成功");

    // 关闭流
    fis.close();
    fos.close();
  }
}


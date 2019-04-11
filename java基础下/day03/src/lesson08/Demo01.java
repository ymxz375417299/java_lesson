package lesson08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
  public static void main (String[] args) throws FileNotFoundException{
    // 流的标准处理异常代码1JDK1.6版本以以前 处理

    // 案例： a.txt的内容拷贝到b.txt

    FileInputStream fis = new FileInputStream("a.txt"); // 这两个方法都会抛FileNotFoundException异常
    FileOutputStream fos = new FileOutputStream("b.txt");

    
    // 安全隐患：
    // 之前的做法的直接给main抛异常，但是万一出现异常，那流就不会关闭，这样内存会溢出
    // int b = 0;
    // while(( b = fis.read()) != -1){ //这里读数据会报异常，
      // fos.write(b);
    // }

      // 捕抓数据异常 
      // JDK 1.6以前的异常处理
    try{
      int b= 0;
      while(( b = fis.read()) != -1 ){
        fos.write(b);
      }
    }catch(IOException e){
      e.printStackTrace();
    }finally{
      // 关流
      // 关流也可能会异常所以也要捕抓
      // 两个流分别关闭和捕抓，保证即使一个流关闭异常也能保证另一个关闭操作
      try{
        fis.close();
      }catch(IOException e){
        e.printStackTrace();
      }

      try{
        fos.close();
      }catch(IOException e){
        e.printStackTrace();
      }
    }
  }

}


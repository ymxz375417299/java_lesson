package lesson03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

  public static void main (String[] args) throws IOException{
    //# BufferedinputStream 和BufferOutputStream
    //这两个流是内置的**缓冲区**流，也就是说内部有一个**字节数组**


    // 1. 创建缓冲输入流
    FileInputStream fis = new FileInputStream("/home/ipfsmain/java_lesson/java基础下/day03/src/testpicture.jpg");
    BufferedInputStream bis = new BufferedInputStream(fis);// 需要传InpuStream类进去，参数InpuStream是抽象类。所以传FileInputStream


   // 2. 创建缓冲输出Luis
   FileOutputStream fos = new FileOutputStream("/home/ipfsmain/java_lesson/java基础下/day03/src/testpicture.jpg-副本2.jpg");
   BufferedOutputStream bos = new BufferedOutputStream(fos);// 

   //  3. 输入流读数据， 输出流写数据
   int b = 0;
   // bis.read() 缓冲区输入流会自动内部读取8kb数据
   while((b = bis.read()) != -1){
     bos.write(b); // 缓冲输出流写数据，会自动写一次8Kb数据
   }


   // 关留
   // 直接关缓冲流就会自动关FileInputStream / FileOutStream 文件输入输出留
   bis.close();
   bos.close();

   System.out.println("拷贝完成！");
  }
}


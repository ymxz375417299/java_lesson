package lesson01;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {
  public static void main (String[] args) throws IOException {
    /**
     * ## 01.ByteArrayOutputStream讲解
     * 1. 前面的学习的流必须关联帮我文件
     * ``
     * FileOutputStream fos = new FileOutputStream("a.txt"):
     * ```
     *
     * 2. ByteArrayOutputStream 不需要关联文件
     * 3. 此类实现了一个输出流，其中的数据被写入一个byte数组
     * 缓冲区会随着数据的不断写入而自动增长（之前的BufferXX的缓冲流是固定 8Kb大小的（
     *
     * ### 可以使用toByteArray（） 和toStreing()获取数据)`
     */

    // 1. 创建字节数组输入流对象
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    
    // 2. 文件输入流
    FileInputStream fis =  new FileInputStream("a.txt");

    // 3. 写入字节数组输出流

    int b = 0;
    while ((b = fis.read()) != -1){
      baos.write(b);
    }

    // 自动把字节数组转成字符串
    System.out.println(baos.toString());
    System.out.println(baos.toString("GBk")); //指定编码格式的字符串
    System.out.println("====");

    // 获取文件数据，返回值为字节数组
    byte[] bytes = baos.toByteArray();
    System.out.println(new String(bytes)); // 把字节数组转成字符串
    System.out.println(new String(bytes, "GBK")); //指定编码，把字节数组转成字符串

  }

}


package lesson07;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
  public static void main(String[] args) throws IOException{
    // ### 字节流写入中文的问题
    // 字节流直接操作的字节，所以写出中文必须将字符串转成字节数组
    // 写出回车换行 `wrrit("\r\n".getBytes());`
    //

    // 1. 输入流
    FileOutputStream fos = new FileOutputStream("a.txt");

    // 2. 写中文
    String s = "你好， Gosling最近好吗？";

    // 把字符串转成字节数组
    // byte[] bytes = s.getBytes();
    /**
     * charseName 字符编码UTF-8(unicode),GBK
     */
    byte[] bytes = s.getBytes("UTF-8");  // 指定编码格式

    fos.write(bytes);

    // 3. 关流
    fos.close();
  }
}

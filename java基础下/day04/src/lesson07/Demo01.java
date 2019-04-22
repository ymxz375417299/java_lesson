package lesson07;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo01 {

  public static void main (String[] args) throws IOException{
    /**
     * # InputStreamReacer & OutputStreamWriter
     * - 这两个类用于使用孩子激动呢的码表读写字符
     *   - FileReader 是使用默认码表读取文件，如果需要使用指定码表读取请使用InputStreamReader(字符流， 编码表)
     *   - FilWriter是使用默认码表写出文件，如果需要使用指定码表写入，请使用OutputStreamWriter(字节流，编码表)
     */
    

    // 案例1 : 使用指定“ 码表UTF-8&GBK" 读取字符
    /**
     * charsetName: 字符编码的名称
     */

    FileInputStream fis = new FileInputStream("a.txt");
    InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // 指定UTF-8 读写 fis字节流对象
    // 读一个字符
    System.out.println((char)isr.read()); // 被InputStreamReader装饰的输入/输出字节流对象，每次read() 就是读一个字符，而不是一个字节)
    System.out.println((char)isr.read());

    // 读一行
    BufferedReader br = new BufferedReader(isr); // 先使用缓冲区字符流砖石
    System.out.println(br.readLine());
    // 关闭流
    br.close();
  }
}


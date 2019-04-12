package lesson09;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo01 {

  public static void main (String[] args) throws IOException{
    
    //### RandomAccessFile随机访问流概述
    //RandomAccessFile类不属于流，是Object类的子类，（不继承字节流和字符流，所以严格意义上不是流） 
    //但是他融合了InputStream ,OutputStream流的功能
    //支持对随机访问文件的读取和写入
    //### 应用场景
    //- 用于文件的断点下载

    //### 构造方法
    //有两个参数
    //- name: 文件名称，路径
    //- modelo, r=read 只读   w= write 可写

    // 1. 创建一个随机访问流对象，以只读的方式打开文件
    RandomAccessFile raf = new RandomAccessFile("a.txt", "rw");

    // 2. 读字符
    /** 
     * 使用RandomAccessFile的readChar/readLine方法读文件有乱码问题
     * RandomAccessFile 是字节流,只能按字节读取
     */
    // System.out.println(raf.readChar()); // 会有乱码
    // System.out.println(raf.readLine()); // 户籍有乱码

    // 使用字节数组读数据，中文才不会乱码
    // byte[] buf = new byte[1024];
    // int len;
    // while ((len = raf.read(buf)) != -1){
      // System.out.println(new String(buf, 0, len)); // 字节数组转字符转
    // }

    // 3. 写数据
    // raf.writeChars("abc");
    // raf.writeBytes("efg");
    raf.seek(3); // 移动指定光标位置，再进行操作读写
    raf.write(97); //写一个字符
    raf.write(98); //写一个字符
    raf.write(99); //写一个字符

  }
}


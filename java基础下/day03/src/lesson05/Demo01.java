package lesson05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

  public static void main (String[] args) throws IOException{
    //# BufferedOutputStream的flush和close方法的区别讲解
    //### flush()方法
    //用来刷新缓冲区的，刷新后可以再次写入
    //
    //
    //### close()方法
    //- 用来关闭流释放资源的
    //- 如果是带缓冲区的流对象的close()方法吗，不但会关闭流，还会关闭流之前刷新缓冲区， 关闭后不能再写出
    
    // 案例： 把a文件的内容拷贝到b文件
    // 1. 输入流
    FileInputStream fis = new FileInputStream("a.txt");
    BufferedInputStream bis = new BufferedInputStream(fis);


    // 2. 输出Luis
    FileOutputStream fos = new FileOutputStream("b.txt");
    BufferedOutputStream bos = new BufferedOutputStream(fos);

    // 3. 读写操作
    int a = 0;
    while ((a = fis.read()) != -1){
      fos.write(a);
    }
    bos.flush(); // 刷新缓冲区，即会把缓冲区的数据输出写入文件内

    // 4. 关闭流
    // bis.close(); //　如果不关闭流，而缓冲区每次可以存8个字节的数据，写满8kb才会刷新写入文件
                    // 如果写不满，则会写入不成功。默认缓冲区的流，在close之前就会自动先flush到文件内。保证数据完整
    // bos.close();
  }
}


package lesson13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Vector;

import java.io.SequenceInputStream;

public class Demo01 {

  public static void main (String[] args) throws IOException {
    // 13.SequenceInputStream 序列流使用二讲解

    // 需求， 把a.txt b.txt c.txt 的内容拷贝到d.txt

    // 创建Vector 线程安全的集合
    Vector <InputStream> vector = new Vector<InputStream>();
    // 给集合添加三个字节输入流对象
    vector.add(new FileInputStream("a.txt"));
    vector.add(new FileInputStream("b.txt"));
    vector.add(new FileInputStream("c.txt"));

    /**Enumeration
     * 枚举类
     */
    // 2. Enumeration 枚举
    // 固定写法
    Enumeration<InputStream> e = vector.elements(); // vector的集合的元素elements返回值为Enumeration枚举类
    // 创建序列流
    SequenceInputStream sis = new SequenceInputStream(e); // 把枚举的传入过来
    
    // 创建输出Luis
    FileOutputStream fos = new FileOutputStream("d.txt");

    // 读写
    int b = 0;
    while ((b = sis.read()) != -1){
      fos.write(b);
    }

    // 关闭流
    sis.close();
    fos.close();
  }
}


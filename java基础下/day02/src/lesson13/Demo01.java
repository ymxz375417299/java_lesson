package lesson13;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

  public static void main (String[] args) throws IOException{
    //## OutputStream & FileOutputStream 文件输出流
    //### 文件输出流是用于将数据写入File的输出流
    //### FileOutputStream 用于写入诸如图像数据之类的原始字节的流
    //### 查看文档的构造方法和成员方法
    //
    //### 案例： 往一个abc.txt文件写数据（知识点）
    //
    //构造方法
    //1. new FileOutputStream(file) z这种构造方法，会把以前的内容都删除
    //2. new FileOutputStream(file, true); 这种构造方法能追加内容
    //
    //3. fileNotFoundException是IOException的子类
    //4. write(int b ) 写数据
    
    // 案例： 往b.txt写个内容
    // 1. 创建文件输出流对象
    FileOutputStream fos = new FileOutputStream("a.txt");
    

    /// 2. 写数据
    // fos.write(97);
    // fos.write(98);
    // fos.write(99);

    // 一次性写多个字节
    byte[] bytes = {97, 98, 99, 100, 101};
    fos.write(bytes);

    // 3. 关闭流
    fos.close();

  }
}


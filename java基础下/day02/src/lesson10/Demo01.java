package lesson10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 读取Txt文件内容
 * 1. 通过FileInputStream 方法读取txt文件内容
 * 2. read方法每次读文件1个字节(byte) 有8个比特(即256最大值，正负各一半 128), 并会把Byte转成Int进行返回
 * 当读到最后的时候，返回-1， -1代表读取文件结束
 * 3. 当读完文件后，这个输入流要关闭，释放资源
 */

public class Demo01 {
  public static void main(String[] args) throws IOException {
    // ## FileInputStream文件输入流
    // ### 概述
    // FileInputStream从文件系统中某个文件中获取输入字节。 FileInputStream用于读取诸如图像数据之类的原始字节流。要读取字符流，请考虑使用FileReader
    //
    // ### 构造方法
    // - FileInputStream(File file)
    // - FileInputStream(String name)
    // -
    //
    // ### 成员方法
    // - int read() 从此输入流中读取一个数据字节

    // 按键： 读取txt文件内容
    // 1. 创建一个文件对象
    File file = new File("a.txt");

    // 2. 创建一：创建一个文件输入流【读取文件数据】对象
    FileInputStream fis1 = new FileInputStream(file);

    // 2. 创建方式二： 传文件路径
    // FileInputStream fis2 = new FileInputStream("b.txt");

    // 3 . 读取a.txt的数据
    /**
     * read方法每次读文件1个字节(byte) 有8个比特(即256最大值，正负各一半 128), 并会把Byte转成Int进行返回
     * 当读到最后的时候，返回-1， -1代表读取文件结束
     * 为什么要转成int再返回？ 后面说
     */
    System.out.println(fis1.read());
    System.out.println(fis1.read());
    System.out.println(fis1.read());

    System.out.println((char)(fis1.read())); //把int转char字符类型

    // 4. 关闭流
    fis1.close();

  }

}

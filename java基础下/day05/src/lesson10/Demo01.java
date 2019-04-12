package lesson10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
  public static void main (String[] args)throws IOException {
    
    // DataOutputStream & DataInputStream 数据的输入输出流
    // 可以按照基本数据类型大小读写数据
    //
    // 例如按Long大小写出一个数组，写出时该数据占8个字节
    // 读取的时候也可以按照Long类型读取，一次读取8个字节
    //
    // ### 只是补充 基本数据Long int类型占用字节数
    // - Long 8个字节
    // - int 4个字节

    // 读3个long数据
    // 创建数据输入流对象
    DataInputStream dis = new DataInputStream(new FileInputStream("a.txt"));
    System.out.println(dis.readLong());
    System.out.println(dis.readLong());
    System.out.println(dis.readLong());

  }

  /** 
   * 以Long的数据长度写入数据
   */
  public static void test1() throws IOException{
    long a = 997;
    long b = 998;
    long c = 999;

    // 使用FileOutputStream 是无法写入long类型数据
    FileOutputStream fos = new FileOutputStream("a.txt");
    // byte的范围是-128~127 0~255;
    // fos.write(977); //  fos是字节流输出对象， 997超过byte范围则会流失溢出的数据。
    // fos.write(998);
    // fos.write(999);
    
    //  一样是以装饰模式，传入字节输出流，使其增加写入Long类型数据的功能
    DataOutputStream dos = new DataOutputStream(fos);


    dos.writeLong(a); // 按照基本数据大小写入数据，long8个字节, 写入数据，默认字节流是按照1个字节写入数字j'
    dos.writeLong(b);
    dos.writeLong(c);
    // 写入3个Long，所以文件大小显示是3 * 8 = 24字节
    // 打开文件是乱码！
  }


}


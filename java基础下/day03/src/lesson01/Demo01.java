package lesson01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01{
  public static void main(String[] args) throws IOException{
    // 案例： 拷贝图片【优化一，这种方式在大文件下部建议使用 , 不适合视频，如，电脑的内存只有2G,电影的字节有3G,则立刻崩溃】
    /** 前面拷贝拖的问题： 每次只读一个字节，写入的时候，
     * 也是一个字节一个字节写，如果有10万个字节，就要读10万次，写10万次 
     *
     * 字节数组拷贝值avilable()方法
     *
     * 图片目录 /home/ipfsmain/java_lesson/java基础下/day03/src/lesson01/testpicture.jpg
     */

    // 1. 文件输入流
    FileInputStream fis = new FileInputStream("/home/ipfsmain/java_lesson/java基础下/day03/src/lesson01/testpicture.jpg");

    int size = fis.available(); // 返回文件的防毒【字节单位】
    System.out.println("文件大小:" + size);

    // 2. 现在一次读文件大小的字节
    // 2.1 定义一个字节数组， 而这个字节数组初始化的长度就是图片的字节长度size
    byte[] bytes = new byte[size]; // x相当于现在是一个空杯子
    
    // 2.2 把数据读到字节数组中
    int r = fis.read(bytes); // read 可以传字节数组，则会根据数组的长度，把读取的数据放在数组内 
                            // 返回值是读取到的实际长度
    System.out.println("r：" + r);

    // 3 把字节数组一次性写入文件夹中
    // 3.1 定义输出流
    FileOutputStream fos = new FileOutputStream("/home/ipfsmain/java_lesson/java基础下/day03/src/lesson01/testpicture-副本.jpg");

    // 3.2 写数据
    fos.write(bytes); //write,也是能传入字节数组，然后一次吧数据写入文件内

    System.out.println("写入成功");

    // 3.4 退出流
    fos.close();


    
  }




}

package lesson02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 杯子思想， 缓冲思想
 */
public class Demo01 {
  public static void main (String[] args) throws IOException{

    // ### 02.案例拷贝图片【优化二、这种方式开发中建议经常使用】
    /** 
     * 1. 每次只读一个字节，又觉得太慢
     * 2. 一次性读完整个文件夹的所有数据，又怕内存不够
     * 如： 内存只有2G, 视频3G ，内存溢出
     *
     * 最终解决方案： 折中，定义每次读8kb（具体看计算机性能而定）
     */


    // 定义输入流， 输出流
    FileInputStream fis = new FileInputStream("/home/ipfsmain/java_lesson/java基础下/day03/src/testpicture.jpg");
    FileOutputStream fos = new FileOutputStream("/home/ipfsmain/java_lesson/java基础下/day03/src/testpicture-副本.jpg");

    // 定义8kb字节空数组
    byte[] bytes = new byte[8 * 1024];

    int len = 0; 
    int i = 0;
    while ((len = fis.read(bytes)) != -1){ //根据数组的容量，把读取的数据存放到数组内
      i++; 
      // 写入文件
      // 最后一个是小于8kb， 则最后一个字节数组会有很多无效数组数据（默认为0), 所以写入的数组开始和结束索引要和读去的实际字节数组长度一致
      fos.write(bytes, 0, len); // 把数组数组写入文件，并从0 ， len的长度
      
    }
    System.out.println(i);

    // 关闭流
    fis.close();
    fos.close();
  }

}


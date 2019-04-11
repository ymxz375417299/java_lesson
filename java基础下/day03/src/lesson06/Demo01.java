package lesson06;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {
  public static void main (String[] args) throws IOException{
    // 字节流读写中文乱码问题
    
    // 1. 读数据
    FileInputStream fis = new FileInputStream("a.txt");

    // 读
    // 定义字节数组【杯子思想，缓冲区思想】
    //
    /**
     * 在UTF-8编码中， 一个中文占3个字节，英文占用1个字节
     * 在GBK编码中，一个中文占2个字节
     * 这样就有个问题了！ 如果我们定义字节数组的长度是2， 在UTF-8中，是无法把2个字节转成中文的。所以会出现乱码
     *      如果定义3个字节，则读取GBK时（占2个字节），就会出现显示中文+？乱码 ,就算判断文件的编码类型，但是中文和英文占位长度也不同，
     *      所以无法完全兼容
     * 解决防范： Java提供了一个类Reader(字符流), 一个个字符就行，不同字符不同长度，就自动定义不同的数组长度即可
     */

    int len = 0;
    byte[] buf = new byte[3];
    while((len = fis.read(buf)) != -1){
      System.out.println(len);
      // 把字节转成字符串
      String s = new String(buf, 0, len);
      System.out.println(s);
    }

    
  }

}


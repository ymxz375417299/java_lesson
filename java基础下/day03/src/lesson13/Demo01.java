package lesson13;

import java.io.FileReader;
import java.io.IOException;

/**
 * 以后读纯文本文件，使用FileReader这个类！
 * 为什么？
 * 因为我们不用考虑中文乱码问题！
 *
 * 1. read方法是读取字符char
 * 2. 一个字符可能占用1个字节，2个字节，或者3个字节
 * 3. 占用字节个数根据码表的类型决定（ASCII: 1个字节， GBK: 2个字节， unicode: 3个字节）
 * 4. 用int表示字节(int是4个字节的)，假如读取2个字节， int有4个字节，前面两个字节可以补0
 * 5. GBK,unicode中，中文的字符的第一个字节都是负数，所以知道怎么去读取
 * 5. FileReader 读取的方式与FileInputStream字节流差不多。
 */

public class Demo01 {

  public static void main (String[] args) throws IOException {
    /**
     * FileReader 用于读取字符
     */

    // 1. 创建对象
    FileReader reader = new FileReader("a.txt");

    /**
     * reader() 读取单个字符（字节流，是读取单个字节）， 返回单个字符 int类型 用int装单个字符，如果读到末尾返回-1
     */ 
    // 2. 读取数据
    System.out.println((char) reader.read()); //读取单个字符，返回值为int， 再用char 强制转换成字符打印出来
    System.out.println((char) reader.read()); //读取单个字符，返回值为int， 再用char 强制转换成字符打印出来
    System.out.println((char) reader.read()); //读取单个字符，返回值为int， 再用char 强制转换成字符打印出来
    System.out.println((char) reader.read()); //读取单个字符，返回值为int， 再用char 强制转换成字符打印出来
    System.out.println((char) reader.read()); //读取单个字符，返回值为int， 再用char 强制转换成字符打印出来

    int a = 0;
    while ( (a = reader.read()) != -1){
      System.out.println((char) a);
    }

    
    // 3. 关闭流
    reader.close();

    
  }

  /**
   * 验证Utf-8的中文字符首位是负
   */
  public static void test1(){
    // 读字节



  }
}


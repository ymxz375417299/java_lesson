package lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;

public class Demo01 {
  public static void main (String[] args) throws IOException{
    // 练习： 根据用户输入的文件[图片]，拷贝文件到当前项目目录
    

    // 1. 获取用户输入的文件路径
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入一个文件路径【请不要输入文件夹路径】");
    String path = scanner.nextLine();

    // 2. 判断这个路劲是否为文件
    File file = new File(path);
    if(file.isDirectory()){
      System.out.println("您输入的不是一个文件");
      return ;
    }


    // 3. 如果是文件就拷贝
    // 3.1 输入流
    FileInputStream fis = new FileInputStream(path);
    FileOutputStream fos = new FileOutputStream(path + "-副本");

    // 3.2 读写【考虑性能 缓冲区8kb】
    byte[] bytes = new byte[8 * 1024];

    int len = 0;
    while ( (len = fis.read(bytes)) != -1){ // read（）方法传入字节数组byte[]时，会根据字节数组的长度，把文件数据赋值给数组，并返回实际读取的字节长度jm
      System.out.println("本次读取的字节长度:" + len);
      fos.write(bytes, 0, len); // write() ,方法传入字节数组byte[]时，会把该数组的数据(read()的时候已经往字节数组写入数据))，写进文件， 并可以指定起始的索引。
    }

    // 关流
    fis.close();
    fos.close();

    System.out.println("文件拷贝成功");

  }

}


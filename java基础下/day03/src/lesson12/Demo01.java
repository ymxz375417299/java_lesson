package lesson12;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;

public class Demo01 {

  public static void main (String[] args) throws IOException{
    // 练习： 录入数据备份到文件

    /** 
     * 根据用户在键盘中输入的内容，然后下到一个文件夹中去 
     */

    // 1. 创建一个文件夹输出流
    FileOutputStream fos = new FileOutputStream("lesson12.txt");

    // 2. 创建Scanner对象
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入需要录入的内容。。输入quit代表退出");
    // 3. 通过四循环来获取用户输入【当输入quit， 代表不录入】
    while(true){
      String line = scanner.nextLine();
      if (line.equals("quit")){
        break;
      }


      // 写入文件
      fos.write(line.getBytes()); // 因为每次写入都是一个字节的。 所以需要把字符串转字符数组byte[] <String.getBytes())>
      for (byte i : line.getBytes()){
        System.out.println(i);
      }
      System.out.println("写入的字符串的字节数组的内存地址: " + line.getBytes());

      // 换行
      fos.write("\r\n".getBytes());;
    }

    // 4. 关流
    fos.close();

  }
}


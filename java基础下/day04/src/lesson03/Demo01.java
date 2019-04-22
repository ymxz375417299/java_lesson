package lesson03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo01 {
  public static void main (String[] args) throws IOException{
    /**
     * BufferedReader的readLine()讲解
     * 1 readLine(),每次读取一行数据
     */

    // 1. 创建Reader
    FileReader fr = new FileReader("a.txt");
    BufferedReader br = new BufferedReader(fr);

    // 2. 读取一行数据
    // System.out.println(br.readLine());
    // System.out.println(br.readLine());

    String line = null;
    int i = 0;
    while ((line = br.readLine()) != null ){
      i ++;
      System.out.println(line);
      System.out.println(i);
    }
    // 3. 关闭流
    br.close();

  }

}


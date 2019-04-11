package lesson11;

import java.io.File;
import java.io.IOException;

import java.util.Scanner;

public class Demo01 {

  public static void main (String[] args) throws IOException {
    /**
     * 练习： 从键盘输入接受一个文件夹路径，打印该文件夹下所有的。jpg文件夹
     *
     */

    // 1, 获取文件路径
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入一个文件夹路径");
    String path = scanner.nextLine();

    // 2. 把路径封装成File类
    File file = new File(path);
    if ( !file.exists()){
      System.out.println("此路径不存在！");
      return;
    }

    if (!file.isDirectory()){
      System.out.println("请输入文件夹路径，而不是文件路径");
      return;
    }

    // 3. 递归遍历文件夹下的子文件夹
    printSubFile(file);
  }

  public static void printSubFile(File dir){
    // 获取目录下的所有子文件夹
    File[] subfiles = dir.listFiles();
    // 遍历
    for (File f : subfiles){
      // 如果是文件夹，则递归继续找子文件夹
      if (f.isDirectory()){
        System.out.println("递归");
        printSubFile(f);
      }else{
        if (f.getName().endsWith(".java")){
          System.out.println(f.getAbsolutePath());
        }
      }

    }
  }
}




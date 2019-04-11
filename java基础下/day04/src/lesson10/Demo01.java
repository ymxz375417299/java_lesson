package lesson10;

import java.io.File;

public class Demo01 {

  public static void main (String[] args) {
    /**
     * 10 递归-文件目录讲解
     * 需求： 打印目录下所有的文件名称，包括子文件夹的文件
     */

    // 1. 创建目录对象
    File dir = new File("/home/ipfsmain/java_lesson/java基础下/day04/src");

    // 2. 打印目录的子文件
    printSubFile(dir);

    
  }

  /**
   * 打印目录的子文件
   */

  public static void printSubFile(File dir){
    // 打印目录的子文件
    File[] subfiles = dir.listFiles(); // 返回该目录的所有File类
    // 遍历
    for (File f : subfiles){
      if (f.isDirectory()){
        // 如果是文件夹，则遍历里面的文件， 即调用
        printSubFile(f);
      }else{
        // 如果是子文件，则打印
        System.out.println(f.getAbsolutePath());
      }
    }

  }
}


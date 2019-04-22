package lesson08;

import java.io.File;
import java.io.FilenameFilter;

public class Demo01 {
  public static void main (String[] args) {
    //## 文件名称过滤器的概述及使用
    // FilenameFilter：反馈数组之前，先把不符合条件的元素去除
    //### 文件名称过滤器的概述
    //- public String[] list(FilenameFilter filter)
    //- public File[] listFiles(FileFilter filter)
    //
    //
    //### 文件名称过滤器的使用
    //需求: 判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出这该文件名称
    //
    //### 源码分析
    //带文件名称过滤的list()的方法的源码（内部帮我们调用方法过滤）
    
    /**
     * 回顾之前的过滤实现
     */
     // 1. 创建一个文件对象
    File file = new File("/home/rock/java_lesson/java基础下/day02/src");

    // 2. 获取目录下所有的子文件名称
    // String[] subFilenames = file.list();
    // for(String fn : subFilenames){
      // System.out.println(fn);
    // }

    // 返回。jpg的文件对象数组
    File[] subfiles = file.listFiles(new FilenameFilter(){
      @Override
      public boolean accept(File dir, String name){
        return name.endsWith(".png");
      }
    });

    // 遍历
    for (File f : subfiles){
      System.out.println(f.getAbsolutePath());
    }


  }

  public static void test1(){
    /** 
     * 使用FilenameFilter: 文件名称的过滤器
     * 是一个接口 ,本案例不写类来实现，直接使用匿名内部类
     */

     // 1. 创建一个文件对象
    File file = new File("/home/rock/java_lesson/java基础下/day02/src");

    String[] subFilenames = file.list(new FilenameFilter(){ // 匿名内部类
      @Override
      public boolean accept(File dir, String name){
        // 如果返回true则把该String name放进数组
        return name.endsWith(".png"); // 如果是以png结尾, endsWith是有值，有值则true

      }
    });

    System.out.println("==遍历文件过滤器FiileNameFilter===");
    // 遍历
    for (String sf : subFilenames){
      System.out.println(sf);
    }
  }
}


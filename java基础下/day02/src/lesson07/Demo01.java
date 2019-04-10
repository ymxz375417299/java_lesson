package lesson07;

import java.io.File;

public class Demo01 {
  public static void main(String[] args) {
    // ### 07.案例输出指定目录下指定后缀的文件名讲解
    // 需求： 判断指定目录下是否有后缀为.png， 如果有，就输出文件名称

    // 打印│/home/rock/java_lesson/java基础下/day02/src
    // test1();

    // 1. 创建一个File对象
    File file = new File("/home/rock/java_lesson/java基础下/day02/src");

    // 2. 获取目录下的所有子文件File数组
    File[] files = file.listFiles();
    for (File f : files){
      if (f.getAbsolutePath().endsWith(".png")){
        System.out.println(f.getAbsolutePath());
      }
    }


  }

  public static void test1(){
    // 1. 创建一个File对象
    File file = new File("/home/rock/java_lesson/java基础下/day02/src");

    // 2. 获取目录下所有子文件
    String[] fileNames = file.list();

    // 3. 遍历
    for (String fileName : fileNames) {
      if (fileName.endsWith(".png")) {
        System.out.println(fileName);
      }
    }
  }
}

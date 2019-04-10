package lesson05;

import java.io.File;

public class Demo01 {

  public static void main (String[] args) {
    //### File类的判断功能
    //- public boolean isDirectory(); 判断是否是目录（文件夹）
    //- public boolean isFile(); 判断是否是文件
    //- public boolean exists(); 判断是否存在
    //- public boolean canRead(); 判断是否可读
    //- public boolean canWrite(); 判断是否可写
    //- public boolean isHidden(); 判断是否隐藏
  
    // 1. 创建文件对象
    File file1 = new File("/home/rock/java_lesson/java基础下/day02/src/lesson05/b");
    File file2 = new File("/home/rock/java_lesson/java基础下/day02/src/lesson05/b.txt");


    // 2. 判断file文件对象的类型
    System.out.println("file1文件是否文件夹 :" + file1.isDirectory());
    System.out.println("file1文件是否是文件：" + file1.isFile());

    System.out.println("=====");
    System.out.println("file2文件是否文件夹 :" + file2.isDirectory());
    System.out.println("file2文件是否是文件 :" + file2.isFile());

    // 3. 判断文件是否存在
    File file3 = new File("/home/rock/java_lesson/java基础下/day02/src/lesson05/b.txt");
    System.out.println("=====");
    System.out.println("file3是否存在：" + file3.exists());

    // 4. 判断文件是否可读 【基本不用】
    System.out.println("===");
    System.out.println("File3文件是否可读 :" + file3.canRead());

    // 5. 判断文件是否可写 【基本不用】
    System.out.println("===");
    System.out.println("file3是否可写：" + file3.canWrite());

    // 6. 判断文件是否隐藏
    System.out.println("====");
    System.out.println("file3是否隐藏：" + file3.isHidden());

  }

}


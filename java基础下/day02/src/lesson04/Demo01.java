package lesson04;

import java.io.File;

public class Demo01 {
  public static void main (String[] args) {
    // i### 04.File 的删除文件功能讲解04.File 的删除文件功能讲解
    // - public boolean delete(); 删除文件或文件夹
    //
    // ### 删除注意事项
    // 1. Java中删除不走回收站
    // 2. 要删除一个文件夹，请注意，该文件夹内不能包含文件或者文件夹
    
    // 1. 创建一个文件对象绑定b文件夹
    File file = new File("/home/rock/java_lesson/java基础下/day02/src/lesson04/b");

    // 2. 删除
    boolean b1 = file.delete();
    System.out.println(b1);
    

  }

}


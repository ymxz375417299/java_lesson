package lesson03;

import java.io.File;

public class Demo01 {
  public static void main (String[] args) {
    //# File类的重命名和删除功能
    //### 重命名和删除功能
    //public boolean renameTo(File dest): 把文件充满为指定的文件路径，传入的模板对象是File类型
    //public boolean delete(); 删除文件夹或者文件夹
    //
    //
    //### 重命名注意事项
    //如果路径名相同，就是改名
    //如果路径名不同，就是改名并剪切
    
    // 需求： 把│/home/ipfsmain/java_lesson/java基础下/day02/src/a.txt 文件名改成hello.txt
    File file1 = new File("/home/ipfsmain/java_lesson/java基础下/day02/src/a.txt");
    File dest1 = new File("/home/ipfsmain/java_lesson/java基础下/day02/src/hello.txt");
    // 重命名
    boolean b1 = file1.renameTo(dest1);
    System.out.println(b1);

    //### 重命名注意事项
    //如果路径名相同，就是改名
    //如果路径名不同，就是改名并剪切
    File file2 = new File("/home/ipfsmain/java_lesson/java基础下/day02/src/hello.txt");
    File dest2 = new File("/home/ipfsmain/java_lesson/java基础下/day02/src/lesson03/hello.txt");
    boolean b2 = file2.renameTo(dest2);
    System.out.println(b2);
  }

}


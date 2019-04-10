package lesson02;


import java.io.File;
import java.io.IOException;

public class Demo01 {
  public static void main (String[] args) throws IOException{
    // # File类的创建功能
    // ### 创建功能
    // public boolean createNewFile(); 创建文件，如果存在这个创建就不创建
    // public boolean mkdir(); 创建文件夹，如果存在这个文件夹，则不创建
    // public boolean mkdirs(): 创建文件夹，如果父文件夹不存在，会帮你创建出来
    //
    // ### 注意事项： 
    // 如果你创建文件，或者文件夹忘记写盘符路径，那么默认在项目路径下的。
    
    // 1. 在制定的路径创建一个文件
    File file1 = new File("/home/ipfsmain/java_lesson/java基础下/day02/src/lesson02/test1.txt"); //创建File对象，并绑定路径
    boolean b1 = file1.createNewFile();  // 创建文件
    System.out.println(b1);

    // 2. 在制定的路径创建文件加
    File file2 = new File("/home/ipfsmain/java_lesson/java基础下/day02/src/lesson02/file1");
    boolean b2 = file2.mkdir(); // mkdir 
    System.out.println(b2);
    
    // 3. 创建多层文件加
    File file3 = new File("/home/ipfsmain/java_lesson/java基础下/day02/src/lesson02/file2/d/d/d/d/");
    boolean b3 = file3.mkdirs();
    System.out.println(b3);
    
    // ### 注意事项： 
    // 如果你创建文件，或者文件夹忘记写盘符路径，那么默认在项目路径下的。
    
    // 4. 在项目路径下创建一个a.txt文件
    File file4 = new File("a1.txt");
    System.out.println(file4);
    file4.createNewFile(); // 创建
  }

}


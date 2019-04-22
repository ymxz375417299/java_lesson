package lesson06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
  public static void main (String[] args) {
    //### File类的获取功能
    //- public String getAbsolutePath(); 获取绝对路径
    //- public String getPath(): 获取路径
    //- public String getName(); 获取文件名
    //- public Long length*() ; 获取长度。 字节数
    //- public long lastModified(); 获取最后一次修改时间，毫秒值
    //- public String[] list(); 获取指定目录下的所有文件夹或者文件夹的名称数组
    //- public File[] listFiles(); 获取指定目录下的所有文件或者文件夹的File数组
    
    // 1. 获取绝对路径
    File file1 = new File("a/a.txt");
    System.out.println("file1的绝对路径：" + file1.getAbsolutePath());

    // 2. 获取路径
    System.out.println("file1路径：" + file1.getPath()); // 就是构造方法传入的路径

    // 3.获取文件夹
    System.out.println("file1的名称：" + file1.getName());

    // 4. 获取长度，单位字节数
    File file2 = new File("/home/rock/java_lesson/java基础下/day02/src/1.txt");
    System.out.println("file2的文件大小：" + file2.length());

    // 5. 获取文件修改的时间，毫秒值
    long time = file2.lastModified();
    System.out.println("最后修改时间，毫秒：" + time);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // 创建格式化时间对象
    Date date = new Date(time); // 创建Date对象，并传入时间戳字符串，
    System.out.println("文件最后修改时间" + sdf.format(date)); // 格式化时间

    System.out.println("==========");
    // 6. 获取指定目录下所有文件
    System.out.println("/home/rock/java_lesson/java基础下/day02/src目录下的所有文件");
    File file3 = new File("/home/rock/java_lesson/java基础下/day02/src");
    String[] files = file3.list(); // 只获取文件名的数组
    for (String f : files){
      System.out.println(f);
    }
    
    System.out.println("====");
    File[] fs = file3.listFiles(); // 获取File对象的数组，可以根据需求获取对应的属性，如绝对路径

    for (File f : fs){
      System.out.println(f.getAbsolutePath()); // 绝对路径
      System.out.println(f.length()); // 字节长度
      System.out.println("...");
    }


  }

}


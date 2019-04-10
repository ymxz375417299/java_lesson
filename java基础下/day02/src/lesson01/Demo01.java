package lesson01;

import java.io.File;


public class Demo01 {

  public static void main (String[] args) {
    //# File类的概述和构造方法
    //### File文件
    //1.  File更应该叫一个路径那个，文件路径或者文件夹路径
    //    1. 路径分为绝对路径和相对路径
    //        2. 绝对路径是一个固定的路径，从盘符开始  
    //                C：\Users\10301\Dex.........
    //                    3. 相对路径相对于某个位置，在eclipase下是指当前项目下，在dos下
    //                    2. 查看Api指的是当前路径
    //                    3. File是指文件和目录路径名的抽象表现形式
    //
    //
    //                    ### 构造方法
    //                    - File(String pathname): 根据一个路径得到File对象 
    //                    - File(String parent, String child): 根据一个目录和一个子文件/目录得到File对象
    //                    - File(File parent, String child); 根据一个父File对象 和一个子文件/目录得到File对象
    


    // 路径的写写法2: 如果C:\Users\10301\Desktop\a.txt ，在java中需要在每个斜杠前再加一个斜杠，这代表转义
    String pathname1 = "\\home\\ipfsmain\\java_lesson\\java基础下\\day02\\src\\1.txt";
    // 路径写法2： 把每个斜杠改成反斜杠
    String pathname2 = "/home/ipfsmain/java_lesson/java基础下/day02/src/1.txt";

    //1. 创建一个文件对象 (传入文件路径）
    File file1 = new File("pathname1"); // 文件对象已经关联到桌面文件

    System.out.println("file1:" + file1); // toString输出的是对象名

    //2. 再创建一个文件对象 (传入2个路径进行拼接）
    File file2 = new File("/home/ipfsmain/java_lesson/java基础下/day02/src" + "1.txt");
    System.out.println("file2:" + file2); // 输出的是路径

    // 3. 再创建一个文件对象 (传入一个文件对象，和一个文件名字符串）
    // 3.1 把文件夹封装成对象
    File desktopFolder = new File("/home/ipfsmain/java_lesson/java基础下/day02/src"); 
    System.out.println(desktopFolder); //toString，输出文件路径
    File file3 = new File(desktopFolder, "1.txt"); // toString 输出了文件夹路径
    System.out.println(file3);

  }
}


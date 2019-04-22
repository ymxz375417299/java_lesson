package lesson14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
  public static void main (String[] args) throws IOException {
    // 案例： 拷贝图片
    // 图片路径：/home/rock/java_lesson/java基础下/day02/src/lesson14/testpicture.jpg
    
    // 1. 先创建输入流对象和输出流对象
    FileInputStream fis = new FileInputStream("/home/rock/java_lesson/java基础下/day02/src/lesson14/testpicture.jpg");
    FileOutputStream fos = new FileOutputStream("/home/rock/java_lesson/java基础下/day02/src/lesson14/testpicture2.jpg");

    // 2. 通过输入流读取图片的数据
    int b = 0;
    while ((b=fis.read()) != -1){
      // 3. 通过输入流写入图片数据
      fos.write(b);
    }
    
    // 3. 关闭流
    fos.close();
    fis.close();

    System.out.println("图片拷贝成功！");
    
    // 遗留问题： 每一个字节拷贝和赋值，性能非常低，以后的课程会说！
  }

}


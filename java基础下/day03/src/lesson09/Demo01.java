package lesson09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
  public static void main (String[] args) throws Exception{
    // 流的标准处理异常代码 1.7代码

    /** 
     * 1. 把流对象生命放在try()货号里面
     * 2.  操作流【读写数据】的代码放在花括号里面
     * 3. 这样写不用关闭流，java自动关闭流
     *
     * 4. 在Try的括号里面的对象，必须实现了AUtoCloseable的接口，如FileInputStream, FileOutputStream
     */

    try(
      FileInputStream fis = new FileInputStream("a.txt");
      FileOutputStream fos = new FileOutputStream("b.txt");

      // 声明自己的一个输入流 并实现了AutoCloseable
      MyInputStream myis = new MyInputStream(); //抛出的Exception 异常

    ){
      int a = 0;
      while ((a = fis.read()) != -1){
        fos.write(a);
      }
    }
    


    
  }

}


class MyInputStream implements AutoCloseable{
  @Override
  public void close() throws Exception{
    System.out.println("我的输入流关闭了。。。");
  }
}

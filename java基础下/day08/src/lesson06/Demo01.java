package lesson06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo01 {
  public static void main(String[] args) throws ClassNotFoundException, IOException{
    // Class类的静态方法forName()读取配置文件

    // 1. 读取info.txt文件内容
    FileReader fr = new FileReader("info.txt");
    // 读取异常
    // 使用BufferedReader装饰
    BufferedReader br = new BufferedReader(fr);
    // String className = "com.gyf.model.Dog"; // 像这种配置信息最好写在单独的配置文件，因为我们最后会编译成.class文件，以后要改，就直接改配置文件夹就行了
    String className = br.readLine();
    Class clz = Class.forName(className);
    System.out.println(clz);
  }
}

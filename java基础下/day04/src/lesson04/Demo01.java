package lesson04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
  public static void main (String[] args) throws IOException {
    /**
     * BufferedWriter的newLine()方法讲解
     * newLine() 换行
     */

    // 往b.txt写a.txt文件的内容【一行一行拷贝 , 读一行写一行】
    
    // 1. 创建Reader
    FileReader  fr = new FileReader("a.txt");
    BufferedReader br = new BufferedReader(fr);

    // 2. 创建Writer
    FileWriter fw = new FileWriter("d.txt");
    BufferedWriter bw = new BufferedWriter(fw);

    // 3. 读一行写一行
    String line = null;
    while ((line = br.readLine()) != null){
      bw.write(line);
      // 添加换行
      // bw.write("\n\r"); // 以前的写法
      bw.newLine(); // 换行
    }
    
    // 4. 关闭流
    br.close();
    bw.close();

  }

}


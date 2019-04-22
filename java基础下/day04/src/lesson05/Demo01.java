package lesson05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {
  public static void main (String[] args) throws IOException {
    /**
     * ### 案例： 将文本反转
     * 一个文本文档上的文本饭庄，第一行和倒数第一行交换，第二行和倒数第二行交换
     *
     * ```
     * - a.txt
     *     - AAAA
     *     - BBBB
     *     - CCCC
     *
     * - b.txt
     *     - CCCC
     *     - BBBB
     *     - AAAA
     */
    
     // 1. 把文本每一行内容读取出来存在List<String>中
     // 1.1 集合对象
     List<String> list = new ArrayList<String>();

     // 1. 2 一行行读取文件
     // 创建BufferReader 和BufferWriter字符缓冲对象
     BufferedReader br = new BufferedReader(new FileReader("a.txt"));
     BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));


     // 读写
     String line = null;
     while((line = br.readLine()) != null ){
       list.add(line);
     }
     // System.out.println(list);

     // 2. 我们要写入文件的时候，倒叙保存List 集合中的内容到文件中
     for (int i = list.size() - 1; i >= 0; i--){
       bw.write(list.get(i)); // 写入文件
       bw.newLine();
     }

     System.out.println("Finish !");
     // 关闭流
     bw.close();
     br.close();
  }

}


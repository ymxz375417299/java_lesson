package lesson02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
  public static void main (String[] args) throws IOException {
    /**
     *
     * ### 回顾： 带缓冲的字节流， BufferedInputStream/BufferedOutputStream
     * 这两个类，内部都一个缓冲区，字节数组 byte[]
     * 2. br.read()方法，内部会读 8 * 1024个字符
     * 3. bw.write() 方法，内部会写入 8 * 1024个字符
     *
     * 2 带缓冲的字符流 BufferedReader / BufferedWreter
     * 这两个类，内部都有一个缓冲区， 字符数组 char[]
     *
     * 
     *
     */
    
    // 需求： 拷贝文件， a.txt -> b.txt

    // 1. 创建FileReader并传入给BufferReader
    FileReader fr = new FileReader("a.txt");
    BufferedReader br = new BufferedReader(fr);

    // 2. 创建FileWriter 并传入给BufferWriter
    FileWriter fw = new FileWriter("b.txt");
    BufferedWriter bw = new BufferedWriter(fw);

    // 3. 读写
    // 虽然和单个字符读取操作一样，但是java内部会先把数据一个个读取放输入缓冲区，满8 * 1024个字符，再一个个先放在输出的缓冲区，满8 * 1024个字符，再一次写入文件内的
    int c = 0;
    while ((c = br.read()) != -1){
      bw.write(c);
    }

    System.out.println("copy sucess!");

    // 关流
    br.close(); // 内部是关FileReader流
    bw.close(); // 内部是关FileWriter流
  }


}


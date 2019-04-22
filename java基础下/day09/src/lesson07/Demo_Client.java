package lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import java.io.PrintWriter;

public class Demo_Client {
  public static void main (String[] args) throws IOException{
    
    // 1. 创建Socket对象
    Socket socket = new Socket("127.0.0.1", 9999);

    // 2. 获取输入输出字节流
    InputStream is = socket.getInputStream();
    OutputStream os = socket.getOutputStream();

    // 包装成输入输出的字符流
    // 问题： 为什么不能直接传is,而是还要创建InputStreamReader对象
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
    PrintWriter pw = new PrintWriter(os);

    // 3. 发送数据给服务端面
    pw.write("java 还是不错的..\r\n"); // 因为服务端是 一行一行读，所以也要发换行符
    pw.flush(); // 必须先把输出流flush方法， 才会刷进内存

    // 4. 读取服务响应的数据
    System.out.println("读取服务端响应：" + br.readLine());

    // 关流
    br.close();
    socket.close();
    

  }

}


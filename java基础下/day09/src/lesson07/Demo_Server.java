package lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import java.io.PrintWriter;

public class Demo_Server {
  public static void main (String[] args) throws IOException{
    
    // 1. 创建服务器Socket对象，绑定端口
    ServerSocket serverSocket = new ServerSocket(9999);

    // 2. 监听客户端连接
    // 使用死循环，不断监听
    while(true){
      Socket clientSocket = serverSocket.accept(); //ServerSocket.accept监听连接
                                  // 如果有，则返回Socket对象
                                  //
      // 3. 接受客户端发送的数据
      // 使用多线程，连接一个则创建一个线程，来创建soket对象jJ
      new Thread(){
        @Override
        public void run(){
          try{
            // 读取数据都是通过网络IO输入输出流
            InputStream is = clientSocket.getInputStream();// 获取clientSocket服务端套节字对象
            //的输入流

            // 获取输出字节流对象
            OutputStream os = clientSocket.getOutputStream();
            // 包装成字符流， 使用BufferedReadr 缓冲字符输入流来处理字符串
            BufferedReader br = new BufferedReader(new InputStreamReader(is)); //  InputStreamReader 是在内存中操作的字节流
            PrintWriter pw = new PrintWriter(os); // 包装打印写入流

            // 死循环获取客户端信息
            while(true){
              // 读客户端的数据
              String line = br.readLine();// 读一行数据
              if (line != null){
                System.out.println(new Date() + "接受到客户端发售的数据：" + line);
                System.out.println("打印Socket对象看看 " + clientSocket);
              }

              // 响应客户端
              pw.write("receiver success\r\n"); // 使用println也行
              pw.flush(); // 必须先把输出流flush方法， 才会刷进内存
            }
          }catch(Exception e){
            
          }

        }
      
      }.start();
    }
    
  }

}


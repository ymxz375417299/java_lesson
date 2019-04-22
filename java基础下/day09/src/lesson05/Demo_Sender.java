package lesson05;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.util.Scanner;

public class Demo_Sender {
  public static void main(String[] args) throws Exception {
    // ### 发送方send
    // 1. 创建DatagramSocket对象 , 随机端口
    DatagramSocket sender = new DatagramSocket();

    //  2. 获取键盘输入
    Scanner scanner =  new Scanner(System.in);
    while(true){
      // 2. 创建DatagrmPacket， 指定数据，长度， 地址， 端口
      System.out.println("请输入内容：");
      String s = scanner.nextLine();
      byte[] bs = s.getBytes("UTF-8"); // 把字符串转成字符数组 // 指定UTF-8
      // 创建数据包，传入字符数组，字符数组长度，Inet3Address的ip地址对象，端口号
      DatagramPacket dp = new DatagramPacket(bs, bs.length, Inet4Address.getByName("192.168.3.5"), 5288);
      // 3. 使用DatagramSocket发送DatagrampPacket数据包
      sender.send(dp);
      if (s.equals("quit")){
        // 关闭套节字
        sender.close();
        break;
      }

    }

  }
}

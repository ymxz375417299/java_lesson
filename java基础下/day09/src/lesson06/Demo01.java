package lesson06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;

import java.util.Scanner;

public class Demo01 {
  public static void main (String[] args) {
    // 案例 UDP数据传输+键盘循环+双线程实现
    // 开启双线程
    new Receiver().start();
    new Sender().start();

  }

}

// 接受方，继承线程
class Receiver extends Thread{
  @Override
  public void run(){
    //### 接受方Receive
    try{
      //1. 创建DatagramSocket,==指定端口==
      DatagramSocket receiver = new DatagramSocket(5288);

      while (true){
        //2. 创建DatagrmPacket数据包，用来装接受的数据包， 指定字符数组最大长度
        byte[] buf = new byte[1024]; // 数组最大长度1024 , 1kb
        DatagramPacket packet = new DatagramPacket(buf, 1024); // 固定接受1024长度，到时根据获取的字节数组长度，获取指定位置的数据即可

        //3. 使用DatagramSocket接受DatagramPacket 并存在buf字节数组内
        receiver.receive(packet);
        //4. 从DatagramPacket中获取数据
        // 把字节数组的对象转为字符串,并指定起始和结束的索引，指定编码格式
        String s = new String(buf, 0, packet.getLength(), "UTF-8");
        System.out.println("接受到数组：" + s);
        //5. 关闭DatagramSocket
        if (s.equals("quit")){
          receiver.close();
          break;
        }
      }
    }catch(Exception e){
      e.printStackTrace();

    }

  }
}

// 发送方，继承线程
class Sender extends Thread{
  @Override
  public void run(){
    try{
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
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}

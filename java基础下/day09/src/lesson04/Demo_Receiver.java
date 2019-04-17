package lesson04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo_Receiver {

  public static void main (String[] args) throws Exception{
    //### 接受方Receive
    //1. 创建DatagramSocket,==指定端口==
    DatagramSocket receiver = new DatagramSocket(5288);
    //2. 创建DatagrmPacket数据包，用来装接受的数据包， 指定字符数组最大长度
    byte[] buf = new byte[1024]; // 数组最大长度1024 , 1kb
    DatagramPacket packet = new DatagramPacket(buf, 1024); // 固定接受1024长度，到时根据获取的字节数组长度，获取指定位置的数据即可

    //3. 使用DatagramSocket接受DatagramPacket 并存在buf字节数组内
    receiver.receive(packet);
    //4. 关闭DatagramSocket
    receiver.close();
    //5. 从DatagramPacket中获取数据
    // 把字节数组的对象转为字符串,并指定起始和结束的索引，指定编码格式
    String s = new String(buf, 0, packet.getLength(), "UTF-8");
    System.out.println("接受到数组：" + s);
  }
}


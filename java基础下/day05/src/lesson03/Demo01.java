package lesson03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo01 {
  public static void main (String[] args) throws IOException, ClassNotFoundException{
    // 对象操作ObjectOutputStream & ObjectInputStream

    /**
     * 一，ObjectOutputStream 将一个对象写入文件
     *    1 使用这个类写入对象，这个对象需要序列化, 
     *    2 序列化就是让对象实现一个接口Serializable
     *    3 如果没实现Serializable 接口，会抛异常
     * ObjectInputStream 从文件张读取一个对象
     */

    // 案例： 从文件取出女朋友对象
    
    // 1. 创建一个对象的输入流
    FileInputStream fis = new FileInputStream("gf.txt");
    ObjectInputStream ois = new ObjectInputStream(fis); // 需要把字节输入流传给对象输入流

    // 2. 读数据
    /**
     * 如果没有数据可读，强制读会报错EOFEXceptioon 流的末尾已经没有对象可以取
     */
    Object obj1 = ois.readObject(); // 从对象输入流取一个对象， 还需要抛多个异常 ClassNotFoundException才行
    GirlFriend gf1 = (GirlFriend) obj1; // 强制类型转换，把Object转成GirlFriend
    Object obj2 = ois.readObject(); // 从对象输入流取一个对象
    GirlFriend gf2 = (GirlFriend) obj1; // 强制类型转换，把Object转成GirlFriend
    System.out.println(obj1.getClass());
    System.out.println(obj2.getClass());



  }

  /**
   * 案例： 将对象直接存入文件
   */
  public static void test1() throws IOException{
    //案例： 将文件直接存入文件
    // 1. 创建女朋友对象
    GirlFriend gf1 = new GirlFriend("林志玲", 1.78);
    GirlFriend gf2 = new GirlFriend("林心如", 1.68);


    // 2. 创建字节输出流和对象输出流
    FileOutputStream fos = new FileOutputStream("gf.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos); // 把字节输出流FileOutputStream对象传给对象输出流ObjectOutputStream对象进行关联

    // 3. 把对象传给 对象输出流ObjectOutputStream对象oos
    oos.writeObject(gf1);
    oos.writeObject(gf2); // 可以传入对象

    // 3. 关流
    oos.close(); // 只需要关对象输出流对象就行了
  }

}

// 对象需要实现Serializable
class GirlFriend implements Serializable{
  String name;
  double height;
  public GirlFriend(String name, double height){
    this.name = name;
    this.height = height;
  }
}

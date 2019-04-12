package lesson05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo02 {

  public static void main (String[] args) throws IOException, ClassNotFoundException{
    
    // 案例： 从list.data 读取所有女朋友对象【反序列化，解归档】

    // 1. 创建对象输入流
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("gf2.txt"));

    // 2. 读取List对象

    Object obj = ois.readObject(); // 读取对象
    // 把obj 转成list
    List<GirlFriend> list = (List<GirlFriend>) obj; // 会显示编译错误，显示未知类型
    System.out.println(obj.getClass());
    
    // 保存list再反序列化遍历就不会报错了！

    for (GirlFriend gf : list){
      System.out.println(gf);
    }
  }
}


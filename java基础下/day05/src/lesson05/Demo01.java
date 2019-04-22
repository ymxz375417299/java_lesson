package lesson05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {

  public static void main (String[] args) throws IOException{
    // 对象操作流优化
    /** 
     * ### 问题
     * 之前使用对象输入流，取对象，取完后，再取就报错，这样对程序非常不友好，要怎么优化
     *
     * ### 思路
     * 把（女朋友）对象存在List中，再把List写入文件，反序列号（从文件转对象）的时候也是使用list来取
     */

    // 1. 创建集合
    List<GirlFriend> list = new ArrayList<GirlFriend>();

    // 2. 添加女朋友
    list.add(new GirlFriend("林志玲", 1.78));
    list.add(new GirlFriend("林心如", 1.60));
    list.add(new GirlFriend("范冰冰", 1.78));

    // 3. 把lst存入文件
    FileOutputStream fos = new FileOutputStream("gf2.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    
    // 写入
    oos.writeObject(list);

    // 关流
    oos.close();

  }
}

class GirlFriend implements Serializable{
  String name;
  double height;

  public GirlFriend(String name, double height) {
    this.name = name;
    this.height = height;
  }

  @Override
  public String toString() {
    return "GirlFriend{" +
      "name = " + name +
      ", height = " + height +
      "}";
  }

}




package lesson11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import java.util.Map.Entry;

public class Demo01 {
  public static void main (String[] args) throws IOException{
    // # Properties的概述和Map集合一样的操作
    //  
    //   1. Properties类表示一个持久的属性集。
    //   即把字典数据保存到文件内
    //    2. Properties 可保存在流中或从流中加载
    //     3. 属性列表中每个键及其对应值都是一个字符串
    //      
    // 1. 创建 属性对象
    Properties p = new Properties();

    // 2. 关联文件 // 创建字节输出流FileInputStream并传进去
    p.load(new FileInputStream("info.properties"));

    // 3. 遍历一， Properties()文件所有的键值
    Set<Object> keys = p.keySet(); // 获取Properties文件的所有键key的Set集合

    for (Object key : keys){
      System.out.println(key + "=" + p.get(key));
    }

    // 4. 遍历二
    System.out.println("=======");
    // 和Map类似的用户，使用Entry对象
    for (Entry<Object, Object> entry : p.entrySet()){
      System.out.println(entry.getKey() + "=" + entry.getValue());
    }
  }

  /**
   * 使用Properties来存数据
   */
  public static void test1() throws IOException{
    // 1. 创建 属性对象
    Properties p = new Properties();


    // 2. 存数据
    // 属性列表中每个键key及其对应值value都是一个字符串
    
    p.setProperty("name", "gyf");
    p.setProperty("city", "广州");
    p.setProperty("hometown", "梅州");

    // 3. 关联文件对象 // 
    // 注意： 要先存数据。再关键文件对象，才会把Property的数据写入文件 
    // 创建的文件夹是iso编码，是不支持中文的，所以存入文件会自动把中文转成unicode编码
    // 输出的文件夹后缀必须以.properties进行输出
    p.store(new FileOutputStream("info.properties"), null);
  }

  /**
   * 使用Properties 读取数据
   */

  public static void test2() throws IOException{
    // 1. 创建 属性对象
    Properties p = new Properties();

    // 2. 关联文件 // 创建字节输出流FileInputStream并传进去
    p.load(new FileInputStream("info.properties"));
    // 3. 通过key读数据
    String name =  p.getProperty("name");
    String city = p.getProperty("city");
    String hometown = p.getProperty("hometown");

    // 打印
    System.out.println(name);
    System.out.println(city);
    System.out.println(hometown);
  }
}


package lesson08;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo01 {

  public static void main (String[] args) throws IOException {
    
    // 练习： 获取文本字符的次数，把数据写入文件

    /**
     * 思路
     * 1 遍历文本每一个字符
     * 2 字符穿线的次数存在Map中
     * Map<Character, Integer> map = new HashMap<Character, Integer>();
     * map.put('a', 18)
     * 3. 把map张的数据写入文件
     */

    // 创建Map集合
    Map<Character, Integer> map = new HashMap<Character, Integer>();

    // 2. 遍历每一个字符,把每一个字符出现的 次数放到map中
    FileReader reader = new FileReader("a.txt");

    int c = 0;
    while ((c = reader.read()) != -1){
      // int 还原成char字符
      char ch = (char) c;
      
      // 判断是否在map中第一次出现
      if(map.get(ch) == null){ // 判断在map，get获取这个字符，是否为null,是则设置为1
        map.put(ch, 1);
      }else{
        map.put(ch, map.get(ch) + 1);
      }
    }


    // 3. 把map的数据存在文件中count.txt
    // 3.1 创建BufferedWriter 写入字符串

    BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt"));

    // 3.2 遍历map 再写入数据
    // 遍历使用map的Entry对象

    for (Entry<Character, Integer>  entry : map.entrySet()){
      // 使用switch选择器，把空格单独抽出来展示
      switch(entry.getKey()){
      case ' ': // 空格
        bw.write("空格=" + entry.getValue()); // 统计空格
        break;
      case '\t': // tab键
        bw.write("TAB键=" + entry.getValue());
        break;
      case '\r': // 回车
        bw.write("回车=" + entry.getValue());
        break;
      case '\n': // 换行
        bw.write("换行=" + entry.getValue());
        break;
      default:
        bw.write(entry.getKey() + "=" + entry.getValue()); // 写入文件 格式=字符 = 次数
        break;
      }
      bw.newLine();
    }
    // 关闭流
    bw.close();
    reader.close();
  }
}


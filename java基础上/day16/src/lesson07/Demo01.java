package lesson07;

public class Demo01 {
  public static void main (String[] args) {
    // ### 课堂案例： 统计大字符串中小字符串出现的次数
    String str = "111abc111abc";

    String name = "abc"; // 找出abc在str出现的次数


    int count = 0;
    while(true){
      int index = str.indexOf(name); // name 在str中第一次出现的 位置， -1 代表没找到
      System.out.println("找到的索引值: " + index);

      if(index == -1){
        System.out.println("小串出现次数：" + count);
        break;
      
      }

      // 找到索引值，根据索引（+1 * 小传长度） 截取字符串.str.substring(其实只)
      str = str.substring(index + name.length());
      count += 1;
    
    }
    
  }

}


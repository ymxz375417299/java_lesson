package lesson11;

public class Demo02 {
  public static void main (String[] args) {
    //###2. StringBuffer的反转功能
    //public StringBuffer reverse()
    //
    // 前几节课我们实现字符串反转需要for循环遍历，其实学会了StringBuffer后，可以很轻松的实现反转
    // 1. 使用StringBuffer包装
    // 2. 使用StringBuffer的reverse方法即可
    String s = "abc";
    StringBuffer sb = new StringBuffer(s);

    // 字符串反转
    sb.reverse();
    System.out.println(sb);

    
  }

}


package lesson09;

public class Demo01 {
  public static void main (String[] args) {
    // 1. 判断一下s1 和S2是否相等
    String s1 = "abc";
    String s2 = "abc";

    System.out.println(s1 == s2); // true
    System.out.println(s1.equals(s2)); // true
    // ### 为什么两个不同对象的相同字符串的地址相同
    // 因为String对象是不可变，共享的，所以相同的字符串使用的地址一样的  

    
    
  }

}


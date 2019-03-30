package lesson09;

public class Demo05 {
  public static void main (String[] args) {
    // 5. 判断定义为String类型的s1和s2是否相等
    String s1 = "ab";
    String s2 = "abc";
    String s3 = s1 + "c";
    System.out.println(s1 == s2);// 结果是false,因为s1是对象， “c"是常量，存放的内存地址都不同，所以不会
    // 激发java常量优化机制，所以结果不相同
  
    System.out.println(s2.equals(s3)); // true 因为equals是判断内容是否一样

  


    
  }

}


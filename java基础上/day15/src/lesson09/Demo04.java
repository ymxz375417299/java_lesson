package lesson09;

public class Demo04 {
  public static void main (String[] args) {
    // 4. 判断定义为String类型的S1和s2是否相同
    // java有常量优化机制，编译成.class的时候 s1 就变成”abc"字符串，提高性能呢

    String s1 = "a" + "b" + "c";
    String s2 = "abc";
    System.out.println(s1 == s2); // true
  }


}


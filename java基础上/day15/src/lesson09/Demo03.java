package lesson09;

public class Demo03 {

  public static void main (String[] args) {
    // 3. 判断定义为String类型的S1和s2是否相同
    String s1 = new String("abc");
    String s2 = "abc";

    //一个堆区，一个常量区地址，肯定不一样
    System.out.println(s1 == s2); //Flase
    System.out.println(s1.equals(s2)); // true equals判断的是内容是否一样，而不是内存地址

    
  }

}


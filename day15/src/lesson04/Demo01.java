package lesson04;

public class Demo01 {
  public static void main (String[] args) {
    // 比较字符串
    String s = new String(); //字符串比较特殊，不用也new也行
    String s1 = "abc"; //默认new了
    String s2 = "abc"; //默认new了


    System.out.println("s1 逻辑内存地址: " + s1.hashCode());
    System.out.println("s2 逻辑内存地址: " + s2.hashCode());
    // 结果的内存地址是一样的！ 但是我命名new了两个对象的！为什么？ 后面字符串的课程说，其实相同字符串是同用一份内存的


    // 比较两个字符串是否一样
    // 查看java源码可知，String这个字符串类重写了object的equals
    // 重写后的比较规则，两个f字符串的每一个字符是否一样，有一个字符不一样就返回false
     
    System.out.println("两个字符串是否一样" + s1.equals(s2));

    
  }

}


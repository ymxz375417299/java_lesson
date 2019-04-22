package lesson16;

public class Demo01 {
  public static void main (String[] args) {
    //# 两道面试题
    //### StringBuffer和StringBuilder的区别
    //- StringBuffer是jdk1.0的版本，是线程安全的，效率低 
    //- StringBuilder 是jdk1.5发布的，是线程不安全的，效率高
    //
    //
    //### String 和StringBuffer, StringBuilder的区别
    //- String是一个不可变的字符串序列
    //- StrngBuffer， StringBuilder是可变的字符串序列

    StringBuffer buffer = new StringBuffer();
    buffer.append("abc");
    System.out.println(buffer);

    StringBuilder builder = new StringBuilder();
    builder.append("abc");
    System.out.println(builder);

    // 输出效果一样，但是buffer的类有线程锁修饰，安全的，效率低


    
  }

}


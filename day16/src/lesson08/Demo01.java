package lesson08;

public class Demo01 {
  public static void main (String[] args) {
    //### 通过JDK提供的API 查看StringBuffer类的说明（要求学生自己看一遍说明）
    //
    //### StringBuffer线程安全的可变字符序列（强调，厕所举例）
    //
    //### StringBuffer内部实现是**字符数组**
    //### StringBuffer和String的区别【面试题】
    //- String 是一个不可变的字符串序列
    //``
    //"abc" 是不可变的
    //```
    //- StringBuffer是一个可变的字符序列
    //- StringBuffer线程安全，可以加锁

    
    //
    //# StringBuffer类的构造方法
    //1 - public StringBuffer(): 【开发中常用词构造方法】  
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity()); // 内存不字符数组的初始化容量 默认16
    System.out.println(sb.length()); // 实际的字符长度


    //构造一个其中不带字符串缓冲区，**初始容量16个字符**
    //### - public StringBuffer(int capacity)  
    StringBuffer sb2 = new StringBuffer(24);
    System.out.println("sb2的初始容量" + sb2.capacity());

    //构造一个不带字符，但是具有指定初始容量的字符串缓冲区
    //### - public StringBuffer(CharSequence seq)

    StringBuffer sb3 = new StringBuffer("sb3, 你好吗"); 
    System.out.println("sb3初始容量"  + sb3.capacity()); //输出23，  为什么？ 因为默认16 ，然后这里还添加了7个字符”sb你好吗“，会拓充，所以23
    System.out.println("sb3" + sb3); // 用法： 和字符串一样

    // 和上一个构造方法一样，不用了解，构造一个字符串缓冲区，他包含于指定的CharSequence相同字符
    //### public StringBuffer(String str)
    //构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容
  }

}


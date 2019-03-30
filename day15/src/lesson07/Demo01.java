package lesson07;

public class Demo01 {
  public static void main (String[] args) {
    //### 根据JDK API文档查看String类的介绍
    //- String类代表字符串
    //- Java程序中所有的字符串字面值（如“abc")都作为此类的**实现**实现。
    //- 字符串是常量；它们的值创建之后不能更改

    String s1 = "abc"; //string s1 = "abc"; // 右边的“abc"是一个对象，是字符串的实例对象 是常量，不能改的是右边的"abc" 而是不死s1不能改，s1是变量，指向“abc"这个常量的实例对象  


    // 等效于
    char data[] = {'a', 'b', 'c'};
    String s2 = new String(data);
    System.out.println("s1:" + s1);
    System.out.println("s2:" + s2);


    s1 = "bcd";
  }

}


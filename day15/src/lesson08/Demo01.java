package lesson08;

public class Demo01 {

  public static void main (String[] args) {
    //Stringd gouzao fangfa 
    //1, public String()空参的构造方法o
    String s1 = new String();
    //相当于String s1 = ""; 即空字符串
    //
    //2 public String(byte[] bytes); 把字节数组转成字符串
    byte[] bytes = {97, 98, 99, 100,101};
    String s2 = new String(bytes); //自动把字节的数值转成ａｓｃｌ码对应的字符串
    System.out.println("s2:" + s2); 

    // 3. publc String(byte[] bytes, int offset, int length); 把字节数组的一部分，指定起始点和长度的数组转字符串
    // offset: 表示起始的索引值
    // length ： 长度
    String s3 = new String(bytes , 0, 3);
    System.out.println("s3:" + s3); //输出abc,即从0开始，长度为3的数组转成字符串

    // j. public String(char[] value, int offset, int count); ) 把字符的一部分， 指定起始点和长度的组数转字符串
    char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    String s4 = new String(chars, 2, 3);
    System.out.println("s4:" + s4);
    
    // public String(String original):
    // 初始化一个新创建的String对象，使其表示一个与参数相同的字符序列；
    // 换句话说：新创建的字符串是该参数字符串的副本。 // 意思是，本身“hello"就是字符串，占用一个内存地址，现在还传入字符串给String， new多一个内存地址（副本）即内存有两份Hello
    // 会出现两个对象, 一个再常量区，副本在堆区
    String s5 = new String("hello");
    System.out.println(s5);
  }

}


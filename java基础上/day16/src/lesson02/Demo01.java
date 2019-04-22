package lesson02;

public class Demo01 {
  public static void main(String[] args) { // ### String 类的转换功能
    // ### byte[] get bytes(): 把字符串转换为字节数组)
    String s1 = "520java";
    byte[] bytes = s1.getBytes();
    for (int i = 0; i < bytes.length; i++) {
      System.out.println(bytes[i]);
    }

    // ### char[] toCharyArray(); 把字符串转换为字符数组
    String s2 = "java";
    char[] chs = s2.toCharArray();
    for (int i = 0; i < chs.length; i++) {
      System.out.println("字符" + chs[i]);
    }

    // ### static String valuof(char[] chs_; 把字符数组转成字符串
    char[] chs2 = {'L', 'O', 'V', 'E'};
    String s3 = String.valueOf(chs2);
    System.out.println("s3=" + s3);

    // ### static String valuOf(int i );把int类型数据转换成字符串
    int a = 97;
    String s4 = String.valueOf(a); // 注意： 这里只是单纯把97 转成 “97” ，而不会对应码表找字符,和字符没有关系
    System.out.println("s4=" + s4);
    // ##### 注意： String类的valueOf方法可以把任意类型的数据转换成字符串

    // #### String toLowerCase(); 把字符串转成小写
    String s5 = "HELLO HOW ARE YOU!";
    s5 = s5.toLowerCase();
    System.out.println("s5: " + s5);

    // #### String toUpperCase(); 把字符串转程大写
    String s6 = "  hi，麻辣鸡丝";
    s6 = s6.toUpperCase();
    System.out.println("s6" + s6);

    // ### String concat(String stjr)把字符串拼接，且只能和字符串拼接，和其他类型拼接直接报错。 不过可以用+ 号替换更方便
    String s7 = "when";
    String s8 = "you go home?";
    String s9 = s7.concat(s8);
    // String s9 = s7 + s8 + 98;
    System.out.println("s9" + s9);




    //

  }
}

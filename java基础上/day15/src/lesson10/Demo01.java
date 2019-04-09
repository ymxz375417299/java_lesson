package lesson10;

public class Demo01 {

  public static void main (String[] args) {
    //10.String类的判断功能讲解
    //1.public boolean equals(Object anObject)
    //判断字符串是佛一样
    String s1 = "abc";
    String s2 = "ab" + "c";
    System.out.println(s1.equals(s2));

    // 2,public boolean equalsignoreCase(String anotherString);
    // 判断字符串是否一样，忽略大小写
    String s3 = "Abc";
    System.out.println(s1.equals(s3)); // flase 因为对大小写敏感
    System.out.println("s1与s3:" + s1.equalsIgnoreCase(s3)); // true 不敏感大小写


    // 3. public boolean contain(CharSequence s)
    // 判断字符串是否包含某个字符串
    String s4 = "I Love You";
    System.out.println(s4.contains("Love"));


    // 4.  public boolean startsWith(String prefix);
    String s5 = "lucy";
    System.out.println(s5.startsWith("l")); //true

    // 5. public boolean endWith(Strint suffix)
    // 判断字符串是否以什么结尾
    String s6 = "1.png";
    System.out.println(s6.endsWith(".png")); // true


    // public boolen isEmpty(
    // 判断字符串是否为空

    String s7 = "";
    System.out.println(s7.isEmpty()); //true





    
  }
}


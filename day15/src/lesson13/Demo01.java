package lesson13;

public class Demo01 {
  public static void main (String[] args) {
    // String 类的获取功能【掌握】
    // 1. int length(); 获取字符串的长度
    String s1 = "520java中";
    System.out.println("s1的长度：" + s1.length());

    // 2. char charAt(int index): 获取指定索引的位置的字符
    String s2 = "studio";
    char c = s2.charAt(0); //输出i
    System.out.println("索引对应的字符" + c);

    // 3. int indexOf(int ch): 获取指定字符在此字符串第一次出现的索引值
    String s3 = "bcdaefg";
    System.out.println(s3.indexOf('a')); // 在char中a == 97 编码的对应值

    // 4. int indexof(String str); // 返回指定字符串再此字符串中第一次出现出的索引
    // 如果不存在，则返回-1
    String s4 = "WeLoveJava";
    System.out.println(s4.indexOf("Jav"));;

    // 5. int index0f(int ch, int fromIndex); 返回指定字符在此字符串中指定位置后第一次出现的位置
    String s5 = "abcdefal";
    System.out.println(s5.indexOf('a', 2)); // 从第二个字符开始找a第一次出现的索引，输出结果为6

    // 6 int indexOf(String str, int fromIndex): 返回指定字符串再此字符串中指定位置后第一次出现的位置
    String s6 = "I Love Java, I Love Gosling";
    System.out.println(s6.indexOf("Love", 3)); // 结果为

    // 7. lastIndexOf()最后出现的位置
    String s7 = "absasdsdaas";
    System.out.println(s7.lastIndexOf("a")); // 结果为

    // 8. String substring(int start)：从指定位置开始截取字符串，默认到末尾
    String s8 = "Gosling, How Are You!";
    String tmp = s8.substring(8);
    System.out.println(tmp); // 结果为How Are You


    // 9. String substring(int start, int end); 从指定位置开始到指定位置结束的字符串，返回字符串
    System.out.println(s8.substring(0, 7)); // 注意的是，默认是不去的的，左闭右开：
    // 输出结果：Gosling
    //





  }

}


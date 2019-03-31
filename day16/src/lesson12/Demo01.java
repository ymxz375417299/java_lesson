package lesson12;

public class Demo01 {
  public static void main (String[] args) {
    // test1();
    StringBuffer sb = new StringBuffer();
    sb.append("abcdefg"); // abcefg是存在StringBuffer内部的一个字符数组char[], 
    System.out.println(sb); // 打印一个对象，打印StringBuffer 对象其实会调用内部的toString方法 
    // 通过源码查看StringBuffer的toString方法发现，最后return的是String类型，说明最后 打印的 还是String类型
    

    

  }

    
  public static void test1(){
    // StringBufer的截取功能以及注意事项
    //

    // String的截取
    String s = "Hello.Gosling";
    s.substring(0, 5);
    System.out.println("s:" + s);



    // StringBuffer的截取
    StringBuffer sb = new StringBuffer();
    sb.append("Hello, Gsling");

    System.out.println("sb:" +sb);

    // 1. 从指定位置截取到末尾
    // 这个方法返回类型是String，不是StringBuffer.
    // 所以需要声明个String 变量接受
    String s2 = sb.substring(6);
    System.out.println("s2:" + s);
  
  }

}


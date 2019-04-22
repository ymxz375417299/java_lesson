package lesson15;

public class Demo01 {

  public static void main (String[] args) {
    //![image](ED4BBE90E80E4942BF9A9ABA4CBED125)
    //
    //# 枚举类的常用方法
    //### int ordinal() 获取枚举项索引值，从0开始
    //### int compareTo(E o)
    //### String toString
    //### <T> T valuOf(Class<T> type, String name)通过字节码对象获取枚举对象
    //### values() 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类中所有枚举值非常方便


    // 1. 获取枚举对象
    Season s1 = Season.SPRING;
    Season s2 = Season.SUMMER;
    // 获取索引值
    System.out.println("s1 " +s1.ordinal());
    System.out.println("s2 " + s2.ordinal());

    // 2. 比较枚举【索引相减】 
    System.out.println(s1.compareTo(s2));
    
    // 3. 打印枚举项名称
    System.out.println("s1 name: " + s1.name());

    // 4. 也是打印枚举项名称
    System.out.println("s1: " + s1.toString());

    // 5 通过字节码对象获取枚举对象 【没什么用】
    Season s3 = Season.valueOf(Season.class, "SPRING");

    // 5 values（） 类方法，返回枚举对象数组Season[]
    Season[] seasons = Season.values();
    for (Season s : seasons){
      System.out.println(s);
    }

    
  }
}

enum Season{
  SPRING,SUMMER,AUTUMN,WINTER;
}

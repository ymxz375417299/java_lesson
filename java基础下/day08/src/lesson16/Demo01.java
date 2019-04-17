package lesson16;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {

  public static void main (String[] args) throws Exception{
    
    
    // ### JDK7的六个新特性回顾和讲解讲解
    // 1. 二进制字面量
    System.out.println(0b1000);

    // 2. 数字字面量可以出现下划线，对几千万来说，下划算，能更好查看
    System.out.println(1000_0000);

    // 3. switch语句可以用字符串
    // 之前case语句是不能有字符串的
    String s = "A";
    switch (s){
    case "A":
      System.out.println("AAAAAAAAA");
      break;
    case "B":
      break;
    default:
      break;
    }

    // 4. 泛型简化，菱形泛型
    // List<String> list = new ArrayList<String>();
    // 以前是要左右泛型要一直，如，都是String
    List<String> list = new ArrayList<>();

    // 5. 异常多个catch合并，每个异常用或|
    try{
      int i = 10 / 0; // 算数异常
      int[] arr = null;
      System.out.println(arr[0]); // 空指针异常
    }catch(ArithmeticException | NullPointerException e){
      
    }

    // 6： try-with-resources 语句// 这样写不用关流
    try(
        FileInputStream fis = new FileInputStream("a.txt");
      ){
      fis.read();
      }

  }
}


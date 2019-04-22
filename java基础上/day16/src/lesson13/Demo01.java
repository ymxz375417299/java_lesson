package lesson13;

public class Demo01 {
  public static void main (String[] args) {

    //2, StringBuffer 转String
    //2,1 通过构造方法
    //2，2 通过toString()方法
    //2.3 通过subString(start, end)方法
    //

    StringBuffer sb = new StringBuffer("Gosling , Where are you!");

    // 通过String构造方法 , 本身就支持传入StringBuffer的构造方法
    String 是 = new String(sb);

    // 2.2 通过toString()方法
    // 因为String Buffer的toString返回的就是字符串String类型
    // 这种方法最方便

    String s2  = sb.toString();


    // 2,3 通过subString截取方法
    String s3 = sb.substring(0); // 直接从0的位置截取的微博，即不截取直接返回String类型

    
  }

  public static void test(){
  
    // ### StringBuffer和String的互相转换
    // 1. String - > StringBuffer
    // 1.1 通过构造方法
    // 1.2 通过append() 方法

    String s = "Hello Gosling , THx";
    // 1.1 通过构造方法
    StringBuffer sb1 = new StringBuffer(s);
    System.out.println("sb1" + sb1);


    // 1.2 通过append()方法
    StringBuffer sb2 = new StringBuffer();
    sb2.append("sb2" + sb2);
  }

}


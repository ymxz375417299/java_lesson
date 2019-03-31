package lesson03;

public class Demo01 {
  public static void main (String[] args) {
    // 把一个字符串的首字母转成大写，其余为小写
    String s ="hHELLO，How Are You!";
    // 4. 进行拼接【链式编程】
    s = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
    System.out.println(s);


    
  }

  public static void test1(){
    // 老方法
      String s ="hHELLO，How Are You!";
      // 1. 截取第一个字母
      String s1 = s.substring(0, 1);
      

      // 2. 截取后第一个字母后面的字符串
      String s2 = s.substring(1);
      System.out.println("s1:" + s1);
      System.out.println("s2" + s2);


      // 3. 转大小写
      s1 = s1.toUpperCase();
      s2 = s2.toLowerCase();
      System.out.println("s1:" + s1);
      System.out.println("s2" + s2);


      // 4. 进行拼接
      s = s1.concat(s2);
      System.out.println(s);

  }

}



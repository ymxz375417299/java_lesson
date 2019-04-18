package lesson12;

public class Demo01 {

  public static void main(String[] args) {

    //# 12.正则表达式的分割功能讲解
    //- public String[] split(String regex)
    //
    //给指定的正则表达式的匹配拆分此字符串

    String s = "11.23.21.20.28";
    // 特别注意，因为. 点是正则表达式中转义成任意字符，所以需要加\\ 禁止转义
    String[] arr = s.split("\\.");
    for (String str : arr){
      System.out.println(str);
    }
  }
}

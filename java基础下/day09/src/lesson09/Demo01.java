package lesson09;

public class Demo01 {
  public static void main(String[] args) {
    //
    test9();
  }

  public static void test1() {
    // [abc] a,b,c(简单类) 匹配一个字符
    // 正则表达式

    String regex = "[abc]";
    System.out.println("a".matches(regex));
  }

  public static void test2() {
    // [^abc] 任意字符，除了a,b,c(否定)意外任意字符
    String regex = "[^abc]";
    System.out.println("a".matches(regex));
    System.out.println("b".matches(regex));
    System.out.println("c".matches(regex));
    System.out.println("d".matches(regex));
    System.out.println("*".matches(regex));
  }

  public static void test3() {
    // [a-zA-Z] a到z 或A 到 Z. 两头的字母包含在内r(范围)
    String regex = "[a-zA-Z]";
    System.out.println("a".matches(regex));
    System.out.println("Z".matches(regex));
    System.out.println("b".matches(regex));
    System.out.println("B".matches(regex));
    System.out.println("1".matches(regex));
  }

  public static void test4() {
    // [a-zA-Z_0-9] a 到 z 或A 到 Z 和下划线_ 和0~9
    // 注册用户名的规范
    String regex = "[a-zA-Z0-9_]";
    System.out.println("a".matches(regex));
    System.out.println("A".matches(regex));
    System.out.println("_".matches(regex));
    System.out.println("0".matches(regex));
    System.out.println("1".matches(regex));
    System.out.println("&".matches(regex));
  }

  public static void test5() {
    // [0-9] 0到9的数字
    String regex = "[0-9]";
    System.out.println("a".matches(regex));
    System.out.println("A".matches(regex));
    System.out.println("_".matches(regex));
    System.out.println("0".matches(regex));
    System.out.println("1".matches(regex));
    System.out.println("&".matches(regex));
  }

  public static void test6() {
    // [a-d[m-p]] a到d 或 m - p（并集）
    String regex = "[a-d[m-p]]";
    System.out.println("a".matches(regex));
    System.out.println("e".matches(regex));
    System.out.println("n".matches(regex));
  }

  public static void test7() {
    // [a-z&&[def]] a-z, def 的交集的结果 为 d e f
    String regex = "[a-z&&[def]]";
    System.out.println("a".matches(regex));
    System.out.println("g".matches(regex));
    System.out.println("e".matches(regex));

  }

  public static void test8(){
    // [a-z&&[^bc]] a~z 和除bc外的所有字符的交际，即 a~z 减去bc
    String regex = "[a-z&&[^bc]]";
    System.out.println("a".matches(regex));
    System.out.println("b".matches(regex));
    System.out.println("c".matches(regex));
    System.out.println("1".matches(regex));
  }

  public static void test9(){
    // [a-z&[^m-p]] 交集结果就是  [a-lq-z]
    String regex = "[a-z&&[^m-p]]";
    System.out.println("a".matches(regex));
    System.out.println("m".matches(regex));
    System.out.println("p".matches(regex));
    System.out.println("b".matches(regex));
  }
}

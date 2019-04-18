package lesson10;

public class Demo01 {

  public static void main(String[] args) {

    // ### 预定义字符类
    // - . 任何字符
    // - \d 数字：[0-9]
    // - \D 非数字： [^0-9]
    // - \s 空白字符：[ \t\n\x0B\f\r]
    // - \S 非空白字符：[^\s]
    // - \w 单词字符：[a-zA-Z_0-9]
    // - \W 非单词字符：[^\w]
    test5();
  }

  public static void test4() {
    // \s 空白字符 & Tab键
    String regex = "\\s";
    System.out.println(" ".matches(regex));
    System.out.println("\t".matches(regex));
  }

  public static void test5() {
    // \w 单词字符：[a-zA-z_0-9] 大小写英文字母 和 数字和下划线
    String regex = "\\w";
    System.out.println("a".matches(regex));
    System.out.println("k".matches(regex));
    System.out.println("A".matches(regex));
    System.out.println("_".matches(regex));
    System.out.println("0".matches(regex));
    System.out.println("1".matches(regex));
  }
}

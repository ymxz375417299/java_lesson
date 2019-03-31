package lesson05;

public class Demo01 {

  public static void main (String[] args) {
    
    // # String类的其他功能
    // ### public string replace(char oldchar, char newchar) // 替换单字符
    String s1 = "hello";
    s1 = s1.replace('l', 'y');
    System.out.println("s1:" + s1);

    // ### public String replace(CharSequence tatget, CharSequence replacement) 替换字符串
    // 这里的指定传入CharSequence，为什么我传字符串String类型也可以？
    // 从源码看到，CharSequence 是接口， 所以可以传这个接口的实现类，而String就是它的实现类
    // 强调一个概念，传参的时候，可以传指定的类，和它的子类。 即多态的形式传入
    String s2 = "I Love You ";
    s2 = s2.replace("Love", "Hate");
    System.out.println("s2:" + s2);

    // ### String trim(); //去除前后空格
    String s3 = "  java gosling  ";
    System.out.println("s3:" + s3);
    s3 = s3.trim();
    System.out.println("s3:" + s3);

    // ### public int compareTo(String anotherString)  // 比较两个字符串 //返回int类型
    String s4 = "abc";
    String s5 = "aBc";

    int result = s4.compareTo(s5); // 输出结果是-1， 是两边 字符的码表a 和a的码表值比较。a-a = 0 ,继续下一位比较 b-B =  -1, 只要结果不为0，则立马返回比较值，不继续比较
    System.out.println("s4 pk s5" + result);

    // ### public int compareToIgnoreCase(String str)// 比较字符串// 不区分大小写
    String s6 = "Abc";
    String s7 = "abc";  // 在忽略大小写情况下，发现不同值，会统一先转成小写，再比较码表值的差

    System.out.println("s6 pk s7: " + s6.compareToIgnoreCase(s7));

  }
}


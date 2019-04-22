package lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo01 {

  public static void main(String[] args) {

    // ### str.matches()内部实现
    // Pattern p = Pattern.compile("a*b");
    // Matcher m = p.matcher("aaaaab");
    // boolean b = m.matche();

    // 校验QQ
    boolean b1 = "1002030".matches("[1-9]\\d{4,14}");
    // 返回匹配结果
    System.out.println(b1);

    // 等效于
    Pattern p = Pattern.compile("[1-9]\\d{4,14}"); //正则表达式对象
    Matcher m = p.matcher("1002030"); //  正则对象 // 传入正则表达式对象jJ
    boolean b = m.matches();  //  调用匹配方法 
    System.out.println(b);




  }
}

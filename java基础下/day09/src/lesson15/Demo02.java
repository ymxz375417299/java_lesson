package lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo02 {

  public static void main(String[] args) {
    // ### Pattern和Matcher更高级用法
    // 例子：
    // 需求 把一个字符串中的手机号码，全部都提取出来

    String s = "我的手机是18999999999， 我曾经用过18900000000， 还用过 13788888888";

    // Matcher 的find 和 group方法
    // 1. 匹配手机号的正则表达式
    String regex = "1[35678]\\d{9}";

    // 2. 创建Pattern正则表达式对象 
    Pattern p = Pattern.compile(regex);

    // 3. 获取正则对象Matcher // 传入被操作的字符串
    Matcher m = p.matcher(s);

    // 4.  找到匹配的正则内容
    // find(); 找出匹配结果，找到第一个则停止
    // group()；提取匹配成功的字符串
/**    System.out.println(m.find()); // 找到第一个则停止
    System.out.println(m.group()); // 提取刚找到的字符串
    System.out.println(m.find()); // 再匹配，找到第一个则停止
    System.out.println(m.group()); // 提取刚找到的字符串
    System.out.println(m.find()); // 再匹配，找到第一个则停止
    System.out.println(m.group()); // 提取刚找到的字符串
*/

    // 死循环匹配所有的结果
    while (true){
      if (m.find()){
        System.out.println(m.group());
      }else{
        break;
      }
    }


  }
}

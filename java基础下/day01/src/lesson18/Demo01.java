package lesson18;

import java.util.Scanner;

public class Demo01 {
  public static void main (String[] args) {
    //### 联系： 键盘输入的用户名只能包含英文字符
    //- 使用键盘获取用户录入内容，只能传入英文字符串，否则抛出非法字符串的异常
    //- 非法字符的异常类，必须是自定义的
    //- 异常定义是 运行时异常RuntimeException)
    
    // 1. 获取用户输入
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入用户名");
    String username = scanner.nextLine();
    
    // 2. 判断字符串是否合法
    for (int i=0; i<username.length(); i++){
      char ch = username.charAt(i);
      // 代表是否小写字符
      boolean isSmall = (ch >= 'a' && ch <= 'z');
      // 判断是否大写字符
      boolean isBig = (ch >= 'A' && ch <= 'Z');
      if (!(isSmall || isBig)){ // 不合法字符
        throw new illegalCharaterException("不合法字符-> " + ch);
      }
    }
  }



}


// 定义非法异常类
class illegalCharaterException extends RuntimeException{
  public illegalCharaterException(String msg){
    super(msg);
  }
}


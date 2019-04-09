package lesson17;

import java.util.Scanner;

public class Demo01 {
  public static void main(String[] args) {

    // 案例： 自定义登录异常
    /** 当用户名和密码不正确时，抛出登录异常 
     1. 账号admin， 密码123 
     2. 用户名和密码由用户通过键盘输入 */

    // 1. 获取用户出入的账号密码
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入账号:");
    String username = scanner.nextLine();
    System.out.println("请输入密码：");
    String password = scanner.nextLine();

    // 2. 判断用户名和密码是否正确
    if ("admin".equals(username) && "123".equals(password)) {
      System.out.println("登录成功");
    } else {
      throw new LoginException(
          "登录密码错误！"); // 这里main并没有使用throws LoginException.为什么没有报错！
                      // ，因为我的自定义异常类LoginException是继承RuntimeException 是运行时异常，所以编译时不会报错
    }
  }
}

class LoginException extends RuntimeException {
  public LoginException(String msg) {
    super(msg);
  }
}

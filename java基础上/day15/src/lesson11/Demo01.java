package lesson11;

import java.util.Scanner;

public class Demo01 {

  public static void main (String[] args) {

    // 案例： 模拟用户登录
    // 需求： 模拟登陆，给三次机会，并提示还有几次
      // 用户和密码都是admain

    Scanner scanner = new Scanner(System.in);
    //给三次机会输入用户名和密码
    for (int i = 0; i < 3; i++ ){
      // 1. 接受用户输入的用户名和密码
      System.out.println("请输入用户名：");
      String username = scanner.nextLine();

      System.out.println("请输入密码：");
      String password = scanner.nextLine();

      // 2, 判断用户名和密码是否正确

      if (username.equals("admin") && password.equals("admin")){
        System.out.println("恭喜登录成功");
        break;
      
      }else{
        System.out.println("登录失败");
      
      }
    }

    
  }
}


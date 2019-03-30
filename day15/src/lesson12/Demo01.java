package lesson12;

public class Demo01 {
  public static void main(String[] args) {
    // 字符串比较一个小技巧
    // 永远不要相信用户输入！ 用户有可能发空字符串，在java中null空指针，是没有.equals方法的！这样就报错
    String username = "sadas";
    String password = "";

    // if (username.equals("admin") && password.equals("admin")) {
      // System.out.println("登录成功");
//
    // } else {
      // System.out.println("登录失败");
    // }

    // 为了避免这个空指针异常， 把字串常量放在前面
    if ("admin".equals(username) && "admin".equals(password)){
      System.out.println("登录成功");
    
    }else{
      System.out.println("登录失败");
    
    }
  }
}

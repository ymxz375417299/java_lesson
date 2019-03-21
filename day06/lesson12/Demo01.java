
import java.util.Scanner;
public class Demo01 {

  public static void main(String[] args) {
    // 掌握如何声明一个字符数组
    // 数组查表发（根据键盘录入索引，查找对应的星期）
    //
    // 1. 声明一个字符数组
    // 注意要用单引号，否则报错
    char[] weeks = {'一', '二', '三', '四', '五', '六', '日'};

    // 2. 监听键盘输入数组
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入1~7的数字");

    int week = scanner.nextInt();

    // 3. 判断用户是否输入1~7
    if (week >= 1 && week <= 7 ){
      System.out.println("星期" + weeks[week - 1]);
    }else{
      System.out.println("你输入是非法数字。。。请确定是否1~7");
    }


  }

}


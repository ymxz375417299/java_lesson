import java.util.Scanner;
public class Demo02{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
      System.out.println("请输入第一个数字");
      int a = scanner.nextInt();
      System.out.println("请在输入一个数");
      int b = scanner.nextInt();
      System.out.println("输入的两个数是否相等：" + (a == b));
  }
}

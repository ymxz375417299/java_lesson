
import java.util.Scanner;

public class Demo01 {

  public static void main(String[] args) {
    //需求： 键盘录入两个数据，返回两个数据中较大值【通过定义一个方法实现】
    // 1. 获取两个数据
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入第一个数");
    int a = scanner.nextInt();
    System.out.println("请输入第二个数");
    int b = scanner.nextInt();
    // 2. 获取最大值（写成一个方法）
    int max = getMax(a, b);
    System.out.println("最大值：" + max);
    

  }

  public static int getMax(int a, int b){
    return a > b ? a : b;
  }

}


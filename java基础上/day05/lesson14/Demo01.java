
import java.util.Scanner;
public class Demo01 {

  public static void main(String[] args) {
    //需求： 根据键盘录入的数据输出对应的乘法表 
    //1. 获取用户输入的数字
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入一个数，有意想不到的结果哦！");
    int num = scanner.nextInt();
    // 2. 99乘法表
    printTable(num);

  }

  // 打印乘法表
  public static void printTable(int num){
    //99乘法表
    for (int i = 1; i <= num; i++){
      for (int j = 1; j <= i; j++){
        System.out.print(i + "*" + j + "=" + (i * j) + '\t');
      }
      System.out.println();
    }
  }

}


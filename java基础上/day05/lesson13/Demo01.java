
import java.util.Scanner;
public class Demo01 {

  public static void main(String[] args) {
    /// 需求： 根据键盘录入的函数和列数，在控制台 输出星形， 打印星形放在一个方法里
    // 讲解这种打印的需求可以不用返回值，没有返回void 就不写return*
    // 1.获取用户输入的行数和列数
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入行数");
    int row = scanner.nextInt();
    
    System.out.println("请输入列数");
    int column = scanner.nextInt();
    printStar(row, column);
  }

  //打印星形
  //void: 代表方法不需要返回值，在放内部不用谢return代码
  public static void printStar(int row, int column){
    for (int i = 1; i <=row; i++){
      for (int j = 1; j <= column; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
     
  }

}


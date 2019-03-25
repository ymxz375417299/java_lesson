
import java.util.Scanner;
public class Demo01 {

  public static void main(String[] args) {
    // 和上一节课不同是，这个是无线猜数字，直到猜对才退出
// ### 猜数字小游戏案例
    // - 需求： 猜数字小游戏（数据在1-99之间）
      // - 写两种情况的案例
      // - 一是值给三次机会就游戏结束
    
    // 1 生成随机数【数据再1-99之间】
    int num = 0;
    while(true){//这种写法是避免0的出现
      num = (int)(Math.random() * 100); //生成0~99的随机数 ， 并使用(int)()转成整数int
      if(num != 0) break; // if 简写
    }
    System.out.println("生成随机数是：" + num);

    // 2. 接受用户输入的数字
    Scanner scanner = new Scanner(System.in);
    System.out.println("你有n次机会猜数字");
    int i = 0;
    for(;;){
      System.out.println("请输入1~99的数：[这是你第" + (i+1) + "]次机会");
      int a = scanner.nextInt();

      if(a < num){
        System.out.println("你猜的数字太小了");
      }else if(a > num){
        System.out.println("你猜的数字太大了");
      }else{
        System.out.println("BIGO 你猜了，接受审判吧");
        break; //退出循环
      }
      i++;
    }

  }

}


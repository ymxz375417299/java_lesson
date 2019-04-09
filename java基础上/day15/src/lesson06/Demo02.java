package lesson06;

import java.util.Scanner;

public class Demo02 {
  public static void main (String[] args) {
    // 案例演示
    // 1. 获取两个int值
    // 2. 获取两个字符串值
    // 3。 先获取Int再获取一个字符串

    // test1();
    // test2();
    test3();

    
  }

  public static void test1(){
    // 方法必须是静态，因为main是静态方法，静态方法只能调用静态
    // 1. 获取两个int值
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入第一个数字");
    int x = scanner.nextInt();

    System.out.println("请输入第二个数字");
    int y = scanner.nextInt();

    System.out.println("x=" + x);
    System.out.println("y=" + y);
  
  }


  public static void test2(){
    // 2. 获取两个字符串
    Scanner scanner = new Scanner(System.in);

    System.out.println("请输入一段文字");
    String str1 = scanner.nextLine();

    System.out.println("请输入第二段文字");
    String str2 = scanner.nextLine();

    System.out.println("发言稿：");
    System.out.println("str1:" + str1);
    System.out.println("str2:" + str2);
  }
  
  public static void test3(){
    // 3. 先获取int(age) 在获取字符串（name)
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入你的年龄");
    // int age = scanner.nextInt();
    String age = scanner.nextLine();

    System.out.println("请输入你的名字：" );
    String name = scanner.nextLine();
    /** 特别注意：
     * nextLine方法遇到回车换行(之前输入int的时候有回车)就会立刻结束
     * 解决方法：
     * 当一个方法，不要即nextInt() 又nextLine一起用，会有冲突
     * 统一把数字作为字符串输入，写一样
     */

    System.out.println("========");
    System.out.println("根据你的名字：" + name + "还有你的年龄" + age);
    System.out.println("看出2019你有车有房有美女！！");


  
  }

}


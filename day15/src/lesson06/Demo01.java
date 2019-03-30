package lesson06;

import java.util.Scanner;

public class Demo01 {
  public static void main (String[] args) {
    //### Scanner的成员方法（举例两种）
    //- hssNext XX 判断是否还有下一个输入(Int/Double/字符串)项，其中Xxx可以是Int, Double等，如果需要判断是否为字符串，则可以忽略Xxx
    //- nextxx 获取下一个输入项，Xxx的含义和上一个方法的Xxx相同

    Scanner scanner = new Scanner(System.in);
    // 判断输入的是否是整数,如果是返回true
    if(scanner.hasNextInt()){
      int x = scanner.nextInt();
      System.out.println(x);
    
    }else{
      System.out.println("你输入的不是数字");
    }

    // 判断你输入的是否为字符串 ,这个作用不大，因为输入数字也理解为字符串
    if(scanner.hasNext()){
      String str = scanner.nextLine();
      System.out.println("str" + str);
    }

    

  }

}


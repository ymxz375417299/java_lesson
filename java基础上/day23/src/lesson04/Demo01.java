package lesson04;

import java.util.Comparator;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo01 {
  public static void main (String[] args) {
    //### 练习：
    //- 从键盘输入接受多个整数，知道输入quit时结束输入
    //- 把所有输入的整数倒序排列打印
    
    // 1. 创建TreeSet集合
    Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>(){
      @Override
      public int compare(Integer o1, Integer o2){
        return o2 - o1;
      }
    });

    // 2. 接受整数存在TreeSet中
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入多个数字，然后q退出,则会自动排序");
    
    while(true){
      String str = scanner.nextLine();
      if (str.equals("q")){ // 注意比较两个字符串是否相同，使用equals，不要用==  ==是返回内存地址 
        break;
      }
      // 添加集合，并把字符串转int类型
      set.add(Integer.parseInt(str));
    }

    // 打印
    System.out.println("华丽分隔符============");
    for (Integer i : set){
      System.out.println(i);
    }
  }

}


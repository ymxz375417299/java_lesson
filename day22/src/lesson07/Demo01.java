package lesson07;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Demo01 {
  public static void main (String[] args) {
    // 产生10个1-20之间的随机数要求随机数不能重复讲解

    // 创建set集合
    Set<Integer> set = new HashSet<Integer>();
    // 1. 生成随机数的对象
    Random r = new Random();

    //0~20
    //2. 生成10随机数
    //问题： 万一重复则总数就不到10
    // for(int i = 0; i < 10; i++){
      // int num = r.nextInt(21); // 生成随机数
      //// 添加set
      // set.add(num); // int会自动提升成Integer类型
//
    // }


    // 使用死循环生成随机数
    // 条件： 当集合总个数不为10则继续执行
    while(set.size() != 10){
      int num = r.nextInt(21)
      // 非零
      if (num != 0){
        // 添加到set
        set.add(num);
      
      }
    }
    System.out.println("set:" + set);
    
  }

}


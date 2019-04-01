package lesson12;

import java.util.Random;

public class Demo01 {
  public static void main (String[] args) {
    ///# Random 类的概述
    //产生随机数  
    //如果用相同的种子创建两个Random实例，则对每个实例进行相同的方法调用序列  
    //他们将生成并返回相同的数字序列
    //
    //### 构造方法
    //- public Random()
    //- public Random(long send)
    //
    //### 成员方法
    //生成随机数
    //- public int nextInt() // 返回long很长的数字
    //- public int nextInt(int bound)  // 指定随机数范围, 重点掌握
    //

    //如果用相同的种子创建两个Random实例，则对每个实例进行相同的方法调用序列  
    //他们将生成并返回相同的数字序列
    Random r1 = new Random(10000); // 传入相同的种子10000 // 得到的随机数可能正也可能负数
    Random r2 = new Random(10000);
    // 输出结果
    // -213452353
    // -213452353

    System.out.println(r1.nextInt()); // 输出和r2一样 12344324234
    System.out.println(r2.nextInt()); // 输出和r2一样 12344324234
  }


  public static void test1(){
    // 1. 创建Random实例
    Random r1 = new Random();
    // for (int i = 0; i < 10; i ++){
      // System.out.println(r1.nexInt());
    // } // 返回10次随机数，而且是log类型


    for (int i = 0; i < 10; i++){
      // 生成0~9不包括10
      System.out.println(r1.nextInt(10));
    
    
    }
  
  }

}


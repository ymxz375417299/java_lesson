package lesson15;

import com.gyf.model.Student;

public class Demo01 {
  public static void main (String[] args) {
    //
    //# 可变参数(python中不定长参数)
    //### 可变参数概述
    //定义方法的时候不知道该定义多少参数
    //
    //### 格式
    //修饰符 返回值类型 方法名 （数据类型... 变量名）{}
    //``
    //public static void test1(int ... nums)
    //```
    //###　注意事项
    //这里的变量其实是一个数组　　
    //如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个*/
    
    test2(3, 2 ,1, 111, 2342, 354);
    test3(1, "Gosling", new Student("cc", 32)); // 传不同类型的
    System.out.println("----");
    test4(18, "ABc", "BCD", 23); // 多个参数，有可变参数有其他参数
  }


  public static void test1(int a, int b){
  }

  public static void test2(int ... nums){ // 参数其实就是一个数组

    // 遍历 (增强for循环)
    for (int num : nums){
      System.out.println(num);
    }
  
  }

  public static void test3(Object ... objs){
    // 增强for循环遍历
    for (Object obj : objs){
      //
      System.out.println(obj);
    }
  }

  // 注意
    //如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个*/
  // public static void test3(Object ... objs, int a){} // 错误
  public static void test4(int a, Object ... objs){
    
  }

}


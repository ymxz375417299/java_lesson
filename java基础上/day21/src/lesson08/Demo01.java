package lesson08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01 {
  public static void main (String[] args) {
    
    //![image](B2B7DEC7B235445A9F86D798CEFD5C0D)
    //
    //# 增强for循环
    //### 增强for循环： 
    //简写数组和Collection集合的遍历
    //
    //###  格式：
    //for(元素数据类型 变量： 数组 或者Collection集合){
    //    使用变量即可，该变量就是元素
    //    }
    //
    //
    //    ### 案例演示： （数组， 集合存储元素用来增强for遍历）
    //    ### 好处： 简化遍历

    //1. 基本数据类型的数组
    int[] arr1 = {123, 342, 119};

    // 普通for遍历
    for (int i = 0; i < arr1.length; i++){
      int num = arr1[i];
      System.out.println(num);
    }


    System.out.println("====增强数组========");
    //  增强数组
    for(int num : arr1){ // 意思就是把arr1的元素遍历赋值给num遍历// 内部的执行逻辑和普通for循环一样，只是简化了
      System.out.println(num);
    }

    // 集合
    List<String> list = new ArrayList<String>();
    list.add("abc");
    list.add("abc");
    list.add("abc");
    list.add("abc");
    //
    // 生成器
    Iterator<String> iterator = list.iterator();

    // 生成器遍历
    while(iterator.hasNext()){
      String str = iterator.next();
      System.out.println(str);
    }

    // 增强for循环遍历
    System.out.println("增强for循环");

    int i = 0;
    for (String str : list){
      i++;
      System.out.println("第" + i + "元素" + str);
    }
  }

}


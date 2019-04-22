package lesson06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {
  public static void main(String[] args) {

    //
    // # Collections工具类的概述和常见方法讲解
    // 注意。比Collection多了s, Collection是一个接口，。 而Collections是一个类
    // ### Collections类概述，查看API文档
    // 针对集合操作的工具类
    //
    // ### Collections成员方法
    // 1. public static <T> void sort(List<T> list) 给list排序
    // 2. public static <T> int binarySearch(LIst<?> list, T k)  二分查找
    // 3. public static <T> T max(Collecion<?> coll)
    // 4. public static void reverse(List<?> list) 反转
    // 5. public static void shuffle(List<?> list) 打乱

    List<Integer> list1 = new ArrayList<Integer>();
    list1.add(23);
    list1.add(3);
    list1.add(2);
    list1.add(123);
    list1.add(213);
    System.out.println(list1);

    System.out.println("========");
    // 1. 给List结合排序
    Collections.sort(list1);
    System.out.println(list1);
    
    // 2. 二分查找
    int num = Collections.binarySearch(list1, 2);
    System.out.println("========");
    System.out.println("2在列表中的位置" + num);


    // 3. 找最大值
    // 3. public static <T> T max(Collecion<?> coll) 传入的是Collection类型的，不过List是它的子类，所以可以传j
    int max = Collections.max(list1);
    System.out.println("========");
    System.out.println("最大值: " + max);

    // 4. public static void reverse(List<?> list) 反转
    Collections.reverse(list1);
    System.out.println("反转后： " + list1);

    // 5. public sttic void shuffle(List<?> list)
    Collections.shuffle(list1);
    System.out.println("打乱集合：" + list1);
  }
}

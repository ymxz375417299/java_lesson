package lesson02;

import java.util.ArrayList;
import java.util.List;

import com.gyf.model.Student;

/**
 * 掌握集合contains方法的本质
 * 1。 如果是判断字符串再集合中是否存在。比较的是字符串内容
 * 2. 如果是判断的是自定义对象在集合中是否存在，比较的是对象的地址
 */


public class Demo01 {
  public static void main (String[] args) {
    //# 案例： 去除ArrayList中重复自定义对象元素
    //###　需求：　ArrayList去除集合中自定义对象元素的重复值（对象的成员变量值相同）
    //### 思路： 创建新集合方法， 重写对象的equals()方法的
    
    //1. 创建一个list集合
    List list = new ArrayList();

    // 添加学生
    list.add(new Student("刘备", 20));
    list.add(new Student("张飞", 20));
    list.add(new Student("曹操", 20));
    list.add(new Student("刘备", 20));

    // 打印学生
    System.out.println(list);

    // 创建新的集合
    List newList = new ArrayList();

    // 遍历学生
    for (int i = 0; i < list.size(); i ++){
      // 5. 取出学生
      Object obj = list.get(i);
      // System.out.println(obj.getClass());
      // 发现全部都是学生对象
      //

      //强转学生类型
      Student stu = (Student) (obj);

      // 8. 判断学生在新集合中是欧服存在
      // if (!newList.contains(stu){
      if (!newList.contains(stu)){
        newList.add(stu);
      
      }

    
    }

    System.out.println("============================================");
    System.out.println("new List" + newList);
  }


}


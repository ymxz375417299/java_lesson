package lesson04;

import com.gyf.model.Student;

/** 一句话概括：
 * 解决强制类型转换的隐患，因为类型转换报错，编译不会报错，只会在运行才报错
 */

public class Demo01 {
  public static void main (String[] args) {
    //# 泛型的由来【了解】
    //1. 早起的Object类型可以接受任意类型的对象类型
    //2. 但是在实际的使用中，会有类型转换的问题，也就存在这隐患
    //3. 所以Java提供了泛型来解决这个安全问题
    //
    //
    
    // 多态，父类指向子类
    Object obj1 = "gaosling";
    Object obj2 = 1;
    Object obj3 = new Student("ro", 20);

    // 报错
    String str3 = (String) obj3;
  }


}


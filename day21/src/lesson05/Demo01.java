package lesson05;

import com.gyf.model.Student;

/** 
 * 掌握：
 * 如何声明一个泛型类和方法
 */

public class Demo01 {
  public static void main (String[] args) {
    //05.声明一个泛型类和方法讲解
    //![image](7B22814DE4794C919864F93CAD7F397B)
    //
    //# 泛型类和泛型方法
    //### 泛型类概述
    //把泛型定义再类上
    //
    //### 定义格式
    //- public class 类名<泛型类型, ...>
    //- <>号里的名字没有要求，任何一个字母都可以，最好用大写的字母如<E> ,其实就是占位，代表任意类型
    //- <>号的类型可以多个，用逗号隔开，一般在工作中，只声明一个就够用
    //
    //### 泛型类型注意事项
    //1. 泛型类型必须是引用类型
    //2. T的值是什么时候有的？ 是在创建对象时
    //
    //### 泛型方法
    //1. 泛型方法，把泛型定义在方法上
    //2. 定义格式： public <泛型类型> 返回类型 方法名(泛型类型 变量名)
    //3. 对象方法的泛型参数要与类的泛型一直，不可以使用其他名


    // 使用泛型类
    // 1. 创建对象
    Tool<String> tool1 = new Tool<String>();

    // 2. 使用定义的泛型方法
    tool1.print("String");
    
      //2. 创建对象2
    Tool<Student> tool2 = new Tool<Student>();
    System.out.println("Student");
  }

}


// 声明一个泛型类型
//### 定义格式
//- public class 类名<泛型类型, ...>
//- <>号里的名字没有要求，任何一个字母都可以，最好用大写的字母如<E> ,其实就是占位，代表任意类型
//- <>号的类型可以多个，用逗号隔开，一般在工作中，只声明一个就够用
class Tool<T>{

  // 声明泛型方法
  // 无返回值
  // 参数是泛型的
  public void print(T t){
    System.out.println(t);
  }
}

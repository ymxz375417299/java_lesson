package lesson07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo01 {
  public static void main (String[] args) {
    //
    //### 编译时异常和运行时异常讲解
    //java中的异常被分为两大类
    //- 编译时异常
    //- 运行时异常
    //
    //### 编译期异常和运行期异常的区别
    //所有的RuntimeException类以及子类的实例被称为运行时异常，其他的异常类就是 编译时异常
    //
    //
    //### 编译时异常
    //- java程序必须显示处理，否则程序会发生错误，无法编译
    //
    //### 运行时异常
    //- 无需显示处理，也可以像编译时异常一样处理
    //- 比如数组越界，空指针都是运行时异常)
    
    // 文件输入流
    try{
      FileInputStream fis = new FileInputStream("a.txt");

    }catch(FileNotFoundException e){
      System.out.println("文件找不到异常");
    }

    ArithmeticException e;
    NullPointerException f;

  }

}



/*
 * Java 程序执行的三个步骤
 * 1. 编写。java文件
 * 2. 把.java文件编译（javac）成.class [翻译 javac的c:compile]
 * 3. 执行.class 运行结果
 */

public class Demo01 {

  public static void main(String[] args) {
    //## 多态的概述
    //### 什么是多台（polymorphic)
    //- 多态就是事物存在的多种形态
    //
    //
    //### Java中存在多态的前提条件
    //- 要有**继承关系**
    //- 要有**方法重写**
    //- 要有**父类引用指向子类对象**
    // 3. 多台的成员访问特点：
    //  1. 成员变量： 编译看左边（父类），运行看左边（父类—）
    //
    //
    //
    // 使用儿子
    Son son1 = new Son();
    System.out.println(son1.num);

    // 多态应用
    // 因为有继承关系，而且有方法重写num，所以可以通过父类（栈区）指向子类（堆区）来构造多态
    // 父类（Father son） 引用指向 子类（new Son())）
    //  1. 成员变量： 编译看左边（父类），运行看左边（父类—）
    Father son2 = new Son(); // Father son 
    System.out.println(son2.num); // 输出结果是父类的值 10，为什么呢, 因为成员变量编译看左边


    






  }

}


class Father{
  int num = 10;
}


class Son extends Father{
  int num = 20;
}

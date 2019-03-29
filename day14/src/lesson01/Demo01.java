package lesson01;

// 掌握
// 1. 明白什么是内部类什么是外部类
// 2. 内部类可以访问外部类的成员，包括私有的变量（成员）
//
public class Demo01 {
  public static void main (String[] args) {
    //# 内部类概述和访问的特点
    //
    //
    //### 内部类概述： 就是类的内部再声明类
    //
    //
    //### 内部类访问特点
    //1. 内部类可以直接访问外部类的成员，包括私有。
    //2. 外部类要访问内部类。就必须创建对象
    //### 内部类对象的创建语法
    //1. 外部类名.内部类名 对象名 = 外部类对象.内部类对象：
    //2. 开发中自己声明个内部类比较少用。用的比较多的就是集合的遍历，后面讲
    //

    
    // 创建内部类对象
    // 语法： 外部类对象.内部类名 对象名 = new 外部类对象.new 内部类对象；
    Outer.Inner inner = new Outer().new Inner();
    inner.test2();

  }

}

class Outer{
  private int a = 12;

  class Inner{
    //"内部类“可以直接访问外部类的成员，包括私有 
    public void test2(){
      System.out.println(a);
    
    }
  }

}

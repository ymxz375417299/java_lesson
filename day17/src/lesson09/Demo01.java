package lesson09;

public class Demo01 {

  public static void main (String[] args) {
    //# 09.JDK1.5的新特性自动装箱和拆箱讲解
    //JDK1.5的新特性自动装箱和拆箱
    //
    //### 1. 自动装箱： 把基本的数据类型转换成包装数据类型
    Integer i1 = 10; //  右边是基本数据类型，左边对象。 两个不同类型，怎么复制？ 正常情况不是应该先new构造吗
    // 自动装箱
    // 内部会自动new Integer(10) 即
    // Integer i1 = new Integer(10)  Integer 赋值给Integer是没问题的
    System.out.println("i1:" + i1);






    //### 2. 自动拆箱： 把包装类类型转换为基本数据类型)
    Integer i2 = new Integer(120);
    int a = i2; // 左边是基本数据类型int， i2是Integer类型，是对象两个不同，怎么又可以赋值？
    // 因为自动拆箱
    // 会自动调用 i2.inValue() 来转回int的数据类型
    // 所以 int 赋值给in没问题
    //
    //
    Double d1 = 9.14; // 也是自动装箱，内部会自动new Double(9.14)转换成 Double类型，double类型赋值给double类型是没有委托的








  }
}


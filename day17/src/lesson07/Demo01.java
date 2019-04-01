package lesson07;

public class Demo01 {
  public static void main (String[] args) {
    //# 基本数据类型包装类的概述
    //
    //### 为什么会有基本类型的包装类
    //讲基本数据类型封装成对象，这样的好处在于可以在对象中定义更多方法操作该数据
    //
    //### 包装类常用操作就是用与基本数据类型与字符串之间的转换
    //
    //
    //### 基本数据对应的包装类
    //- byte Byte
    //- short Short
    //- int Integer [先学习这个，其他的以后用到再讲]
    //- long Long
    //- float Float
    //- double Doubule
    //- char Character
    //- boolean Boolean


    // int转String字符串类型
    int a = 100;
    //String a = (String) a; // 不能这样强制类型转换，会报错， a 是String对象类型，存的是内存地址， 100是基本数据类型，不能互相转，为了解决这个问题
    // 所以每个数据类型都提供一个包装类


    // 使用int的包装类，Integer
    // 查看构造方法
    // Integer(int value)
    // 构造一个新分配的Integer 对象， 它表示指定的int的值

    Integer integer = new Integer(a); // 先实例化
    String s = integer.toString(); // 再使用toString的方法，转字符串
    System.out.println("s" + s);


    // 2. Integer的静态常量属性
    // 打印最大值最小值
    System.out.println("int最小值:" + Integer.MIN_VALUE);
    System.out.println("int 最小值： " + Integer.MAX_VALUE);

    // 3. Integer的其他方法
    // 把int转成2进制字符串
    System.out.println(Integer.toBinaryString(8)); // 传入的方法的2进制值

    // 把int转成8进制的字符串 
    System.out.println(Integer.toOctalString(9));

    // 把jint转成16进制的字符串
    System.out.println(Integer.toHexString(300));
  } 

}


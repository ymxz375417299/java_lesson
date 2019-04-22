package lesson09;

public class Demo01 {
  public static void main (String[] args) {
    //# 09.StringBuffer的添加方法讲解
    //
    //### 1. public StringBuffer append(String str)
    //可以把任意类型的数据添加到**字符串缓冲区 (字符数组)**里面，并返回字符串缓冲区本身,
    //
    //### 2. public StringBuffer inser(int offset, String str)
    //在指定位置把任意类型的数据插入到字符串缓冲区里面，并返回字符串缓冲区本身
    //
    //

    //StringBuffer 字符串缓冲区
    // StringBuffer sb1 = new StringBuffer(); // new 字符串缓冲区对象
    // StringBuffer sb2 = sb1.append("hello"); // 添加后返回的也是字符串缓冲区对象自己 ,具体看图解
    // System.out.println(sb1.hashCode()); // 打印sb1 和sb2的逻辑内存值，输出的地址一样
    // System.out.println(sb2.hashCode());

    StringBuffer sb = new StringBuffer();
    sb.append("hello"); // 因为append 返回自己本身，所以不需要另外拿另一个变量赋值，直接调用即可
    sb.append("how are you!"); 


    sb.insert(5, " lily"); //  代表指定的位置插入字符串

    // 前面的效果等于 String s = "hello" + "how are you";
    System.out.println(sb);


 }

}


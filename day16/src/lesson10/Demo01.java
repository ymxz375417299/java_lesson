package lesson10;

public class Demo01 {
  public static void main (String[] args) {
    // 10.StringBuffer的删除功能讲解
    // ### 1. public StringBuffer deleteCharAt(int index)
    // 删除指定位置的字符，并返回深深
    //
    // ### 2. public StringBuffer delete(int start, int end)
    // 删除从指定位置开始到指定位置结束的内容，并返回本身
    //

    StringBuffer sb = new StringBuffer("Gosling, Java Father..");

    System.out.println(sb);

    
    // 删除指定位置的字符
    // 因为返回本身，即是实际内存的值改了
    sb.deleteCharAt(1); // 删除o
    System.out.println(sb);

    // 删除指定开始和结束位置的字符
    // 是左闭右开的
    sb.delete(1, 4); System.out.println("删除后: " + sb); 
  }

}


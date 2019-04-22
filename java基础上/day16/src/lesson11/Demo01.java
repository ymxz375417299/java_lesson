package lesson11;

public class Demo01 {
  public static void main (String[] args) {
    //#  11.StringBuffer的反转功能讲解
    //### 1. StringBuff的替换功能
    //public StringBuffer replace(int start, int end, String str)
    //
    //从Start 开始到end用str替换
    
    StringBuffer sb = new StringBuffer();
    sb.append("Hello Gosling How are you?");
    System.out.println(sb);
    
    //把名字改成gyf
    //
    //end的计算，Start + 字符串的长度

    sb.replace(6, 13, "gyf");
    System.out.println(sb);


  }

}


package lesson14;

public class Demo01 {

  public static void main (String[] args) {
    //### 14.正则表达式的替换功能讲解
    //- public String replaceAll(String regex, String replacement) 传入正则表达式 和要替换的字符串
    
    String s = "520 java 520 h5 520 c";

    // 把520 都改成“我爱你”
    // s.replaceAll("\\d{3}", "我爱你");

    s = s.replaceAll("520", "我爱你");

    System.out.println(s);

  }
}


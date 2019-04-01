package lesson08;

public class Demo01 {
  public static void main (String[] args) {
    //# String 和 int类型的互相转换
    //### int 转String
    int a = 120;
    //1. 和 ""进行拼接
    String s1 = a + "";
    //2. public static String valuOf(int i) (String类的方法)
    String s2 = String.valueOf(a);
    //3. int - Integer - String(Integer类的toString方法())
    Integer integer = new Integer(a);
    String s3 = integer.toString();
    System.out.println(s3);
    //4. public static String toString(int i) (Integer类的静态toString方法)
    String s4 = Integer.toString(a);
    //5. 
    //
    //### String转int
    String str = "520";
    //1. String -- Integer - int 

    Integer int1 = new Integer(str);
    int b = int1.intValue();
    //2. public static int parseInt(String s)
    int c = Integer.parseInt(str);


    System.out.println(b);
    System.out.println(c);
  }

}


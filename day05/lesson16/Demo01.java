
public class Demo01 {

  public static void main(String[] args) {
    // 练习： 比较两个数据是否相同【通过方法重载来实现】
    // 注意： 最终实现不同类型比较得出相同结果

    System.out.println(isEquals(10, 10));
    System.out.println(isEquals(10.0, 10));
    System.out.println(isEquals(10, 10.0));
    System.out.println(isEquals(10.1, 10.1));
  }

  public static boolean isEquals(int a, int b){
     return a == b;
  }

  public static boolean isEquals(double a, double b){
     return a == b;
  }

  public static boolean isEquals(int a, double b){
     return a == b;
  }

  public static boolean isEquals(double a, int b){
     return a == b;
  }

}


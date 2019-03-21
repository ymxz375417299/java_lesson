
public class Demo01 {

  public static void main(String[] args) {
    // 方法重载
    // 1. 在同一个类中有多个相同方法名，这就是方法的重载
    //
    //
    // 2. 方法的重载和它的参数列表是不同
    // 3. 方法的重载与返回值类型无关
    //
    // 参数列表不同
      // 参数个数不同
      // 参数类型不同
      // 参数的顺序不同（算重载，但是开发中不用
    double sum1 = add(12.3, 2.1);
    System.out.println("sum1:" + sum1);
    double sum2 = add(2, 2.1);
    System.out.println("sum2:" + sum2);
  
    
  }


  public static double add(int a, double b){
    double sum = a + b;
    return sum;
  }

  public static double add(double b , int a){
    double sum = a + b;
    return sum;
  }

  public static double add(double b , double a){
    double sum = a + b;
    return sum;
  }

  public static int add(int a, int b){
    int sum = a + b ;
    return sum;
  }

  public static double add(double a, int b, int c){
    double sum = a + b + c;
    return sum;
  }

}



public class Demode1 {

  public static void main(String[] args) {
    // 方法的声明格式：
      // 修饰符返回值类型 方法名（参数类型 参数名1， 参数类型， 参数名2.。。（{
        // 方法体语句;
          // return 返回值；
      // }
    //加法运算
    // int a = 10;
    // int b = 12;
    // int sum = a + b;
    int sum1 = add(30, 12);
    System.out.println("和：" + sum1);

  }
  // 声明一个加法运算的方法
  public static int add(int a, int b){
    int sum = a + b;
    return sum;
  }

}



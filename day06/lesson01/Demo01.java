
public class Demo01 {

  public static void main(String[] args) {
    // 打印倒三角形
    // test1();
    test2();

  }

  public static void test1(){
    // 正方形
    int num = 5;
    for (int i = 1; i <= num; i++){
      for (int j = 1; j <= num; j++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }



  public static void test2(){
    // 倒三角形 
    int num = 5;
    for (int i = num; i > 0; i--){
      // 打印空格
      for (int k = 0 ; k <= num - i; k++){
        System.out.print("  ");
      }
      // 打印*
      for (int j = 1; j <= i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

}


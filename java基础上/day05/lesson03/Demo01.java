
public class Demo01 {

  public static void main(String[] args) {
    //循环结构循环嵌套输出直角三角形
    int row = 4;
    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= i; j++){
        System.out.print("* ");
      }
      System.out.println();

    }

  }

}


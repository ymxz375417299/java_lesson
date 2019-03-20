
public class Demo01 {

  public static void main(String[] args) {
    //循环结构循环嵌套输出4行五列的星星
    //*****
    //*****
    //****
    //*****
    int row = 4; // 行数
    int column = 5; // 列数
    //1. 循环4词，代表4行
    for(int i=1; i<=4; i++){
      for(int j=1; j<=5; j++){
        System.out.print("* ");
      }
      System.out.println("");
    }

  }

}


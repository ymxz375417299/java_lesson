
public class Demo01 {
  public static void main(String[] args) {

    // 1. 局部代码块
    // 在方法中出现； 限定变量生命周期，尽早释放，提高内存的利用率
    for(int i = 0; i < 10 ; i++){
      System.out.println("i:" + i);
    }



    // 这个也是局部代码块，直接写花括号
    {
      int i = 10;
      System.out.println(i)
    }
    // 报错，不能访问局部代码块
    System.out.println(i);

  }

}


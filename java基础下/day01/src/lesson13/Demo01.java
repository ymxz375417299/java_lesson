package lesson13;

public class Demo01 {
  public static void main (String[] args) {
    // 面試題
    //### 2. 如果catch里面又return语句，请问finally的代码还会执行吗？ 如果会， 请问是在return前还是return后
    //答： 会执行，finally在return之前执行！
    
    int r = getDiv(10, 0);
    System.out.println("r=" + r);
    
    
  }

  // 返回a/b的结果
  public static int getDiv(int a, int b){
    int i = 0;
    try {
      i = a / b;
      return i;
    }catch(ArithmeticException e){
      System.out.println("算数异常，除数不能为零");
      i = -1;
      System.out.println(i);
      return i;
    }finally{
      System.out.println("finally代码执行了。。。");
      i = -2; // 返回值是-1 ，返回的i值多少和return前是多少有关
      System.out.println(i);
      // return i; // 最好不要在finally内返回
    }
  }


}


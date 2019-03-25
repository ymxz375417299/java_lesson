
public class Test2 {

  public static void main(String[] args) {

      Zi z = new Zi();

  }

}



class Fu{
  static {
    System.out.println("静态代码块Fu"); //1
  }

  {
    System.out.println("构造代码块FU"); //3
  }

  public Fu(){
    System.out.println("构造方法Fu"); //4
  }
}

class Zi extends Fu{
  static{
    System.out.println("静态代码块ZI"); // 2
  }

  {
    System.out.println("构造代码块ZI"); //5
  }

  public Zi(){
    // 默认有super(); 调用父类的构造方法
    System.out.println("构造方法zi"); // 6
  }
}

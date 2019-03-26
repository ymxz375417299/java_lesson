
public class Demo01 {

  public static void main(String[] args) {

    // 静态方法： 编译(即IDE写代码的时候静态编译检测功能)看左边（父类）， 运行看左边（父类）

    // 父类（栈）引用指向子类（堆）
    Father son = new Son();
    son.eat();
  }
}


class Father{
  int num = 10;

  // 静态方法
  public static void eat(){
    System.out.println("吃海鲜");
  }
}



class Son extends Father{
  int num = 20;

  // 静态方法
  public static void eat(){
    System.out.println("吃海鲜。。");
  }
}


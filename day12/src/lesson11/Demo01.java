
public class Demo01 {

  public static void main(String[] args) {
    // 葵花宝典（更好的理解抽象类）

    // 创建类
    Yuebuqun yue = new Yuebuqun();
    yue.cut();

    Lin lin = new Lin();
    lin.cut();

  }

}


abstract class Kui{
  public abstract void cut();
  
}


class Yuebuqun extends Kui{
  @Override
  public void cut(){
    System.out.println("用刀子宫");
  }

}


class Lin extends Kui{
  @Override
  public void cut(){
    System.out.println("用筷子自宫");
  }
}


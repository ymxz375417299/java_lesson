
public class Demo03 {

  public static void main(String[] args) {
    // 接口与接口的多层继承

  }

}


interface FInterface{
  public void test1();
}


interface GInterface extends FInterface{
  public void test2();
}

interface HInterface extends GInterface{
  public void test3();
}

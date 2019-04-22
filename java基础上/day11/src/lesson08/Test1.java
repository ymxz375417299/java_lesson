class Fu{
  public int num = 10;

  public Fu(){
    System.out.println("fu"); // 1
  }
}


class Zi extends Fu{
  public int num = 20;
  public Zi(){
    // 子类的所有构造方法会先调用父类无参的构造方法
    System.out.println("zi"); // 2
  }

  public void show(){
    int num = 30;
    System.out.println(num); // 输出30 // show方法的num
    System.out.println(this.num); // 输出20 //类里的num
    System.out.println(super.num); // 输出10
  }


}


public class Test1{
  public static void main(String[] args){
    Zi z = new Zi();
    z.show();
  }
}

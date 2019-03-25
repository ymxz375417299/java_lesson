
public class Demo01 {

  public static void main(String[] args) {
    // # 方法重写的注意事项
    // # 1. 父类中私有方法不能被重写，因为父类私有方法，子类根本没有继承
    // # 2. 子类重写父类方法是，访问权限最好就一致 ,意思是父类的方法是publc ，子类也要是public, 不能是private 私有

  }

}


class Father{
  public void drive(){ // 
    System.out.println("开宝马..");
  }
}


class Son extends Father{
  @Override
  public void drive(){
    System.out.println("开三轮车....");
  }
}

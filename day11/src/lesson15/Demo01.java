
public class Demo01 {

  public static void main(String[] args) {
    //### final 修饰特点
    //1. 修饰类， 类不能被继承，相当于做了丁克
    //2. 修饰变量， 变量就变成了常量，智能被赋值一次
    //3. 修饰方法，方法不能被重写


    //2. 修饰变量， 变量就变成了常量，智能被赋值一次
    // 变量： 值的是值可以改变
    final int a = 12;
    // a = 0; 智能被赋值一次

  }

}

// 1 修饰类，类不能被继承， 相当于做 丁克
// final class Father
class Father{
  public void driver(){
    System.out.println("开车~~~~~");
  }


  // 3. 修饰方法，方法不能被重写
  final public void sing(){
    System.out.println("父亲唱东方红");
  }
}

class Son extends Father{

  // @Override
  // public void sing(){
    // System.out.println("儿子在唱歌");
  // }
}

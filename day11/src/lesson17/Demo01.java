
public class Demo01 {

  public static void main(String[] args) {
    //# 非静态 final 西施变量的2个初始化实际
    //1. 一定义变量可以赋值初始化【这种初始化方法比较常用】
    //2. 在构造方法内初始化
    //
    //注意： 在类中不可重复给final赋值，只能赋值一次
    //
    //


  }

}

class Circle {
  //1. 一定义变量可以赋值初始化【这种初始化方法比较常用】
  // finnal double PI = 3.14
  
  //2. 在构造方法内初始化
  final double PI;

  public Circle(){
    PI = 3.14;
  }
}

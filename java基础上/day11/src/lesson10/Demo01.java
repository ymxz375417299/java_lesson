
public class Demo01 {

  public static void main(String[] args) {

    // # 方法的重写概述及其应用
    // # ### 1. 什么是方法重写
    // # - 方法重写是指子父类出现了一模一样的方法
        //  - 包括参数或者返回类型也要一样才是重写，例如重写的父类方法后，加了参数，那就不是重写了
    // # - 重写这个概念只存在子类和父类中
    // #
    // #
    // # ### 2. 方法重写 的应用
    // # 当子类需要父类的功能，而子类有自己特有的内容是，可以重写父类中的方法。这样，即沿袭父类的功能，有定义了子类特有的功能。




    // 创建儿子对象
    Son son = new Son();
    son.drive();
  }

}


class Father{
  public void drive(){ // 如果加了参数，即使名字一样也不是重写
    System.out.println("爸爸开车。。");
  } 
}


class Son extends Father{
  @Override // 一般重写的变量都添加这个装饰器，说明这个是重写的方法
  public void drive(){
    super.drive(); // 调用父类的driver功能
    System.out.println("儿子开红旗。。。");
  }
}

package lesson13;

public class Demo02 {

  public static void main (String[] args) {
    // 模板（Template)设计模式
    /**
     * 设计一个计算耗时的模板
     * ## 模板设计模式概述
     * 模板模式就是定义一个算法的骨架，而将具体的算法延迟到子类中来实现
     */
    
    System.out.println(
        new Test1()
          .getScheduleTime()); // 因为Test1继承了TimeTemplate的抽象类，所以实例化对象后，直接执行getScheduleTime()方法即可 
          // 返回时间差

    System.out.println(new Test2().getScheduleTime());
  }

}


abstract class TimeTemplate{
  // 获取执行时间
  public long getScheduleTime(){
    long start = System.currentTimeMillis();
    code(); // 执行抽象类
    long end = System.currentTimeMillis();
    long delta = end -start; // 时间差
    return delta;
  }

  public abstract void code(); // 定义抽象类
}


// 继承抽象类
// 使用模板的子类一
class Test1 extends TimeTemplate{
  @Override
  public void code(){
    for (int i = 0; i < 100000; i++){
      System.out.println("我喜欢杨幂！");
    }
  }
}

// 继承抽象类
// 使用模板的子类二
class Test2 extends TimeTemplate{
  @Override
  public void code(){
    for (int i = 0; i < 880000; i++){
      System.out.println("我喜欢范冰冰！");
    }
  }
}

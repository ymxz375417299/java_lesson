package lesson13;

public class Demo01 {

  public static void main (String[] args) {
    /**
     * ## 模板设计模式概述
     * 模板模式就是定义一个算法的骨架，而将具体的算法延迟到子类中来实现
     *
     * ### 优点
     * 使用末班方法模式，在定义算法骨架的同时，可以很灵活的实现具体的算法，满足用户灵活
     *
     * ### 缺点
     * 如果算法骨架有修改的话，则需要修改抽象类
     */
    
    // 以前打印10000次是这么写的
    long start = System.currentTimeMillis();
    // for循环内的代码是变化的，其他代码作为骨架
    for (int i = 0; i < 100000; i++){
      System.out.println("我喜欢林志玲。。。");
    }

    long end = System.currentTimeMillis();

    long delta = end - start;
    System.out.println("总耗时：" + delta + "毫秒");
  }
}


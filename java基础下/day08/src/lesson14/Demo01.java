package lesson14;

public class Demo01 {
  public static void main(String[] args) {
    // ### 枚举概述
    // 1. 枚举是指将变量的值意义列出，可以陈伟【数据集】,是一个特殊的类
    // 距离： 一周只有7天， 一年只有12个月， 一年只有四个季节等
    // ### 2. Java中enum通过声明的类称为枚举类（没有class关键词）
    // ``
    // enum Season{
    // // 春夏秋冬
    //     SPRING,
    //         SUMMER,
    //             AUTUMN,
    //                 WINTER; // 规范可以大写可以全蝎
    //                 }
    //                 ```
    //
    //                 ### 使用
    //                 不需要new, 直接使用
    //                 ``
    //                 Season 色暗送= SEanson.SPRING;
    //                 ```
    //
    //                 3. 枚举其实就是限定范围，防止不应该发生的事情发生
    //                 ### 4. 枚举注意事项
    //                 - 定义枚举类要用关键字enum
    //                 - 所有的枚举类都是Enum的子类
    //                 - 枚举类的第一行上必须是枚举项，最后一个枚举项后的分号可以省略，但是如果枚举类有其他的东西，这个分好不能省略，建议永远不省略
    //                 - 枚举类可以有构造器，但是必须是private的，他默认也是private
    //                 - 枚举类也可以有抽象方法，但是枚举项必须重写该方法
    //                 - 枚举在switch语句中的使用
    //                 - 
    //                 ### 枚举在switch语句中的使用

    // 使用枚举
    Season s1 = Season.SPRING;

    // 调用枚举的方法
    s1.test(); 
    Season.WINTER.test();


    // 配合switch
    switch(s1){
    case SPRING:
      System.out.println("春天来了，树木发芽了。。");
      break;
    case SUMMER:
      System.out.println("夏天来了，空调开起来");
      break;
    case AUTUMN:
      System.out.println("秋天来了，秋装买起来。。");
      break;
    case WINTER:
      System.out.println("冬天来了");
      break;
    default:
      break;
    }
  }
}


// 定义季节的枚举
enum Season {
  // 春夏秋冬
  // SPRING,
  // SUMMER,
  // AUTUMN,
  // WINTER;

  SPRING("春天"){
    @Override
    public void test(){
      System.out.println("春天的test方法");
    }
  },
  SUMMER("夏天"){
    @Override
    public void test(){
      System.out.println("夏天的test方法");
    }
  },
  AUTUMN("秋天"){
    @Override
    public void test(){
      System.out.println("秋天的test方法");
    }
  },
  WINTER("冬天"){
    @Override
    public void test(){
      System.out.println("冬天的test方法");
    }
  };

  /** 枚举可以定义有参和无参构造方法
  * 如果定义了有参构造方法，而且没定义无参构造方法
  */
  private String s; // 定义了私有变量，所以枚举的值SPRING。。。。就像Season的子类一样，都有这样的变量
  // 有参构造方法
  private Season(String s){
    this.s = s;
    System.out.println("有参的构造方法。。" + s);
  }

  // 空参的构造方法
  Season(){
    System.out.println("空参构造方法");
  }
  
  // 定义了个抽象方法
  // 那枚举的值都必要重写这个抽象类
  public abstract void test();

}

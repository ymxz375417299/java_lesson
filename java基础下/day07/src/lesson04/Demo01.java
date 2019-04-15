package lesson04;

public class Demo01 {

  public static void main (String[] args) {
    /**
     * ## 单例设计模式（掌握）
     *
     * ### 单例设计模式
     * 保证类再内存中值有一个对象
     *  1 对象是new出来的
     *  2 程序中， 保证只能new一次对象
     * ### 如何保证类再内存中只有一个对象？
     * 1 控制类的创建，不让其他类来创建本来的对象。 **private**
     * 2 在本类中定义一个本类的对象。 Singleton s;
     * 3 提供公共的访问方式。 public static Singleton getInstance(){return s}
     */


    // ### 单例写法有两种
    // 1. 饿汉式 开发用这种
    // 2. 赖仪式 面试写这种。 多线程的问题？
    
    Singleton s1 = Singleton.getInstance(); // 方法改成静态了。所以直接用类名调用
    System.out.println(s1);
    System.out.println(Singleton.getInstance());
    System.out.println(Singleton.getInstance());
    System.out.println(Singleton.getInstance());
    System.out.println(Singleton.getInstance());
    System.out.println(Singleton.getInstance());
  }
}

/**  写法一： 饿汉式*/
class Singleton1{
  private static Singleton1 instance = new Singleton1(); // 声明一个变量，并new对象， 这样就创建变量的时候就new了对象,而且因为值鞥getInstance()方法获取
  // 声明静态属性， 因为要静态方法getINstance调用，静态方法只能调用静态属性。

  // 写一个空参构造方法，而且private 私有化，不允许外部调用空参构造方法
  private Singleton1(){

  }

  // 写一个获取instance私有属性的方法
  public static Singleton1 getInstance(){ // 因为已经写死了不允许new这个对象，所以要调用这个方法，就声明静态【static】,直接用类名调用 
    return instance;  // 静态方法只能静态属性，所以需要把instance改成静态属性kK
  }
}

/** 方式二： 懒汉式
 * 用到的时候才new对象，即当调用getInstance才调用
 */
class Singleton{
  private static Singleton instance ;// 声明静态属性， 因为要静态方法getINstance调用，静态方法只能调用静态属性。

  // 写一个空参构造方法，而且private 私有化，不允许外部调用空参构造方法
  private Singleton(){

  }

  // 写一个获取instance私有属性的方法
  public static Singleton getInstance(){ // 因为已经写死了不允许new这个对象，所以要调用这个方法，就声明静态【static】,直接用类名调用 
    // 如果为空，则new对象，如果不为空，则直接返回
    if ( instance == null){
      instance = new Singleton();
    }
    return instance;
  }
}

/** 方式三： 最简单的
 * 1 声明私有的无参构造方法，不允许外部new对象
 * 2 创建公共public属性，而因为一加载类就给他new一个对象，而无构造方法声明为私有，又不允许外部使用。就能保证全局唯一的单例。
 * 安全隐患：
 * 因为属性是公共的public，则外部可以直接赋值给其他乱七八糟对象, 所以不允许改值，需要添加final修饰，只允许赋值一次
 * */

class Singleton{
  public static Singleton instance = new Singleton();  // 声明public公用 + final 只允许赋值
  private Singleton(){};
}

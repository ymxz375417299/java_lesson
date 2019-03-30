package lesson18;
/**
 * Class 这类描述类的结构H
 * Class 描述一个类的类目，属性，方法,构造方法
 */

public class Demo01 {

  public static void main(String[] args) {
    /** # getClass方法
    // - public finnal class getClass()
    // - 返回此Object运行时的类
    // - 可以通过class类的一个方法，获取对象的真是累的全名称
    */
    Animal dog = new Dog();
    // 返回此对象运行时类
    Class clz = dog.getClass();
    System.out.println(clz); // 因为使用了多态，所以运行时，是看右边new Dog(); 输出结果为class lesson18.Dog
    System.out.println(clz.getName());//包名+类名
    System.out.println(clz.getSimpleName());// 类名

    // 匿名内部类
    Animal cat = new Animal() {
      @Override
      public void eat(){
        System.out.println("猫吃鱼");
      } 
    };

    System.out.println(cat.getClass());
    // 输出class lesson18.Demo01$1， 匿名内部类都是有个$符号标识

    // 匿名接口内部类
    AInterface ai = new AInterface(){
      @Override
      public void test1(){
        System.out.println("test1");
      }

    };
    System.out.println(ai.getClass());
    // 输出class lesson18.Demo01$2  

  }
}

//接口
interface AInterface{
  public void test1();

}
abstract class Animal {
  public abstract void eat();
}

class Dog extends Animal {
  @Override
  public void eat() {

    System.out.println("狗吃骨头");
  }
}

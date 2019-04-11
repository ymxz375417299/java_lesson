package lesson06;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {

  public static void main (String[] args) throws IOException {
    /**
     * ## 装饰（DEcorator模式
     * #### 1 装饰模式的概念
     * 学过的装饰对象如： BufferInputStream, BufferOutputStream, BufferReader, BufferWriter
     * - 装饰模式是动态给一个对象添加一些额外的功能，就增加功能来说，装饰模式比生成子类更灵活。
     *   - 装饰模式是在不必改变原类文件和使用继承的情况下。动态的拓展一个对象的功能
     *   - 装饰模式一创建一个包装对象，也就是使用装饰来包裹真实的对象。
     *   - 
     *
     *
     *   #### 2 装饰模式的实现方法
     *   1. 装饰对象和真实对象有相同的接口。
     *   2. 装饰对象包含一个真实对象的引用（reference)
     *   3. 装饰对象的所有方法，内部实现都是通过真实对象的引用来调用，然后实现自己的功能
     *
     *   ### 3. 适用性，应用场景
     *   问： 为什么我直接在真实类改就行了。为什么非要写多个类来装饰！？
     *
     *   答： 很多时候，真实类不是你写的，你不能改别人代码的原则，有些类被final修饰，无法继承的。 装饰类灵活性更强
     *
     *   1. 需要拓展一个类的功能，或给一个傀儡添加附加职责
     *   2. 当不能采用生成子类来实现，比如final类
     */

    // BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));

    GYFStudent stu = new GYFStudent(new UniversityStudent()); // 给装饰类GYFStudent 传入真实类的引用UniversityStudent
    stu.code();


  }
}

// 1. 接口
interface Person{
  public  void code();
}


// 2. 接口实现类
final class UniversityStudent implements Person{
  @Override
  public void code(){
    System.out.println("在大学期间学了一点点C语言");
  }
}


/** 
 * 3 继承了接口实现类UniversityStudent 然后添加额外的功能， 打印”成功学生了Java语言“
 *
 * 问题来了！
 * 如果父类是final类型（不能被继承的类） ，那无法继承，怎么添加装饰新的 功能？？
 */

// 方式一：继承来添加额外功能, 因为UniversityStudent类被final修饰，无法被继承，此方式失效
// class GYFStudent extends UniversityStudent{
  // @Override
  // public void code{
    // super.code();
    // System.out.println("成功学习了Java语言");
  // }
// }


// 方式二： 装饰类来添加功能
class GYFStudent implements Person{ // 需要和真实的类实现一样的接口
  // 写一个属性用来接受外来传入的真实类
  private UniversityStudent us; 

  // 写一个构造方法，参数是接受真实对象的引用
  public GYFStudent(UniversityStudent us){
    this.us = us;
  }

  // 砖石对象的所有功能， 内部真实都是通过真实对象的引用来调用，然后实现自己的额外功能
  @Override
  public void code(){
    us.code(); // 调用真实类的code
    System.out.println("乔帮主果然是个天才，轻松自学了Java语言, 并月薪2万");
  }
}




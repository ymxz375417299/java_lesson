

/**
 * 总结：
 * 1. 当子类要访问属性和方法的时候
 *    如果子类自己有这个属性和方法，就访问自己的
 *    如果子类没有这个属性和方法，就调用父类
 *    如果子类和父类都有这个属性和方法，一定要调用父类的，那么在调用属性和方法的时候，前面加个super.关键字
 */



public class Demo01 {

  public static void main(String[] args) {
  // # super
  // # ### 1. super的作用
  // # super指的是当前类的对象的父类引用
  // #
  // # ### 2. super可以调用父类的成员属性super.成员变量
  // # ### 3. super可以调用父类的成员方法super.成员方法
  // # ### 4. super可以调用父类的构造方法super(xxx)V

    // 1. 创建一个子类的对象
    Student stu1 = new Student();
    stu1.say();
    stu1.dancing();
    stu1.sing();


  }

}



class Person{
  String name = "邓小平";
  int age;

  public void sing(){
    System.out.println("父类方法： 我在唱歌, 英文歌");
  }
}


class Student extends Person{
  String name = "周恩来"; 
  public void say(){
    //和父类重名的变量name，会优先选择自己的变量
    // system.out.println("i'm " + name + "," + age + " years old");

    //这个方法的name 和 age属性都是访问父类 , super指向父类。
    //super可以调用父类的成员属性super
    System.out.println("I'm " + super.name + "," + age + " years old");
  }


  public void dancing(){
    System.out.println("子类方法： 跳舞。。。");
    // super可以调用父类的成员方法super
    super.sing(); //子类调用父类的方法

  }

  //和父类重名方法sing，会优先选择自己的方法
  public void sing(){
    System.out.println("子类方法： 我在唱歌, 中文歌");
  }

  
}

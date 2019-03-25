
public class Demo01 {

  public static void main(String[] args) {

    /*
     * this 的作用： this值的是当前类的对象引用
     * 1. this可以调用本类的成员属性this.成员属性
     * 2. this可以调用本类的成员方法this.成员方法
     * 3. this也可以调用父类的成员方法（在本类没有的情况下）this.父类方法、this.父类属性 
     * 4. this可以调用本来的构造方法this(...)
     */

    Student stu1 = new Student();
    stu1.say();
  }

}


class Person{
  String name = "小胡";

  public void dancing(){
    System.out.println("父类： 跳拉丁舞...");
  }
}


class Student extends Person{
  String name = "小刘";

  public void say(){
    //1. this可以调用本类的成员属性this 
    System.out.println("i‘m " + this.name); //访问子类的nameshuxing 
    // 跳舞
    // dancing(); // 本类的成员方法
    // this.dancing(); // 先调用子类的dancing方法，但是如果子类没有dancing方法就会找父类的
    super.dancing(); // 指定调用父类的dancing方法

  }

  public void dancing(){
    System.out.println("子类： 跳街舞。。");
  }

}


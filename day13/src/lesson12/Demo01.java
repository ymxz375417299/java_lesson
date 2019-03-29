package lesson12;

import com.baidu.model.Student;

public class Demo01 {
  public static void main(String[] args) {
    // # 用在成员变量的修饰符
    // - 权限修饰符： private, 默认的，protected, public
    // - 状态修饰符： static, finnal
    // 用到最多的就是：private

    // ### 总结：
    // 1.如果一个属性声明为private,代表这个属性只能在当前的类中使用
    // 2. 如果一个属性什么都不声明，代表是默认，表示同一个包可以被访问，其他包不能访问
    // 3. 属性声明为protected,代表的意义，以后再讲。。
    // 4. 属性声明为public,代表任何地方都可以访问这个属性
    // 5. 属性声明为static,代表是一个静态属性，访问的时候，直接通过类名访问
    // 6. 属性声明为final, 代表这个属性为**常量**，如果是常量，只能赋值一次，最好一旦声明就赋值，或者早构造方法就赋值
    //
    Duck duck = new Duck();
    duck.setName("rock");
    duck.say();

    Student stu = new Student("rock", 33);
    System.out.println(stu.name);

    System.out.println(Duck.country);
  }
}

class Duck {
  final int LEGS = 4;
  static String country = "中国";
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public void say() {
    System.out.println("my name is " + name);
  }
}

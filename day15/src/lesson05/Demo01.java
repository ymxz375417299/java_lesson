package lesson05;

public class Demo01 {
  public static void main (String[] args) {
    //# ==号与equals方法的区别
    //
    //1. ==是一个比较运算法，既可以比较基本数据类型，也可以比较引用的数据类型，基本数据类型比较的是值，引用数据类型比较的是地址值
    //
    //2. equals方法是一个方法，只能比较引用数据类型，所有的对象都会继承object类的方法，如果没有重写Object类的equals方法， equals方法和==号比较引用数据类型无区别，重写后的equals方法比较的是对象的属性
    // 
    //
    int a = 10;
    int b = 10;
    System.out.println("a和b是否相等" + (a == b));

    Student stu1 = new Student("小勇", "美国");
    Student stu2 = new Student("rock", "中国");
    Student stu3 = stu1;
    System.out.println("stu1, stu2:" + stu1.equals(stu2)); // 默认比较的是内存地址是否一样
    System.out.println("stu1, stu3:" + (stu1 == stu2)); // 这种写法也是比较的内存地址;
    System.out.println("stu1, stu3:" + (stu1 == stu3));

    // 错误写法 equals是不能比较基本数据类型的
    // System.out.println(a.equals(b));



    
  }

}


class Student{
  String name;
  String country;

  public Student(String name, String country) {
    this.name = name;
    this.country = country;
  }

}

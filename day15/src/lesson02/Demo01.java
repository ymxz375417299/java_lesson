package lesson02;

public class Demo01 {
  public static void main(String[] args) {
    /* # Object的equals方法
     * # 1. 表示与其他对象是否相等
     * # 2. 默认情况下比较的是对象的引用（地址）是否相同
     * # 3. 由于比较对象的引用没有意义，一般建议重写此方法 */

    Student stu1 = new Student("刘备", 13);
    Student stu2 = new Student("张飞", 20);
    Student stu3 = stu1;
    Student stu4 = new Student("刘备", 13);
    // 打印逻辑地址
    System.out.println("stu1内存逻辑地址" + stu1.hashCode());
    System.out.println("stu2内存逻辑地址" + stu2.hashCode());

    // 比较两个对象的地址是否相同
    System.out.println("比较两个对象stu1 和stu2地址是否一致" + stu1.equals(stu2));
    System.out.println("比较两个对象stu1 和stu3地址是否一致" + stu1.equals(stu3));
    
    // 但是实际用处不大。因为我们要判断两个对象是根据属性是否一致，而不是单纯的看内存地址！，就算new2个相同的 属性一样也应该认为一样

    //2. 如果要判断stu1是否和stu4是否同一个人
    //第一种解决方法
    if (stu1.age == stu4.age && stu1.name.equals(stu4.name)){  // stu1.name.equals 比较的是stu1和stu4字符串的对象是否同一个地址。相同字符串的地址是一样的
      System.out.println("stu1和stu4是同一个人");
    
    }else{
    
      System.out.println("stu1和stu4不是同一个人");
    }
    // 输出结果是同一个人


  }
}

class Student {
  String name;
  int age;

  public Student() {}

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

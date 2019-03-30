package lesson03;

/**
 * 掌握：
 * 重写父类的equals方法，改变这个方法的比较规则
 * 默认情况下equals比较的是两个对象的内存地址是否一样
 * 重写后，可以根据属性是否一样来返回boolen值
 *
 *
 *
 */
public class Demo01 {
  public static void main (String[] args) {
    

    Student stu1 = new Student("刘备", 13);
    Student stu2 = new Student("张飞", 20);
    Student stu3 = stu1;
    Student stu4 = new Student("刘备", 13);

    //2. 如果要判断stu1是否和stu4是否同一个人
    //第一种解决方法
    if (stu1.age == stu4.age && stu1.name.equals(stu4.name)){  // stu1.name.equals 比较的是stu1和stu4字符串的对象是否同一个地址。相同字符串的地址是一样的
      System.out.println("stu1和stu4是同一个人");
    
    }else{
    
      System.out.println("stu1和stu4不是同一个人");
    }
    // 输出结果是同一个人
    //
    //
    // 第二种解决方法(重写equals方法）
    System.out.println("Stu1和stu4是否为同一个人：" + stu1.equals(stu4));
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



  // 重写equalsJ
  @Override
  public boolean equals(Object obj){ 
    // 参数：Object obj 是什么意思
    // 公式为 Object obj = Student stu4 即多态


    // 1.把obj还原为Student类型
    Student other = (Student)obj; //强制类型转换

    // 比较两个对象年龄和名字是否一样
    return this.age == other.age && this.name.equals(other.name);
  
  }
}


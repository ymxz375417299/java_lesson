
public class Demo01 {

  public static void main(String[] args) {
    // 成员属性的三种赋值方式
    // 1. 直接给属性赋值【这种开发中比较少用】
    Student stu1 = new Student();
    stu1.name = "mayun";
    stu1.age = 40;
    stu1.say();

    // 2. 通过setXxx()方法给属性赋值【开发中常用，一般属性都会声明private】
    Student stu2 = new Student();
    stu2.setAge(99);
    stu2.setName("myhuatent");
    stu2.say();

    // 3. (有/无参)构造方法, 给对象中属性进行初始化
    Student stu3 = new Student("liyanghoing", 111);
    stu3.say();
  }

}


class Student{
  String name; // 使用set,get 记得私有化属性， private String name,这里为了不报错，暂时不写
  int age;


  // 有参构造方法
  public Student(String name, int age){
    this.age = age;
    this.name = name;
  }
  // 无参构造方法
  public Student(){
    this.age = 0;
    this.name = null;
  }

  

  public void say(){
    System.out.println(name + ":" + age);
  }



  // 通过setXxx() getXxx()方法获取和设置成员变量
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

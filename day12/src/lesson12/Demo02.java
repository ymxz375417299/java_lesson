
public class Demo02 {

  public static void main(String[] args) {
    // 案例2：
    // 使用抽象类练习老师的案例
    // 具体事务：基础班老师， 就业办老师
    // 共性：姓名， 年龄， 讲课


    Teacher teacher1 = new BasicTeacher("rock", 320);
    // teacher1.name = "assda";
    // teacher1.age = 30;
    teacher1.teaching();


    System.out.println("==========");
    Teacher teacher2 = new JobTeacher();
    teacher2.name = "bbb";
    teacher2.age = 18;
    teacher2.teaching();
  }

}


abstract class Teacher{
  String name;
  int age;
  // 抽象方法
  public abstract void teaching();


  // 空参构造方法
  public Teacher(){};
  
  // 有参构造方法
  public Teacher(String name, int age){
    this.name = name;
    this.age = age;
  }

}

// 基础班老师
class BasicTeacher extends Teacher{

  @Override
  public void teaching(){
    System.out.println("我是" + name + "今年" + age);
    System.out.println("我来教你们Java 基础阶段的内容...");
  }

  //有参构造方法
  public BasicTeacher(String name, int age){
    super(name, age);
    //this.name = name; //也可以这么写
    //this.age = age;
  }
  
}



// 就业办老师
class JobTeacher extends Teacher{
  @Override
  public void teaching(){
    System.out.println("我是" + name + "今年" + age);
    System.out.println("我来教就业办课程");
  }
} 



public class Demo01 {

  public static void main(String[] args) {
    // 使用抽象类练习员工的案例
    //  加入我们在开发一个系统时需要对“程序员类”进行设计
    //  程序员包括三个属性： 姓名，工号以及工资
    //  项目经理，除了含有程序员的属性外，另外还有一个奖金属性
    //  请使用继承的思想设计出程序员和经理类，要求类中提供必要的方法进行属性访问
    //

    Programmer programmer = new Programmer("dong", "4444", 44);
    programmer.say();

    ProjectManager projectmanager = new ProjectManager("rock", "10086", 35000, 70000);
    projectmanager.say();

  }

}


// 公司类
abstract class Employee{
  String name;
  String id; // 工号
  double salary; // 工资
  public abstract void say();

  //有参构造方法
  public Employee(String name, String id, double salary){
    super();
    this.name = name;
    this.id = id;
    this.salary = salary;
  }
  //无参构造方法
  public Employee(){
    super();
  }
}

// 程序员
class Programmer extends Employee{

  @Override
  public void say(){
    System.out.println("我是" + name);
    System.out.println("我的工号" + id);
    System.out.println("工资：" + salary);
  
  }


  public Programmer(String name, String id, double salary) {
    super(name, id, salary);
  }

}


// 项目经理
class ProjectManager extends Employee{
  double bonuses;

  @Override
  public void say(){
    System.out.println("我是" + name);
    System.out.println("我的工号" + id);
    System.out.println("工资：" + salary);
    System.out.println("奖金：" + bonuses);
  }

  // 有参构造方法
  public ProjectManager(String name, String id, double salary, double bonuses){
    super(name, id, salary);
    this.bonuses = bonuses;
  }
}

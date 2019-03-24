
public class Demo01 {

  public static void main(String[] args) {
    // 练习二： 员工类需求
      // 定义一个员工类Employee

    Employee emp = new Employee("big luo", "android888", 25000);
    emp.say();
    System.out.println("涨工资啦~~~");
    emp.setSalary(35000);
    emp.say();

  }

}

class Employee{
  private String name;
  private String id;
  private double salary;

  // 构造方法
  public Employee(){}
  public Employee(String name, String id , double salary){
    this.name = name;
    this.id = id;
    this.salary = salary;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void say(){
    System.out.println("我是：" + name + "员工编号：" + id + "工资" + salary);
  }
}


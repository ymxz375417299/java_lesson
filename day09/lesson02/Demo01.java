
public class Demo01 {

  public static void main(String[] args) {
    Employee emp = new Employee();

    //2. 赋值
    emp.name = "刘教练";
    emp.position = "瑜伽高级教练";
    emp.say();


  }

}


class Employee{
  String name; //名称 - 成员变量/全局变量
  String position; //职位

  public void say(){
    String name = "胡教练";  // 声明一个新局部变量,和成员变量重名，
    System.out.println("我是" + this.name + "从事" + position); // 前面加this，表示会指明成员变量// 解决局部变量和成员变量的重名问题
  }
}

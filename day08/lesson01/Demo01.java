
public class Demo01 {

  public static void main(String[] args) {

    // 封装的概述： 
    //    是指隐藏对象的属性和实现细节，紧急对外提供公共public访问方式。

    // 封装的好处：
    // - 隐藏实现细节，提供公共的访问方式
    // - 提高了代码的复用性(每次需要设置变量，只需要调用对应方法即可)和安全性(限制了传入的参数界限)。

    // 封装的原则
    // - 封装原则将不需要对外提供的内容都隐藏起来
    // - 把属性隐藏（属性前面声明private）， 提供接口方法体用对外访问



    // 案例：年龄赋值的问题，不能复制负数，也不能赋值无限大
    // 一种封装的解决方案步骤
    // 1. 把age属性声明为私有属性;
    // 2. 提供一个公共访问的方法来实现年龄的赋值
    // 3. 这样就是封装



    Person p = new Person();
    p.name = "VincentT_lwprd";
    p.setAge(30);
    p.speak();
    System.out.println("在外部访问测试， 年龄：" + p.getAge());

  }



}



class Person{
  String name ;
  private int age; // 声明私有变量

  public int getAge(){
    //听接口，获取私有属性age
    return age;
  } 

  public void setAge(int myAge){
    // 提供接口设置私有属性age
    if(myAge > 0 && myAge <= 150){
      age = myAge;
    }else{
      System.out.println("年龄智能是1~150, 如果不是这范围，请你回火星。。");
    }
  }
  public void speak(){
    System.out.println("I'm " + name + "," + age + " years old");
  }

}

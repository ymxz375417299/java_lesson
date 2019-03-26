
public class Demo01 {

  public static void main(String[] args) {
    // 1. 基本数据类型转换
    int a = (int) 3.1422; // 把double转成int
    
    // 2. 多态中向上专项和乡下转型
    //
    // 向上转型（子类对象赋值给父类变量）
    Person p = new SupperMan(); // 等号右边的值本体是子类，赋值的变量p是父类，所以是向上转型

    // 向下转型
    // 强制类型转换 等号右边是栈变量p(Person p)是父类，左边的栈变量sm是子类，所以是向下转型
    SupperMan sm = (SupperMan) p; // 虽然栈变量p属于父类Person, 指向的堆真实身份是SupoperMan()子类，所以栈变量p是可以转成子类的
    sm.fly();


   // 注意：有问题写法 
   Person p1 = new Person(); // p1的真实身份 就是本类Person
   SupperMan sm2 = (SupperMan) p1; // 报错： 【(SupperMan) p1】：p1指向的堆区就是person父类类型的， 是无法转换成子类superman的 


  }

}


class Person{
  public void walk(){
    System.out.println("普通人走");
  }
}

class SupperMan extends Person{
  public void fly(){
    System.out.println("超人飞");
  }
}


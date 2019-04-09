
public class Demo01 {

  public static void main(String[] args) {
    // 构造犯法
      // 1. 构造方法作用: 给对象的数据（属性）进行初始化赋值
      // 2. 构造方法格式特点：
        // 方法名与类名有相同（大小也要与类名一致
        // 没有返回值类型，连void都没有
        // 没有具体的返回值return
      // 3. 构造方法分为【有参构造方法】 和【无参构造方法】两种

    // 以前实例化类，Person()其实就是启用了java默认构造方法，来初始化类，指数默认的初始化为null/0或false
    Person p1 = new Person();
    p1.name = "张小雷";
    p1.age = 50;
    p1.say();

    // 调用下面定义的无参构造方法
    Person p2 = new Person();
    p2.say();

    // 调用 有参构造方法
    Person p3 = new Person("贾跃亭", 30);
    p3.say();

  }

}


class Person{
  String name; 
  int age;

  public void say(){
    System.out.println("我是" + name + "今年" + age);
  }

  // 声明一个无参的构造方法
  public Person(){ // 不需要写返回类型 ，方法名和类名一致
    name = "张小雷";
    age = 50;
  
  }
  

  // 声明一个有参的构造方法
  public Person(String myName, int myAge){
    name = myName;
    age = myAge;
  
  }
}



public class Demo01 {

  public static void main(String[] args) {

    // 构造方法的重载：
    //
    // 是指方法名相同，与返回值类型无关（因为构造方法没有返回值）， 只参数列表的格式，类型
    //1. 第一种方式使用Person
    Person p1 = new Person();
    p1.name = "张飞";
    p1.age = 40;
    p1.gender = "男";
    p1.say();

    //2. 第二种方式使用Person, 【无/空参构造方法】
    Person p2 = new Person("貂蝉", 28);
    p2.say();

    // 3. 有参构造方法
    Person p3 = new Person("刘备", 50, "男");
    p3.say();




  }

}


class Person{
  String name;
  int age;
  String gender;

  public void say(){
    System.out.println(name + "," + gender + "," + age);
  }

  // 重载1
  // 无参构造方法
  public Person(){
    name = "吕布";
    age = 20;
    gender = "男";
  }

  // 重载2
  // 有参构造方法1
  public Person(String myName, int myAge){
    name = myName;
    age = myAge;

  }

  // 重载3
  // 有参构造方法2
  public Person(String myName, int myAge, String myGender){
    name = myName;
    age = myAge;
    gender = myGender; 
  }
}


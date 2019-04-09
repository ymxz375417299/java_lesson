
public class Demo01 {

  public static void main(String[] args) {

    Student stu = new Student("胡歌", 40);
    // 更改年龄
    stu.setAge(38);
    stu.say();
  }

}


class Student{
  String name;
  int age;


  public void say(){
    System.out.println(name + ":" + age);
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Student() {
  }

  public void setAge(int age){
    this.age =  age;
  }
}





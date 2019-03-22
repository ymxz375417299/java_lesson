
public class Demo01 {

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.name = "小花";
    cat.age = 2;
    System.out.println(cat.name); //获取属性的值（成员变量）
    System.out.println(cat.age); // 打印猫的年龄
    

    int a;
    // System.out.println(a); 没有初始化不能用
  }

  
}


class Cat{
  String name; // 猫名 成员变量（属性）
  String color; // 颜色 成员变量（属性）
  int age ;


  public void  catchMouse(){
    int a = 10; // 局部变量

  }
}



public class Demo01 {

  public static void main(String[] args) {

    // 成员变量和局部变量的注意事项
  // 局部变量名称可以和成员变量一样，在方法中使用的时候
  // 采用就近原则
    Duck duck = new Duck();
    duck.name = "小黑";
    duck.speak();

  }

}


class Duck{
  String name; // 成员变量
  public void speak(){
    String name = "小白"; // 和成员变量重复了。java会就近原则，先找局部变量（近）的变量
    System.out.println("我是一只唐老鸭， 我叫：" + name);
  }
}

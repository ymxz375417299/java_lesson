
public class Demo01 {

  public static void main(String[] args) {
    A a = new B();
    a.show(); // 输出：爱， 因为多态成员方法，运行看右边，具体看下面的步骤解析，执行的结果永远先找右边

    B b = new C();
    b.show(); // 输出：你，

  }

}


class A{
  public void show(){
    show2(); // 步骤2： 调用show2()方法，父类A和B都有show()方法，调用谁呢？ 因为多态中。调用成员方法永远看右边，即可B类，所以调用B的show2()方法，所以输出“爱”
  }

  public void show2(){
    System.out.println("我");
  }
}

class B extends A{
  public void show2(){
    System.out.println("爱");
  }
  // 1 .先找B类的show()方法 ，但是B没有show()方法，所以找父类A
}


class C extends B{
  public void show(){
    super.show();
  }

  public void show2(){
    System.out.println("你");
  } 
}


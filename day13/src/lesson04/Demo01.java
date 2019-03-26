
public class Demo01 {

  public static void main(String[] args) {
    // 类与类，类与接口，接口与接口的关系
    // 1. 类与类
    //    继承关系，智能单继承，可以多层继承
    // 2. 类与接口
    //    实现关系，可以单实现，也可以多实现
    //    并且还可以在继承一个类的同时实现多个接口
    // 3. 接口与接口
    //    继承关系，可以单继承，也可以多继承

    A a = new A();
    a.say();
  }

}
//==============
    // 1. 类与类
    //    继承关系，智能单继承，可以多层继承
//==============


class GrandFather{}


class Father1 extends GrandFather{
}


class Father2 extends GrandFather{

}


// java 不支持多继承
class Son1 extends Father1{

}


// =================
//
    // 2. 类与接口
    //    实现关系，可以单实现，也可以多实现
    //    并且还可以在继承一个类的同时实现多个接口
// =====================

interface AInterface{
  public void test1();
  public void test2();
}

interface BInterface{
  public void test3();
  public void test4();
}

class B{
  public void say(){
    System.out.println("说。。。");
  }
}
// A继承了B, A又实现了2个接口
class A extends B implements AInterface, BInterface{ // java支持接口的多实现
  @Override
  public void test1(){
  
  }

  @Override
  public void test2(){
  
  }


  @Override
  public void test3(){
  
  }

  @Override
  public void test4(){
  
  }

}

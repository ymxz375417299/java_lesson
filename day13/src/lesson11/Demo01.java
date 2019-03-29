package lesson11;

import com.baidu.model.Cat;

public class Demo01 {
  public static void main (String[] args) {
    // 
    // # 用在类身上的 修饰符
    // - 权限修饰符： 默认修饰符，public
    // - 状态修饰符： final
    // - 抽象修饰符： abstract
    //
    //  最常用的的是：public
    //
    //1. 如果一个类如果不写任何的修饰符，代表这个类，只能在当前包被访问
    //2. 如果一个类写了public，代表这个类，任何人都能访问， public类就是共享的
    //3. 如果一个类声明了final，代表这个类没有子类，不能被继承
    //4. 如果一个类声明了abstract抽象，代表这个类不能new，只能由这子类来继承抽象并且要必须实现抽象类的定义的抽象方法
    //

    A a = new A();
  }

}


class A{

}

final class B {

}

abstract class C{
}

class D extends A{

}

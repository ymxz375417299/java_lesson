package lesson14;

import com.baidu.model.Student;

public class Demo01 {
  public static void main (String[] args) {
    //# 用在成员方法的修饰符
    //- 权限修饰符： private, 默认的， protected, public
    //- 状态修饰符： static, finnal
    //- 抽象修饰符: abstract
    //- 用的最多就是public
    //
    //
    //# 总结
    //1. 如果方法声明为private, 代表这个方法只能在当前的类中使用
    //2. 如果方法声明不写权限，则是**默认**的权限，打代表这个方法在同一个包可以被访问，其他包不能访问
      //``
      //例 void run(){}
      //```
    //3. 如果方法声明为protected,先放着，后面讲
    //4. 如果方法声明为public，代表任何地方都可以访问这个方法
    //5. 如果方法声明为static，代表静态方法，通过类名调用方法
    //6. 如果方法声明为final, 这个方法不能被重写/覆盖 override
    //7. 如果方法声明为abstarct， 这个方法需要被子类实现，自己不能实例化}`
    //
    Cat cat = new Cat();
    cat.eat();

    Student stu = new Student("xxx", 23);
    stu.run();



    


  }

}


class Cat{
  private void eat(){
    System.out.println("吃。。。");
  }

  public void test(){
    System.out.println("ces");
  }

}

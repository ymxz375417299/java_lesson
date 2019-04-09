package lesson15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo01 {
  public static void main(String[] args) {
    // ### 异常注意事项
    // 1. 子类重写父类方法时，子类的方法必须抛出相同的父类异常
    // 2. 如果被重写的方法没有异常抛出，那么子类的方法最好不要抛出异常
    // 3. 如果子类方法内有异常方法，那么子类只能try, 不能throws抛出给上级


  }
}

class AgeException{
}

class A {
  public void test() throws AgeException {
  }
}

class B extends A {
  @Override
  public void test() throws AgeException {
    // 3. 如果子类方法内有异常方法，那么子类只能try, 不能throws抛出给上级
    try{
      FileInputStream fis = new FileInputStream("a.txt");
    }catch(FileNotFoundException e){
      e.printStackTrace();
    }
  }
}


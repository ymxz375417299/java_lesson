package lesson16;

public class Demo01 {
  public static void main (String[] args) {
    //
    //### 如何使用异常
    //1. 原则： 如果自己能处理的问题，就用try-catch,如果自己不能解决的问题，就throws
    //2. try-catch和throws区别
    //- 后续程序需要继续运行就用try
    //- 后续程序不需要继续运行就throws
    //
    //3. 如果JDK没有提供对应的异常，需要自定义异常
    //
    //案例： 自定义一个登陆异常)
    

    // 后续程序需要继续运行，使用try..catch
    // try{
      // int a = 10 / 0;
      // System.out.println("a=" + a);
    // }catch(Exception e){
      // System.out.println("有异常");
    // }
    // System.out.println("...");


    //后续程序不需要继续运行throws
    Person p = new Person();
    p.setAge(10);
    p.say();
  }

}


class Person{
  private int age;

  public void setAge(int age) throws AgeException{
    if (age > 1 && age <= 150 ){
      this.age = age;
    }else{
      throw new AgeException("你来自火星");
    }

    System.out.println("aaaa"); // 拋出異常，則这行不会运行
  }

  public void say(){
    System.out.println("my age : " + age);
  }
}

class AgeException extends RuntimeException{

  public AgeException(String msg){
    super(msg);
  }
}

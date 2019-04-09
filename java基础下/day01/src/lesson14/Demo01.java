package lesson14;

public class Demo01 {
  public static void main (String[] args) { //throws AgeException{ // main抛出异常给上级
    //### 自定义异常
    //#### 为什么需要自动以异常
    //举例： 人的年龄
    //
    //#### 自定义异常
    //1. 继承自Exception
    //2. 继承RuntimeException
    
    Person p = new Person();
    p.setAge(180);
    p.say();
  }

}



class Person{
  private int age;
  /**
   *
   * age在1~150岁返回调用
   * 在方法内抛出异常
   * @param ge
   */

  public void setAge(int age) throws AgeException{
    if (age >= 1 && age <= 150){
      this.age = age;
    }else{
      throw new AgeException("你来自火星"); // 其实是调用AgeException有参构造犯法
    }
  }


  public void say(){
    System.out.println("我的年龄" + age);
  }


}


// class AgeException extends Exception{ // 编译异常
class AgeException extends RuntimeException{ // 运行时异常 
  // 有参构造方法
  public AgeException(String msg){
    super(msg);
  }

}

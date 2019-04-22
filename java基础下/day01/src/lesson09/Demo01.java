package lesson09;

public class Demo01 {
  public static void main (String[] args) { // throws Exception处理异常方式二： 抛出异常给上一级 如果这里抛出异常 throw Exception,则会给上一层解决（jvm虚拟机）直接打印到终端
    //### throws 的方式处理异常
    //#### 实现方法会
    //- 定义功能方法，需要把出现问题暴露出去让调用者去处理
    //- 那么久通过throws在方法上表示)
    
    /**
     * 自己处理异常
     * 1. try...catch处理单个或者多个异常
     * 2. try-catch-catch处理
     * 3. throws 抛出异常
     *   - 
     */
    
    Person p = new Person();
    // p.setAge(-10); // 编译时报错

    // 处理异常方式一： 自己try--catch处理
    try{
      p.setAge(-10);
    }catch(Exception e){
      e.printStackTrace(); //  打印异常信息
    }

    p.say();
  }

}



class Person {
  private int age;

  public int getAge() {

    return age;
  }

  public void setAge(int age) throws Exception { // 遇到异常，则抛出异常,给上一级（调用泽使用）
    // 年龄要1~150岁之内
    if (age >= 1 && age <= 150){
      this.age = age;
    }else{
      // System.out.println("你是来自火星");
      throw new Exception("你来自火星"); // 注意thow没有s, 实例化一个异常类，并设置异常信息
                                        // 注意，这里的异常是编译时异常，上面 就不允许设置超过1~150的范围

      
    }
  }


  public void say(){
    System.out.println("我今年 " + age + "岁");
  }
}

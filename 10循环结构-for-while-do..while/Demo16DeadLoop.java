/*
* 永远停不下来的循环，叫做死循环
*/

public class Demo16DeadLoop{
  public static void main (String[] args) {
    // for(int i = 1; i <= 10;){ //忘记写i++
      // System.out.println("I love Java");
    // }
    while(true){
      System.out.println("I Love Java");
    }
    // 注意如果死循环没有设置推出条件，在外面还执行代码打印等操作，则会报错
    // System.out.println("I Love Java")
    
  }
}

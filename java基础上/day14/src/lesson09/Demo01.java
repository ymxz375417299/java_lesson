package lesson09;




// 接口
interface Inter{
  void show();
}


class Outer{
  // 补全代码
  // 静态方法
  // 写法一：
  // public static void A method(){
    ////直接返回A类型
    // return new A();
//
  // }

  // 写法2 ：方法的返回值类型是接口
  public static Inter method(){ // Inter 指的是返回值类型是接口类Inter
    return new Inter(){
      @Override
      public void show(){
        System.out.println("Hellow World");

      
      }
    
    };
  
  }

}

class A implements Inter{
  @Override
  public void show(){
    System.out.println("Hellow world");
  }

}



public class Demo01 {

  public static void main (String[] args) {
    Outer.method().show();
    
  }

}



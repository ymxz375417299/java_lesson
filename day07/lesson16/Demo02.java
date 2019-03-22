
public class Demo02 {

  public static void main(String[] args) {
    // 密名对象应用场景
    // 1. 调用方法，仅仅只调用一次的时候
    // 那么，这种匿名调用有什么好处？ 节省代码
    // 注意： 调用多次就不适合， 匿名对象调用完毕就是垃圾，可以被java回收
    // 2. 密名对象可以作为实际参数传递 
    
    // 有名对象的正常使用 
    Computer comp = new Computer();
    comp.brand = "ThinkPad S2";
    comp.runScore();
    // print(comp);


    // 匿名对象使用
    // 匿名对象的调用方法
    new Computer().runScore(); 
    // 匿名对象作为参数传参
    print(new Computer()); // 这里的参数就是匿名函数，因为没有给他变量名
    // 打印结果是null, 因为没有给这个对象进行属性赋值
  }

  // 传入电脑类，并打印电脑的品牌 
  public static void print(Computer comp){
    System.out.println(comp.brand);
  }

}


// 电脑属性
class Computer{
  String brand; // 品牌

  // 跑分
  public void runScore(){
    System.out.println(brand + "跑分是100000.。。");
    
  }
}


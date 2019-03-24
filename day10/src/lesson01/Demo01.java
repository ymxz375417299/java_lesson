
// 总结：
// 1. 静态方法里面不能访问非静态的成员变量和成员方法
// 2. 静态方法里面只能访问静态成员的变量和成员方法
// 3. 非静态方法里面可以访问静态成员的变量和成员方法
public class Demo01 {


  public static void main(String[] args) {

    // # static的注意事项
    // #
    // # ### static的可以用来修饰**属性**，也可以来修饰**方法**
    // # 案例： 用**类**来访问**静态方法**， 不用**对象**访问静态方法
    // #
    // # ### 在静态方法中没有==this==关键词
    // # ##### 如何理解？
    // #
    // # - 静态是随着类的加载而加载（即对象还没创建，就已经加载的方法区了），this是随着的对象的创建而存在
    // # -
    // # - 静态比对象先存在
    // #
    // # ### 静态方法只能访问静态的成员变量和静态的成员方法
    // # ### 非静态方法可以访问静态的成员变量和静态的成员方法
    // #
    // # 简单记： 静态只能访问静态
      System.out.println("包包包888888");

      //1. 给毛品种赋值
      //因为是静态属性，所以可以直接使用类名进行赋值
      Cat.variety = "波斯猫";
      
      //2. 给毛的名字同仁
      Cat cat = new Cat();
      cat.name = "小花";

      //3. 调用run非静态方法，需要对象来调用
      cat.run();

      //4. 调用slee方法 （静态方法, 不需要创建对象，直接用类ing调用）
      Cat.sleep();


      // 调用add方法，如果调用静态方法属于同一类，在同一类内。可以省略类名，直接输入方法
      System.out.println(add(10, 20));
      
  }
    public static int add(int a, int b){
      return a + b;
    }

}

class Cat{
  String name; //非静态属性，猫的名字
  //静态属性
  static String variety;// 品种

  //对象方法，非静态方法
  public void run(){
    // 3. 非静态方法可以访问静态的成员变量和静态的成员方法
    System.out.println(name + ":" + variety + "跑~~~~~");
  }

  // 静态方法
  public static void sleep(){
    // 2. 静态方法没有this,
    // 不能使用this访问成员变量的, 因为静态方法会比对象先创建，并保存到方法区，而this,是指向创建出来的某一对象的内存地址。 
    // 所以静态方法没有this
    // System.out.println(this.name + "睡觉");  //不能用this.name
    
    //3. 静态方法只能访问静态的成员变量
    // System.out.prinln(name + "睡觉")
    System.out.println(variety + "睡觉");  //不能访问name，因为name不是静态的，创建对象的时候才会有name.

    // 静态方法只能访问静态的成员方法
    // run(); //静态方法内不能访问非静态方法run
    test1(); //可以访问静态方法，本来调用静态方法是需要加类名的，如Cat.tesx();因为和test1()是同类下的静态方法,所以可以简化不用写类明

  
  }


  // 静态方法
  public static void test1(){
    System.out.println("xxxxxxxxx");
     
  }
}

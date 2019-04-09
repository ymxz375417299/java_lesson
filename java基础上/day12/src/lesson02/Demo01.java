
public class Demo01 {

  public static void main(String[] args) {
    /* 多态中的成员访问特点
     * 成员方法： 编译看左边（父类）， 运行看右边（子类）
     */

    // 父类引用指向子类对象[左边是父类， 右边是子类]
    // 成员方法： 编译看左边（父类）即可ide开发工具，在写代码过程时，是看左边的。如果注释的父类的方法，会报错， 运行看右边（子类）
    Father son = new Son();
    son.eat();
    //如果注销掉子类的eat()方法会出错吗？
    //不会，因为编译看左边（父类）， 运行看右边， 而注销的是子类，不是父类，所以编译不会出错，
    //在运行的时候，会先找子类的eat（）f方法，但是没有（注销）， 就会找父类的eat运行
    //所以。运行结果是【吃海鲜】

  }

}


class Father{
  int num = 10;


  public void eat(){
    System.out.println("吃海鲜。。");
  }
}


class Son extends Father{
  int num = 20;

  public void eat(){
    System.out.println("吃野味..");
  }
}

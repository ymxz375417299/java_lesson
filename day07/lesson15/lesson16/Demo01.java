
public class Demo01 {

  public static void main(String[] args) {
    // 匿名对象
    // 什么是匿名对象： 没有给新创建的的UI想存储在一个变量里

    GirlFriend gf = new GirlFriend();
    gf.name = "仓老师";
    gf.hometown = "日本东京";
    gf.height = 1.68 ;
    gf.say();

    // 直接打印一个对象， 结果是lesson16.GirlFriend@15dxxxxx【格式： 包名.类名 @地址】
    System.out.println(gf);

    // new GirlFriend(); // 匿名对象
    System.out.print(new GirlFriend());

  }

}


class GirlFriend{
  String name;
  String hometown;// 家乡
  double height; // 身高

  public void say(){
    System.out.println("我是" + name + "家乡：" + hometown);
  }


}


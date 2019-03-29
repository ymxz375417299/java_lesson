
public class Demo01 {

  public static void main(String[] args) {
    //# 某女星和某干爹的例子讲解
    //案例是帮助大家更好的理解
    //1. 类与类 为什么只能单继承
    //2. 类与接口可以多实现
    //
    Liuyifei lyf = new Liuyifei();
    lyf.drive();
    lyf.dongchegnxijiu();
    lyf.fanghua();

  }

}


class Father{
  public void drive(){
    System.out.println("开着三轮车...");
  }
}


// 接口1
interface Zhangyimou{
  public void dongchegnxijiu();
}

// 接口2
interface fengxiaogang{
  public void fanghua();
}


class Liuyifei extends Father implements Zhangyimou, fengxiaogang{
  @Override
  public void dongchegnxijiu(){
    System.out.println("恭喜， 给你演东成西就电影");
  }

  @Override
  public void fanghua(){
    System.out.println("演芳华的电影");
  }


  

}

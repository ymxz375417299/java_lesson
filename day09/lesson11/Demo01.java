
public class Demo01 {

  public static void main(String[] args) {
    // 练习一：长方形【rectangle】类需求
    // 定义一个长方形类，定义求周长和面积的方法
    // 然后定义一个测试类进行测试

    Rectangle rect = new Rectangle(10, 20);
    System.out.println("面积:" + rect.getArea());
    System.out.println("周长" + rect.getLength());

  }

}

//长方形类 [单位： 米]
class Rectangle{
  private int width;
  private int height;

  // 无参构造
  public Rectangle(){}
  // 有参构造
  public Rectangle(int width, int height){
    this.width = width;
    this.height = height;
  }


  // 周长
  public int getLength(){
    return 2*(width + height);
  }

  // 面积
  public int getArea(){
    return width * height;
  }

}


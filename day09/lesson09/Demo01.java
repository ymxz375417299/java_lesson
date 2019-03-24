
public class Demo01 {

  public static void main(String[] args) {
    // 练习：
        // 模仿上面学生的栗子，。写个手机类
        // 成员属性：品牌、价格【属性一般是私有的，目的保证数据安全】
        // 构造方法： 有参，无参【构造方法的格式， public 无返回类型，类同名】
        // 成员属性的set/get方法
        // 成员方法：show 显示所有属性信息

    Phone p1 = new Phone("iphone XRS", 10999);
    p1.show();
    System.out.println("苹果降价啦~~~降价");
    p1.setPrice(9999);
    p1.show();


  }

}

class Phone{
  private String brand;
  private double price;

  //  无参的构造方法
  //  一般无参的构造方法不会干任何事情，空置就行
  public Phone(){}

  // 有参的构造方法
  public Phone(String brand, double price){
    this.brand = brand;
    this.price = price;
  }

  // brand的set/get方法
  // set
  public void setBrand(String brand){
    this.brand = brand;
  }
  // get
  public String getBrand(){
    return brand; // 一般不写this
  } 

  // price的set/get方法
  // set
  public void setPrice(double price){
    this.price = price;
  }
  //get
  public double getPrice(){
    return price;
  }

  public void show(){
    System.out.println("品牌：" + brand + " 价格：" + price);
  }


}

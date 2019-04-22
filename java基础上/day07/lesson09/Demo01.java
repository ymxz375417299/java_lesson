
public class Demo01 {

  public static void main(String[] args) {
    // 案例2： 
    // 手机类的定义
    // 属性： 品牌（brand) 价格(price)
    // 行为： 打电话(call)
    // 发信息（sendMessage)
    // 玩游戏： （playGame)
    
    // 使用手机类
    // 1. 实例化对象
    Phone phone = new Phone();

    // 2. 给属性赋值
    phone.brand = "iphone x";
    phone.price = 6888.00;
    phone.color = "黑色";
    phone.size = 5.9;
    phone.isIntellligent = true;

    // 3. 调用方法
    // 格式： 实例化的对象.方法
    phone.call();
    phone.playGame();


  }

}


class Phone{
  String brand; //品牌
  double price; // 价格
  String color; // 颜色
  double size; // 尺寸

  boolean isIntellligent; // 是否智能手机，true表示智能手机

  public void call(){
    System.out.println("用" + brand + "手机打电话");
  }

  public void playGame(){
    System.out.println("用" + brand 
        + "手机玩跳一跳的游戏...");
  }

}


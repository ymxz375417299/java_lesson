
public class Demo01 {

  public static void main(String[] args) {

    Duck duck = new Duck("小黑");
    duck.setName("小白");
    duck.speak();
  }

}


class Duck{
  private String name;

  // 无参构造
  public Duck(){}

  public Duck(String name){
    this.name = name;
  }

  public void speak(){
    System.out.println(name + "gua~ gua~");
  }

  public void setName(String name){
    this.name = name;
  }
}


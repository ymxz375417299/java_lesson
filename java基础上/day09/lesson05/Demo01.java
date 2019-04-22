
public class Demo01 {

  public static void main(String[] args) {
    // # 构造方法的注意事项
    // # 1. 如果我们没有给出构造方法，系统会自动提供一个无参构造方法。
    // # 2. 如果我们给出了构造方法，系统将不再提供默认的无参构造方法（自定义的无参方法会覆盖系统提供的构造方法）
    // # 3. 如果我们声明的有参的构造方法，这个时候，如果我们还想使用无参构造方法，就必须自己给出，建议永远自己给无参构造方法
    // # 4. 正确构造方法的书写格式【public 类名（）】
    
    GirldFriend gf1 = new GirldFriend();
    gf1.say();


    GirldFriend gf2 = new GirldFriend("林志玲", "台湾");
    gf2.say();
  }

}


class GirldFriend{
  String name;
  String hometown; //老家

  public void say(){
    System.out.println("我是" + name + "，来自" + hometown);
  }

  public GirldFriend(String myName, String myHometown){
    name = myName;
    hometown = myHometown;
  }

  public GirldFriend(){
    name = "Luo qi";
    hometown = "guaanglin";
  }

}


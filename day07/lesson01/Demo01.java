
public class Demo01 {

  public static void main(String[] args) {
    //思考题Java中参数传参问题
    //1. 基本数据类型的值传递，不改变原值， 因为调用后就会跳栈， 局部变量随之消失
    int a = 528;
    System.out.println("改变前a的值：" + a);
    change(a);
    System.out.println("改变后a的值：" + a);
    // 结果是都是输出528

  }

  public static void change(int a){
    a = 1688;
  }

}


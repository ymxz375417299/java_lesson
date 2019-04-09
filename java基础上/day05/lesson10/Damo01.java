
public class Damo01 {

  public static void main(String[] args) {
    //方法使用的注意事项
    //1. 方法定义的时候参数之间用逗号隔开
    //2. 方法调用的时候不用再传递数据类型
    //3. 如果方法有明确的返回值int，一定要return 带一个值，不能return空
    //4. 方法不调用是不执行的
    //5. 方法与方法是平级关系。不能嵌套定义

  }

  public static int add(int a , int b){
    System.out.println("add 执行了。。。");
    int sum = a + b;

    return sum;
  }

}


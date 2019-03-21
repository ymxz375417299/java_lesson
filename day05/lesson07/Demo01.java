
public class Demo01 {

  public static void main(String[] args) {
    //return的作用
    //1. 返回
    //2. 其他它的作用不是结束循环，而是结束方法
    //3. 也就是return后面的代码不执行
    for (int i = 1; i <= 10; i++){
      if(i>3){
        return;
      }
      System.out.println("小鲁出轨了。。" + i );
    }
    // reak是跳出for循环，for循环后面的代码还是会执行的
    System.out.println("奶 原谅了！！、、、");

  }

}


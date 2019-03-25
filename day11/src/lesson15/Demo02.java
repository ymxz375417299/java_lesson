
public class Demo02 {

  public static void main(String[] args) {
    //### 修饰变量规则
    //1. final 修饰变量教做常量，一般会与public static 公用
    // 提高性能，因为之前常量
    //2. 常量命名规范， 如果一个单词，所有字母大写，如果是多个字母，每个单词都大写，中间用下划线隔开， 如public static final MAX_AGE = 125;

    //  问题； 我每次访问常量都要new出堆空间，来调用，性能降低！ 所以使用public static 让常量存在方法区内。直接使用[类名.常量名] 调用
    // Circle circle = new Circle();
    // circle.pi = 4.15;
    System.out.println(Circle.PI); 

  }

}


// 园
class Circle{
  public static final double PI = 3.14; // 变量
  public static final int MAX_VALUE = 100; // 最大值

  
}

package lesson07;

import com.gyf.model.Student;
import java.util.ArrayList;
import java.util.List;

/**
 * ### 掌握 1. 如果集合添加基本类型，内部会提升为包装类型 - int - > Integer - double -> Double 2. List list = new
 * ArrayList(); 这样声明一个集合对象，默认可以添加任何类型的元素 3. 如果在声明集合时，不添加泛型，就会有安全隐患（类型转换异常）
 * 因为不声明泛型，则什么数据类型都能放进集合，这样就会有（类型转换需求时，类型不同而报错）的隐患
 */
public class Demo01 {
  public static void main(String[] args) {
    // # 泛型概念和基本使用
    // ### 泛型概述（Generic)
    // 泛型的作用： 把类型的明确的工作提前到创建类型或者调用方法的时候
    // 泛型是一种参数化类型，把类型当做参数一样的传递来明确集合的元素类型
    //
    //
    //
    // ### 泛型的好处
    // 1. 提高安全性（将运行期的错误转换到编译器）
    // 2. 省去强转的麻烦
    //
    //
    // ### 泛型的基本使用
    // - 声明集合泛型的格式 List<Student> list = new ArrayList<Student>();
    // - <>中放的必须是引用数据类型

    // 声明一个泛型集合
    List<String> list = new ArrayList<String>();
    list.add("Gosling");
    list.add("rock");
    list.add("jummiy");
    // list.add(1688); // 前面泛型指定了String类型，不能加int,编译期就报错。这样更安全，本来是运行时才会报错转换成编译器报错
    System.out.println(list);


    // 遍历
    for(int i = 0; i < list.size(); i++){
      String str = list.get(i);  // 省去类型强转的麻烦
      System.out.println(str);
    }
  }

  public static void test1() {
    // 如果在声明集合的时候，不添加泛型会有安全隐患
    List list = new ArrayList(); // 会报错

    // 往集合添加多个不同类型的对象
    list.add("GOSling"); // String类型
    list.add(new Student("tony", 33)); // Student类型
    list.add(12); // Integer 如果是int会自动装箱,把基本数据类型int包装成Integer类型

    // 打印
    System.out.println(list);

    System.out.println("============");

    // 遍历
    for (int i = 0; i < list.size(); i++) {
      Object obj = list.get(i);

      // 把Object转成String
      String str = (String) obj; // 会报错！因为元素是多种类型的，不是String强制转换就会报错。这就是安全隐患
      System.out.println(obj);
    }
  }
}

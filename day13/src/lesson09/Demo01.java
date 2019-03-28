package lesson09;
import com.baidu.model.Student;
public class Demo01 {

  public static void main(String[] args) {}
    //# import 关键字的概述
    //### import 关键字是用来导入类的【默认情况下，是不可以跨包访问另一个类的】
    //### import 使用的两种方式
    //1. import com.baidu.model.Student 只到一个类
    //2. import com.baidu.model.* 导入包的所有类，不建议使用这种方法
    //
    //### 创建类的另一种方式，在类名前加包名
    //com.baidu.model.Student stu = new com.baidu.model.Student();
    //java.util.Scanner s = new Java.util.Scanner(System.in)
    //
    //### 包的类能被其他包访问，一定是public的类，public修饰的类代表其他包可以访问此类))
    Student stu = new Stuedent("小五", 18);
}

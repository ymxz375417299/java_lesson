package lesson09;

import java.util.Scanner;

// import com.baidu.model.Student;

public class Demo02 {
  public static void main(String[] args){
    // ### 3. 创建类的另一种方式，在类名前加包名 // 主要是用来区分同名类，
    // com.baidu.model.Student stu = new com.baidu.model.Student();
    // java.util.Scanner s = new Java.util.Scanner(System.in)
    com.baidu.model.Student stu = new com.baidu.model.Student("小胡", 30);
    stu.say();
    Scanner scanner = new Scanner(System.in);
  
  }

}


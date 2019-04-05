package lesson18;

import java.util.ArrayList;
import java.util.List;

import com.gyf.model.Student;

public class Demo01 {
  public static void main (String[] args) {
    //### 案例演示： 集合嵌套值List嵌套List
    //
    //案例雪球
    //1. 一个板的n学生是一个集合
    //2. 一个学校n办也是一个集合
    //3. 如何将这些数据用一格集合来表示)
    


    // 1. 用两个集合来表示两个级别
    List<Student> java1 = new ArrayList<Student>();
    java1.add(new Student("小刘", 20));
    java1.add(new Student("校长", 21));
    java1.add(new Student("喂喂", 21));

    List<Student> java2 = new ArrayList<Student>();
    java1.add(new Student("li ", 20));
    java1.add(new Student("zhang ", 21));
    java1.add(new Student("li moumou", 21));


    // 2. 用集合来表示学校School
    // 那泛型要怎么写，来泛指上面的装Student的集合（嵌套）
    // 其实不管java1, java2的类型都是List<Student> ，写进泛型即可
    List<List<Student>> school = new ArrayList<List<Student>>();
    school.add(java1);
    school.add(java2);


    // 3. 嵌套的遍历
    // 3.1 遍历班级
    for (List<Student> stus : school){
      for(Student stu: stus){
        System.out.println(stu);
      }
    
    }


  }

}


package lesson10;

import com.gyf.model.Student;

public class Demo01 {
  public static void main(String[] args) {
    // 需求： 我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组， 获取每个学生的信息

    // 1. 创建5个学生对象
    Student stu1 = new Student("mayun", 50);
    Student stu2 = new Student("马化腾", 11);
    Student stu3 = new Student("李彦宏", 29);
    Student stu4 = new Student("刘强东", 49);
    Student stu5 = new Student("丁磊", 60);

    // 2. 把学生对象存数组
    // int[] arr = new int[5];// 基本数据类型的数组
    Student[] stus = new Student[5]; // 对象数组：由对象组成的数组为对象数组
    stus[0] = stu1;
    stus[1] = stu2;
    stus[2] = stu3;
    stus[3] = stu4;
    stus[4] = stu5;

    // 3. 遍历数组
    for (int i = 0; i < stus.length; i++) {
      // 取元素
      Student stu = stus[i];
    // 4. 打印学生信息
      System.out.println(stu);
    }


  }
}

package lesson05;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Demo01 {
  public static void main(String[] args) {
    // # 键盘录入学生信息，按照总分排序后输出在控制台

    /**
     * 1. 创建学生类 - 三个学科（语文，数学， 英语）成绩属性 
     * 2. 把n个学生添加到TreeSet中 
     * 3.Treese要进行总分排序 
     * 4.键盘输入学生信息 格式：【名字, 89, 98,68】 
     * 5. 当键盘输入quit，代表学生成绩录入完毕
     */

    // 1. 创建集合
    Set<Student> set = new TreeSet<Student>();

    // 2. 添加元素
    // 2.1 创建Scanner
    Scanner scanner = new Scanner(System.in);

    // 2.2 录入 学生成绩
    System.out.println("请录入学生成绩，录入格式【名字，88，98.68】");
    System.out.println("如果录入完毕，请输入quit退出");
    while (true) {
      // 2.3 获取录入学生成绩信息
      String info = scanner.nextLine();
      System.out.println("Info: " + info);
      // 2.4 判断是否录入完毕
      if (info.equals("quit")) {
        break;
      }

      // 2.5 解析获取的输入信息angle, 89, 98, 68
      // 把有固定格式的字符串解析成数组
      String[] infos = info.split(",");
      String name = infos[0];
      String chineseStr = infos[1];
      String mathStr = infos[2];
      String englishStr = infos[3];

      // 把内容封装成学生对象
      Student stu =
          new Student(
              name,
              Integer.parseInt(chineseStr), // 把字符串转数组
              Integer.parseInt(mathStr),
              Integer.parseInt(englishStr));
      // 把学生放到Set集合中
      set.add(stu);
    }
    // set.add(new Student("rock", 10, 20, 30));
    // set.add(new Student("apple", 10, 20, 31));
    // set.add(new Student("angle", 10, 20, 32));
    // set.add(new Student("Test", 10, 20, 33));
    // set.add(new Student("Test", 9, 21, 33));

    // 遍历
    for (Student stu : set) {
      System.out.println(stu);
    }
  }
}

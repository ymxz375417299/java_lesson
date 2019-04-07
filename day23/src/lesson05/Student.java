package lesson05;

public class Student implements Comparable<Student> {
     // * - 三个学科（语文，数学， 英语）成绩属性

  private String name;
  private int chinese;
  private int math;
  private int english;

  private int totalScore; 



  /**
   * @param name 学生名字chinese + math + english;
   * @param chinest 语文成绩
   * @param math 数学成绩
   * @param enghlis 英语成绩
   */
  public Student(String name, int chinese, int math, int english) {
    this.name = name;
    this.chinese = chinese;
    this.math = math;
    this.english = english;

    // 在构造方法中，就计算总分
    this.totalScore = chinese + math + english;
  }

  @Override
  public String toString() {
    return "Student{" +
      "名字 = " + name +
      ", 语文 = " + chinese +
      ", 数学 = " + math +
      ", 英语 = " + english +
      ", 总分 = " + totalScore +
      "}";
  }

  // 重写自然排序方法
  @Override
  public int compareTo(Student o){
    int num = o.totalScore - this.totalScore;
    // 总分一样，总分相同, 按照学生名字排序
    num = num == 0 ? this.name.compareTo(o.name) : num;
    return num;
  }

}


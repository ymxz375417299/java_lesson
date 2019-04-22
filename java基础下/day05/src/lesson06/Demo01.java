package lesson06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo01 {

  public static void main (String[] args) throws IOException ,ClassNotFoundException{
    
    // save();

    // 取学生对象
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.data"));
    Student stu = (Student) ois.readObject(); // 反序列化并强转Student类型
    System.out.println("反序列化成功");
    System.out.println(stu);

  }

  /**
   * 存学生对象（序列号）
   */
  public static void save() throws IOException{
    // 1. 创建学数学对象
    Student stu = new Student("霍建华");

    // 2. 把学生存入文件
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.data"));

    // 3. 序列号学生对象 
    // 存的学生版本号是1
    oos.writeObject(stu);

    System.out.println("写入成功");

    // 关闭流
    oos.close();
  

  }
}

class Student implements Serializable{

  /**
   * 序列号版本ID
   */ 
  private static final long serialVersionUID = 2L; // 设置版本号为1
  private String name;


  public Student(String name){
    super();
    this.name = name;
  }



  @Override
  public String toString() {
    return "Student{" +
      "name = " + name +
      "}";
  }

}

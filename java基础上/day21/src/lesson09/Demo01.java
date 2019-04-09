package lesson09;

import java.util.ArrayList;
import java.util.List;

import com.gyf.model.Student;
import com.gyf.model.Employee;

public class Demo01 {
  public static void main(String[] args) {
    // # 泛型接口
    // ### 泛型接口概述
    // 把泛型定义再接口上
    //
    // 如，List接口就是泛型接口
    //
    // ### 定义格式
    // public interface  接口名 <泛型类型>
    //
    //
    // ### 使用的敞口Dao(数据访问层)

    // 创建泛型集合
    List<String> list = new ArrayList<String>();

    //使用Dao
    StudentDao stuDao = new StudentDao();
    List<Student> stuList = stuDao.findList();
    System.out.println("stuList:" + stuList);


    EmployeeDao empDao = new EmployeeDao();
    List<Employee> empList = empDao.findList();
    System.out.println("empList" + empList);

  }
}

// 获取学生信息
class StudentDao{
  /**
   * 从数据库获取学生信息
   */
  public List<Student> findList(){
    List<Student> list = new ArrayList<Student>();
    list.add(new Student("小王", 20));
    list.add(new Student("小李", 20));

    return list;
  }
}

// 获取员工信息K
class EmployeeDao{
  /**
   * 从数据库获取员工信息
   */

  public List<Employee> findList(){
    List<Employee> list = new ArrayList<Employee>();
    list.add(new Employee("员工1", 20));
    list.add(new Employee("员工2", 22));
    return list;
  }
}

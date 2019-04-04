
package lesson10;

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
    // List<String> list = new ArrayList<String>();

    //使用Dao

    DaoInterface<Student> stuDao = new StudentDao();
    System.out.println(stuDao);
    DaoInterface<Employee> empDao = new EmployeeDao();
    System.out.println(empDao);

  }
}

// 发现Do操作数据库，不同表的操作方法一样

/**
 * 数据访问层的接口
 * 1. 接口一般都定义方法，而很少操作属性，而数据库操作，也是基本步操作属性，只操作方法，和接口一样
 */

interface DaoInterface<T>{ // 定义泛型饥饿扩
  public List<T> findList(); //List<T> 返回List集合，而且是泛型的
  public T findByName(String name); //T 实例对象时，泛型指定什么类型就返回什么类型
  public void update(T t);// T t ，实例化对象时，泛型指定什么类型，就传入什么类型给update方法

}


// 泛型接口的实现类
class StudentDao implements DaoInterface<Student>{
  @Override
  public List<Student> findList(){
    List<Student> list = new ArrayList<Student>();
    list.add(new Student("xiao wang", 20));
    list.add(new Student("xiao li ", 35));
    return list;
  }

}

class EmployeeDao implements DaoInterface<Employee>{
  @Override
  public List<Employee> findList(){
    List<Employee> list = new ArrayList<Employee>();
    list.add(new Employee("员工1", 20));
    list.add(new Employee("员工2", 24));
    return list;
  }
}

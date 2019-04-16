package lesson07;

import java.lang.reflect.Constructor;
import com.gyf.model.Teacher;

public class Demo01 {

  public static void main (String[] args) throws Exception{
    // 通过反射获取带参数构造方法并使用
    /**
     * 反射作用：
     * 通过.class字节码文件获取类的方法和属性
     * 使用要点：
     *    1 如果要使用反射，先要获取字节码对象
     *    2 通过字节码对象的getConstructor() 可以获取构造方法对象 Constructor类
     *      - 不传参数，则获取有参构造方法
     *      - 传参数，则获取相应的参数的构造方法(注意： 传入的是构造方法的类型是字节文件，如String.class)
     *        注意，不许有对应的构造方法，否则报错
     *    3 构造方法对象(Constructor)，有个newInstance方法创建字节码对象
     *    4 反射是在java.lang.reflect包里面的 Constructor类
     *    5 反射的作用一般是用于写框架的！（ssh, ssm)
     *        - ssh (struts spring hibernate)
     *        - ssm (sprint sprintmvc mybatis)
     *
     * 1 获取构造方法
     *
     */
    
    // 1. 获取字节码对象
    Class clz = Teacher.class; // 通过Object的静态属性户籍去

    // 2. 获取构造方法
    // 2.1 无参构造方法
    Constructor c1 = clz.getConstructor(); // 获取无参构造方法 // 需要抛异常

    // 2.2 通过构造方法创建对象
    /** 为什么要强转成Teacher
     * 因为java编译的时候并不知道cl.newInstance 返回的类型，所以不强转会编译异常
     */
    Teacher teacher1 = (Teacher) c1.newInstance(); // newInstance创建对象， 并强转成Teacher
    
    System.out.println("teacher1： " + teacher1);

    // 2.3 获取有参构造方法
    Constructor c2 = clz.getConstructor(String.class, String.class); // 根据方法属性的构造方法
    Teacher teacher2 = (Teacher) c2.newInstance("gyf", "梅州"); // 相当于调用new Teacher("gyf", "梅州") 调用有参构造方法
    System.out.println("teacher2 " + teacher2);

    Constructor c3 =  clz.getConstructor(String.class, double.class);
    Teacher teacher3 = (Teacher) c3.newInstance("rock", 1.77);
    System.out.println("teacher3: " + teacher3);
  }
}


package lesson09;

import com.gyf.model.Teacher;
import java.lang.reflect.Method;


public class Demo01 {

  public static void main (String[] args) throws Exception {
    // 通过反射获取方法并使用
    /**
     * 1 反射中通过Method类描述方法
     * 复习一下，反射获取【构造方法：Constuctor, 字段属性，Field】
     * 2 通过Class的getMethod可以获取一个方法 ,返回Method类型
     * 3 使用invoke(obje, param1, params2); 调用反射方法
     * 4 通过getDeclaredMethod可以获取私有方法
     * 5 如果要调用私有方法，设置访问权限.setAccessible(true)
     */

    // 1. 获取字节码对象
    Class clz = Teacher.class;

    // 实例化Teacher对象
    Teacher teacher = new Teacher();
    // teacher.say1();
    // teacher.say2("rock" );
    // teacher.say3("rock", 30);

    // 2. 通过反射调用方法
    // 2.1 获取公有无参方法
    Method m1 = clz.getMethod("say1");

    // 2.2. 获取公有有参方法
    Method m2 = clz.getMethod("say2", String.class);
    Method m3 = clz.getMethod("say3", String.class, int.class);

    // 3.2 调用方法
    m1.invoke(teacher); // 传入调用的对象
    m2.invoke(teacher, "小猪");
    m3.invoke(teacher, "小狗", 30);

    // 3.3 获取私有方法
    Method m4 = clz.getDeclaredMethod("say4", String.class); // 获取私有方法
    // 设置访问权限
    m4.setAccessible(true);
    // 调用
    m4.invoke(teacher, "私有rock");
  }
}


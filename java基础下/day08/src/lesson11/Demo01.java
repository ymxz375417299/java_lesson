package lesson11;

import java.lang.reflect.Field;
import com.gyf.model.Teacher;

/** 
 * 掌握抽取方法的思想
 */

public class Demo01 {
  public static void main (String[] args) throws Exception{
    
    // 练习：写一个通用的方法，来设置对象的属性值
    Teacher teacher = new Teacher();
    Tool.setFieldValue(teacher, "name", "rock 抽取方法了");
    Tool.setFieldValue(teacher, "hometown", "rock 抽取方法了");
    Tool.setFieldValue(teacher, "height", 1.87);
    System.out.println(teacher);


  }

  /** 问题：
   * 当使用反射多个属性，就非常麻烦，抽取个方法来简化代码
   * 代码在， Tool.java
   */
  public static void test() throws Exception{
    // 练习：写一个通用的方法，来设置对象的属性值

    // 通过反射给私有属性赋值
    Teacher teacher = new Teacher();

    // 1. 获取字节码对象
    Class clz = teacher.getClass();

    // 2. 获取属性Field
    Field field1 = clz.getDeclaredField("name");
    Field field2 = clz.getDeclaredField("hometown");
    Field field3 = clz.getDeclaredField("height");

    // 3. 设置权限
    field1.setAccessible(true);
    field2.setAccessible(true);
    field3.setAccessible(true);

    // 4. 赋值属性
    field1.set(teacher, "rock");
    field2.set(teacher, "guangzhou");
    field3.set(teacher, 1.77);

    System.out.println(teacher);
  }

}


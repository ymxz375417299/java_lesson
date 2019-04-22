package lesson08;

import java.lang.reflect.Field;

import com.gyf.model.Teacher;

public class Demo01 {

  public static void main (String[] args) throws Exception{
    
    //通过反射获取成员变量（属性）并使用

    /**
     * Field类
     * 1 Class.getFeld(String) 方法可以获取雷电指定字段（可见）
     * 2 如果是私有的，可以用getDeclaredField("name")方法获取
     * 3 通过set(obj, "李四") 方法可以设置指定对象上该变量的值
     * 4 如果是私有属性（变量） 需要先调用setAccessible(true)设置访问权限
     * 5 如果获取的指定的字段调用get(obj)可以获取指定对象中该字段（变量）的值 ，返回类型为Object
     */

    // 1. 获取字节码对象
    Class clz = Teacher.class;

    // 2. 获取成员变量Name
    // 注意： 不能访问私有变量
    Field colorField = clz.getField("color"); // 返回Field对象
    System.out.println(colorField);

    // 3. 通过反射给字段赋值
    // 先创建个对象
    Teacher teacher = new Teacher();
    // teacher.color = "白色";
    colorField.set(teacher, "红色"); // 使用set,传入要赋值的对象，和值

    // 4. 获取私有name属性
    Field nameField = clz.getDeclaredField("name");
    System.out.println(nameField);
    
    // 5. 通过反射给私有属性赋值
    // 平时是不能给私有属性赋值的！ 通过反射可以实现

    nameField.setAccessible(true); // 设置私有属性允许访问
    nameField.set(teacher, "rock");

    System.out.println("=============");
    System.out.println(teacher);

    
    // 6. 通过反射获取属性的值
    // .get(对象), 返回Object
    Object value = nameField.get(teacher);
    System.out.println(value);


  }
}


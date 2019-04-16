package lesson10;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {
  public static void main(String[] args) throws Exception{
    // 练习： 通过反射越过泛型检查

    List<Integer> list = new ArrayList<Integer>();
    list.add(110);
    list.add(111);
    list.add(112);
    list.add(113);
    // list.add("gyf"); //报错 ，泛指了Integer类型

    // 2. 通过反射往集合添加字符串
    // 2.1 获取字节码对象
    Class clz = list.getClass(); // 这里使用了对象的.getClass();

    // 2.1 通过反射获取方法
    Method method = clz.getMethod("add", Object.class); // 因为List add (E e); 中的E就是泛型，而泛型代表任意对象，所以直接传Object.class字节码对象


    // 2.3 调用方法
    method.invoke(list, "gyf"); // 传入上面创建的List对象，并因为method的反射的参数是Object,所以本来泛型只允许Integer，这里也可以传String了

    System.out.println(list);
    
  }
}

package lesson13;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
  public static void main (String[] args) {
    //
    //# 集合的遍历之集合转数组遍历
    //
    //### 集合的遍历
    //其实就是依次获取集合中的每一个元素
    //
    //### 案例演示
    //- 把集合转成数组，可以实现集合的遍历
    //- toArray() 【掌握collection 的toArray()方法】

    // 1. 创建集合对象
    Collection coll = new ArrayList();

    // 2. 添加元素
    coll.add("apple");
    coll.add("banana");
    coll.add(1);
    
    // 3. 集合的遍历（先把集合转成数组再遍历)
    // String s = "b";
    // Object o = s; // object可以存任何类型
    
    Object [] objs = coll.toArray(); // 因为所有的类都是object的子类。所以可以用Object父类指向子类的**多态**形式，这样可以存任何类型的数据
    for (int i = 0; i < objs.length; i++){
      Object o = objs[i]; // 多态
      System.out.println(o.getClass()); // 打印当前的类
    
    }
    
  }

}


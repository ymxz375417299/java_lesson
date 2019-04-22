package lesson03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo01 {
  public static void main (String[] args) {
    //### List集合特有功能概述和测试
    //### 查看LIst文档
    //### List集合的特有功能概述
    //1. void add(int index, e element)
    //2. E remove(int index)
    //3. E get(int index)
    //4. E set(int index, E element)

    // Collection的创建
    Collection col1 = new ArrayList();

    // List的创建，和Collection都是接口，list是Collection的子接口
    List list = new ArrayList();
    list.add("Java");
    list.add("PHP");
    list.add("GO");
    list.add("H5");

    System.out.println(list);


    // add 指定的位置插入元素
    list.add(1, "Python");

    System.out.println(list);

    // remove 删除指定索引的元素
    // list.remove("Java"); //这个是不指定索引，和之前用法一样
    list.remove(1);
    System.out.println(list);


    // get 获取指定索引的元素
    System.out.println(list.get(1));


    // set 替换指定索引的元素
    list.set(1, "c++");
    System.out.println(list);





    
  }

}


package lesson14;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
  public static void main (String[] args) {
    //
    //### Collection集合的带All功能测试
    //- boolean addAll(Collection c)  // 
    //- boolean removeAll(Collection c)
    //- boolean containsAll(Collection c)
    //- boolean retainAll(Collection c)) // 取两个集合的交际,并把交集存在第一个集合中

 }

    //- boolean addAll(Collection c)  //  把后面的集合添加到前面的集合中
  public static void test1(){
    //返回值boolean 改成成功返回true, 其实这个返回值很少用
    //- boolean addAll(Collection c)
    // 第一个集合
    Collection col1 = new ArrayList();
    col1.add("a");
    col1.add("b");
    col1.add("c");
    System.out.println("col1" + col1);

    // 第二个集合
    Collection col2 = new ArrayList();
    col2.add("d");
    col2.add("e"); 
    System.out.println("col2" + col2);

    // 集合相加 【把集合2 的所有元素添加到集合1内】
    boolean b1 = col1.addAll(col2);
    System.out.println(b1);
    System.out.println(col1);


  }
    
    //- boolean removeAll(Collection c) 即集合2有所的元素，在集合1比那里，如果集合有1，则删除，没有则跳过
  public static void test2(){
    // 第一个集合
    Collection col1 = new ArrayList();
    col1.add("a");
    col1.add("b");
    col1.add("c");
    System.out.println("col1" + col1);

    // 第二个集合
    Collection col2 = new ArrayList();
    col2.add("c");
    col2.add("e"); 
    System.out.println("col2" + col2);

    // 集合相加 【把集合2 的所有元素】
    // 即集合2有所的元素，在集合1比那里，如果集合有1，则删除，没有则跳过
    boolean b1 = col1.removeAll(col2);
    System.out.println(b1);
    System.out.println(col1);
  
  }


    //- boolean containsAll(Collection c)
  public static void test3(){
    // 判断集合中在另一个集合是否都包含，如果是则返回ture
    // 第一个集合
    Collection col1 = new ArrayList();
    col1.add("a");
    col1.add("b");
    col1.add("c");
    System.out.println("col1" + col1);

    // 第二个集合
    Collection col2 = new ArrayList();
    col2.add("e");
    col2.add("c"); 
    System.out.println("col2" + col2);

    // 集合包含判断
    // 即集合2所有的元素，是否都在集合1中，如果是返回true
    boolean b1 = col1.containsAll(col2);
    System.out.println(b1);
    System.out.println(col1);
    
  
  }


    //- boolean retainAll(Collection c)) // 取两个集合的交际,并把交集存在第一个集合中
  public static void test4(){

    // 第一个集合
    Collection col1 = new ArrayList();
    col1.add("a");
    col1.add("b");
    col1.add("c");
    System.out.println("col1" + col1);

    // 第二个集合
    Collection col2 = new ArrayList();
    col2.add("b");
    col2.add("c"); 
    col2.add("e");
    System.out.println("col2" + col2);

    // 集合取交际
    // 取两个集合的交际,并把交集存在第一个集合中
    boolean b1 = col1.retainAll(col2);
    System.out.println(b1);
    System.out.println(col1);
  
  }
}




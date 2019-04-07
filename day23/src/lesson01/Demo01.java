package lesson01;

import java.util.Comparator;
import java.util.Set;

import java.util.TreeSet;

/**
 * TreeSet的排序方式有2中，
 * 1. 自然顺序（Compareable)
 * 2. 比较器顺序（Conparator) 
 * 如果元素的类型是final。不能被重写，如基本数据类型,则选择比较器排序方式
 * 3. 如果希望有相同的元素存在，再compareTo或者compare方法，返回1就行了
       ? 既然要让重复的也存在，我为什么不直接用List集合？ 因为List没有排序
 */

public class Demo01 {
  public static void main (String[] args) {
    //TreeSet可以用于排序
    //1. 存Integer.或者String，这两个已经实现了Comparable接口
    //2. 如果是存自定义对象，比如Strudent,那这个学生要自己实现Comparable接口
  
    
    // 默认升序，如果想升序，就要重写Integer的CompareTo方法，课时Integer是finnal类型的，是不能有子类的
    // 这是，Tress的比较器排序comparator就是解决这个问题
    // Set<Integer> set = new TreeSet<Integer>(); // 无参的构造方法
    Set<Integer> set = new TreeSet<Integer>(new MyComparator()); //传入自己写的的比较器,TreeSet则会根据定义的比较器规则进行排序
    set.add(23);
    set.add(3);
    set.add(13);
    set.add(8);

    // 遍历
    for(int num : set){
      System.out.println(num);
    }
    
    
  }

}


// 写一个比较器
// 需要实现Comparator的接口
class MyComparator implements Comparator<Integer>{
  @Override
  public int compare(Integer o1, Integer o2){
    // System.out.println("o1" + o1);
    // System.out.println("o2" + o2);
    return o2 - o1;
  }

}




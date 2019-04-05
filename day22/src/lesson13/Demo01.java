package lesson13;

import java.util.Set;

import java.util.TreeSet;

import com.gyf.model.Person;

public class Demo01 {
  public static void main (String[] args) {
    //
    //按年龄由小到大进行排序
    //思路： 修改类内的compareTo的方法
    //
    
    Set<Person> set = new TreeSet<Person>();
    set.add(new Person("刘能", 10));
    set.add(new Person("赵四", 10));
    set.add(new Person("小沈阳", 10));
    set.add(new Person("鸭蛋", 10));

    // 遍历
    for(Person p : set){
    }
  }

}


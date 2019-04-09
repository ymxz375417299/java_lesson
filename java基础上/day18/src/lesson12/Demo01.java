package lesson12;

import java.util.Collection;
import java.util.ArrayList;
public class Demo01 {
  public static void main (String[] args) {

    // Collection集合的基本功能
    // 创建一个集合对象
    Collection coll = new ArrayList(); // 接口指向实现类【多态】


    // 添加元素
    coll.add("Java"); // 编译会警告不安全，先不用管， 等学了泛型就懂了
    coll.add("php");
    coll.add("python");
    // 输出[java, php, ptyhon] 理论上不是这个格式。应该输出内存地址，说明默认修改了toString的类
    System.out.println(coll);

    // 移除元素
    coll.remove("php");
    coll.remove("python");
    System.out.println(coll);

    // 清除所有元素
    // coll.clear();
    System.out.println(coll);

    // 判断元素是否包含
    System.out.println(coll.contains("Java"));

    // 判断集合是否为空
    // coll.clear();
    System.out.println(coll.isEmpty());


    // 查看集合有几个元素
    System.out.println(coll.size());
    
  }

}


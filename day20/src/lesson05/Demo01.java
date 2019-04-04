package lesson05;

import java.util.LinkedList;

public class Demo01 {

  public static void main (String[] args) {
    // 用LinkedList模拟内存栈区（数据） 结构
    // 栈的特点： 先进后出
    //
    // 思路：
    // 栈（类）
    // 方法： 
    // - 进栈
    // - 出栈
    //
    

    // 实例化栈对象
    Stack stack = new Stack();

    // 进栈
    stack.in("a");
    stack.in("b");
    stack.in("c");
    stack.in("d");
    stack.in("e");

    // 打印 栈的数据
    System.out.println("stack" + stack.list);


    // 出栈
    Object obj = stack.out();
    System.out.println("出栈的元素是：" + obj);
    System.out.println("list: " + stack.list);

    // 出栈2
    obj = stack.out();
    System.out.println("出栈的元素是：" + obj);
    System.out.println("list: " + stack.list);

  }

}


class Stack{ 
  //创建集合
  LinkedList list = new LinkedList();

  // 进栈
  // Object代表任何类都能添加k
  public void in(Object obj){
    // 添加元素
    list.addFirst(obj);
  }

  // 出栈
  // 需要返回类型，而且进的时候是什么类型，出的时候就什么类型
  public Object out(){
    return list.removeFirst();
  }

}

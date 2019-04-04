package lesson06;

import java.util.LinkedList;

public class Demo01 {
  public static void main (String[] args) {
    // LinKedList其实已经提供了栈的功能

    // 1. 创建栈对象
    LinkedList stack = new LinkedList();

    // 2. 进栈
    stack.push("a");
    stack.push("b");
    stack.push("c");
    stack.push("d");
    stack.push("e");
    stack.push("f");

    System.out.println("栈：" + stack);
    
    // 3. 出栈
    // 出栈的时候，会把出栈的元素返回
    Object obj = stack.pop();
    System.out.println("出栈元素：" + obj);
    System.out.println("栈：" + stack);



  }

}


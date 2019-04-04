package lesson03;

import java.util.LinkedList;

public class Demo01 {

  public static void main (String[] args) {
    //
    //# LinkedList的使用
    //### LinkedList类概述
    //查看JDK文档
    //
    //### 方法
    //1.  public void addFirst(E e) 以及addLast(E e)
    //2.  public E getFirst()及getLast()
    //3.  public E removeFirst() 以及public E removeLast();
    //4.  public E get(int index)


    // 创建对象
    LinkedList list = new LinkedList();


    // 2. 把元素放在第一个位置
    list.addFirst("a");
    list.addFirst("b");
    list.addFirst("c");
    list.addFirst("d");

    // 3.把元素放在最后的位置
    list.addLast("e");
    list.addLast("f");
    System.out.println("list:" + list);


    // 4. 删除第一个元素
    list.removeFirst();
    list.removeFirst();
    System.out.println("list:" + list);

    // 5. 删除最后的元素
    list.removeLast();
    list.removeLast();
    System.out.println("list:" + list);

    // 6. 获取第一个元素
    System.out.println(list.getFirst());

    // 7. 获取最后一个元素
    System.out.println(list.getLast());

    // 8. 根据索引获取元素
    System.out.println(list.get(1));


  }
}


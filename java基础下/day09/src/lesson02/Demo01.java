package lesson02;

public class Demo01 {

  public static void main(String[] args) {
    // ### 什么是适配器
    // 1. 在前面GUI使用监听的时候，需要定义一个类事件监听器接口
    // 2. 通常接口中有多个方法，而程序不一定所有的都用到，但又必须重写，这很繁琐。
    // 3. 适配器简化了这些操作，我们定义监听器时，值要继承适配器，然后重写需要的方法即可
    // 4.
    // ### 适配器原理
    // 1. 适配器就是一个类，实现了监听器饥饿扩，所有抽象类都重写了，但是方法全是空
    // 2. 适配器类需要定义成抽象的，因为创建该类对象，调用空方法是没有意义的
    // 3. 目的就是为了简化程序员的操作，定义监听器的时继承适配器，值重写需要的方法就可以了)

    // 1. 创建按钮对象
    Button btn = new Button();

    // btn.addMouseListener(); //
    // 问题来了。addMouseListener,要传入接口，而MouseListner鼠标监听接口定义的方法，必须全部重写，而这些定义的的方法，我们不会全部都用
    // 适配器设计模式可以解决

    // 给按钮对象添加监听器，而传入的对象不是直接传入MouseListner接口，而是实现了这个接口的适配器
    // 需要使用什么方法，就重写哪个就行，就不用全部重写
    btn.addMouseListener(new MouseAdapter(){
      @Override
      public void onClick(){
        System.out.println("点击了。。。");
      }
    });
  }
}

// 鼠标监听接口
interface MouseListner {
  public void onClick(); // 点击

  public void doubleClick(); // 双击

  public void rightClick(); // 右击
}

// 鼠标监听接口的实现类
class Button {
  // 给Button的类添加鼠标监听器的方法
  // 传入的鼠标监听的接口类型
  //    - 实现了接口的类
  //    - 接口的匿名内部类
  public void addMouseListener(MouseListner m) {
    m.onClick();
  }
}



// 适配器
// - 定义抽象类 MouseAdapter 鼠标适配器
// - 实现了 鼠标监听器接口
// - 而适配器重写的方法都是空实现
abstract class MouseAdapter implements MouseListner{
  public void onClick(){
  }
  public void doubleClick(){
  }
  public void rightClick(){
  }
}

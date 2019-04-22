package lesson01;

import java.awt.Button;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo01 {
  public static void main(String[] args){
    // 创建一个窗口并显示
    // 1. 创建窗口
    Frame window = new Frame("我是一个窗口");

    // 2. 设置窗口的 带下
    window.setSize(400, 400);

    // 3. 设置显示位置(左上角为0,0）
    window.setLocation(200, 200);

    // 4. 设置程序图标
    window.setIconImage(Toolkit.getDefaultToolkit().createImage("qq.png")); // 

    // 5. 监听窗口x按钮
    window.addWindowListener(new WindowAdapter(){ //WondowAdapter 是窗口的监听适配器类
      @Override
      public void windowClosing(WindowEvent e){ //WindowEvent 窗口事件对象
        // 释放资源
        System.gc();

        // 退出程序
        System.exit(0);
      }
      
    }); // WindowAdapter是一个抽象类, 适配器，重写窗口的方法

    // 6. 添加按钮
    // 6.1 创建按钮1
    Button btn1 = new Button("close");
    // 6.2 添加到窗口
    window.add(btn1);

    // 6.1 创建按钮2
    Button btn2 = new Button("mouse");
    // 6.2 添加到窗口
    window.add(btn2); // 因为同一个位置，所以覆盖了按钮1的位置

    // 7. 设置组件布局方法 [流布局]
    window.setLayout(new FlowLayout()); // 设置好布局后，按钮就不会被覆盖。从左到右排序

    // 8. 监听按钮的点击
    // 8.1 给按钮添加 监听点击时间
    btn1.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){ // ActionEvent点击事件对象
        System.out.println("点击...");
        // 关闭程序
        System.exit(0);
      }
    });

    // 9. 监听鼠标时间
    btn2.addMouseListener(new MouseAdapter(){ // MouseAdapter鼠标监听器适配器类
      // 鼠标按下的事件方法
      @Override
      public void mousePressed(MouseEvent e){
        System.out.println("鼠标按下...");
      }

      @Override 
      public void mouseReleased(MouseEvent e){ // MouseEvent 鼠标事件对象
        System.out.println("鼠标松开了。。。");
      }
    });


    // 10. 键盘监听
    Button btn3 = new Button("keyboard"); // 创建一个按钮对象
    window.add(btn3); // 添加按钮到窗口
    // 10.1 添加键盘监听时间
    btn3.addKeyListener(new KeyAdapter(){ // KeyAdapter键盘监听器适配器的类
      // KeyEvent 是键盘事件对象
      @Override
      public void keyReleased(KeyEvent e){
        System.out.println(e.getKeyCode() + " : " + e.getKeyChar()); // e.getKeyCode() 字符的编码表 
                                                                      // e.getKeyChar()获取键盘的输入字符
      }
      
    });

    /// 显示窗口
    window.setVisible(true);
  }

}


package lesson05;

public class Demo01 {

  public static void main (String[] args) throws ClassNotFoundException{
    
    /**
     * ![image](56C449AC10E84641A8AF863DD3DD7CE4)
     *
     * ## 反射概述
     * ### 反射概述
     * 1 Java反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
     * 2 对于任意一个对象，都能通过反射能够用它的任意一个方法和属性；
     * 3 这个动态获取的信息以及动态调用对象的方法的功能称为Java语言的反射机制。
     * 4 要想解剖一个类，必须先要获取到该类的字节码文件的对象
     * 5 而解剖使用的就是Class类的方法，所以先要获取到每一个字节码文件对应的Class类型对象
     *
     *
     * ### 三种方式
     * 1 Object类的getClass() 方法，判断两个对象是否同一个字节码文件
     * 2 静态属性class。锁对象
     * 3 Class类中静态方法forName(), 读取配置文件
     *
     *
     * ### 案例演示
     * - 获取class文件对象的三种方式
     */

    // 获取class文件对象的三种方式
    // 方式一 Object类的getClass()方法
    Person p = new Person();
    Class clz1 = p.getClass(); // 获取Person的字节码对象

    // 方式二 静态属性class
    Class clz2 = Person.class;

    // 方式三 Class类有一个静态方法forName()
    /**
     * 参数：
     * forName(Satring className) 传类的全路径(包名 + 类名)
     */
    Class clz3 = Class.forName("lesson05.Person");

    System.out.println(clz1);
    System.out.println(clz2);
    System.out.println(clz3);

    // 4. 字节码对象在内存中只有一个
    /** 如何判断？
     * 查看一下内存地址就行了。.hashCode(); 获取逻辑内存值
     */
    System.out.println(clz1.hashCode());
    System.out.println(clz2.hashCode());
    System.out.println(clz3.hashCode());
    


      
  }
}


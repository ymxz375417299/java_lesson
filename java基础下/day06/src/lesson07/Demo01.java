package lesson07;

public class Demo01 {

  public static void main (String[] args) {
    /**
     * # 07.获取线程名字和设置名字(掌握)讲解
     * 1. 通过Thread的getName()方法获取线程对象的名字
     * 2. 
     * ### 1. 获取主线程对象
     * 1. 通过getName()方法获取线程对象名称
     * 2. 
     *
     * ### 设置名字
     * 1. 通过构造函数可以传入String类型名字
     * 2. 通过setName(String)方法可以设置线程对象的名字
     *
     * ### 每个线程系统都会默认分配个名字
     */
    
    // 1. 获取主线程对象 .getName();
    Thread mainThread = Thread.currentThread();
    System.out.println();
    System.out.println("主线程对象：" + mainThread.getName());

    // 2. 设置线程名称
    mainThread.setName("主线程");
    System.out.println(mainThread);

    // 3. 通过构造方法设置子线程名称
    MyThread myThread = new MyThread("rock子线程1");
    myThread.start();
  }
}

class MyThread extends Thread{
  // 写一个构造方法，接受线程名称 调用父类的构造方法
  public MyThread(String name){
    super(name);
  }
  @Override
  public void run(){
    System.out.println("银行代发工资业务...【" + Thread.currentThread().getName() + "】");
  }
}

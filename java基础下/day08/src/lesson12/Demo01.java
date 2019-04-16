package lesson12;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo01 {

  public static void main (String[] args) {
    /**
     * ### 动态代理的概述和实现
     * 代理： 本来应该自己做的事情，请别人来做，被请的人就是代理对象
     *
     * 例子： 春节回家买票让人代买
     *
     * 在Java中**java.lang.reflect包**下提供了一个**Proxy类**和一个**InvocationHandler接口**，通过使用这个类和接口就可以生成动态代理对象。
     *
     * ### JDK提供的代理只能**针对接口做代理**
     * 我们有更强大的代理cglib
     *
     * - Proxy 类中的方法创建动态代理类对象
     *   - Proxy 通过newProxyInstance(ClassLoad loader, Class<?>[] interfaces, InvocationHandler h) 创建代理对象
     *   - InvocationHandler的invoke(Object proxy, Method method, Object[] args)方法会拦截方法的调用
     */

    // 1. 创建对象
    UserServiceImpl usi = new UserServiceImpl();
    // usi.registerUser();
    // usi.deleteUser();

    /**
     * 问题: 
     * 在注册，删除，更新用户数据时，我们都需要进行对操作的用户进行依次校验，
     * 如果在每个方法都写一份校验的功能，则又非常不灵活，维护难度提高，
     * 这时，我们可以使用代理，进行对需要校验的方法进行拦截，进行一系列校验操作
     */

    // 2. 创建代理对象
    // newProxyInstance(ClassLoad loader, Class<?>[] interfaces, InvocationHandler h) 创建代理对象
    // 参数：
    // 1 类加载器对象
    // 2 类的范式数组捷库 固定写法， obj.getClass().getInterfaces();
    // 3 InvocationHandler 调用处理对象。是一个接口，所以直接new 内部类即可
    /** 如何获取一个类的类加载对象
     * 1. 先获取类的字节码
     * 2. 获取类加载对象
     * obj.getClass().getClassLoader()
     */
    UserService proxy = (UserService) Proxy.newProxyInstance(usi.getClass().getClassLoader(), usi.getClass().getInterfaces(),  new InvocationHandler(){
      @Override 
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        // method就是被拦截方法的反射method对象
        System.out.println(method);
        System.out.println("权限校验");
        // 拦截了方法
        // 使用method对象的调用方法。invoke
        Object returnObj = method.invoke(usi, args); // Object对象接受调用方法后的返回值，并返回出去
        System.out.println("日志记录");
        return returnObj; // 返回

      }
    });


    // 通过代理对象来调用方法
    // 但是不会理解执行，会先被InvocationHandler()拦截
    proxy.registerUser();
    proxy.deleteUser();
    
  }
}


// 用户服务接口
interface UserService{
  public void registerUser();
  public void deleteUser();
  public void updateUser();
}


// 用户的实现类

class UserServiceImpl implements UserService{
  @Override
  public void registerUser(){
    // System.out.println("权限校验...");

    System.out.println("成功注册一个用户");

    // System.out.println("日志记录...");
  }

  @Override
  public void deleteUser(){
    // System.out.println("权限校验...");
    System.out.println("成功删除一个用户");
    // System.out.println("日志记录...");
  }

  @Override
  public void updateUser(){
    // System.out.println("权限校验...");
    System.out.println("更新一个用户数据");
    // System.out.println("日志记录...");
  }
}

package lesson06;

import com.gyf.model.Student;

/**
 * 掌握：
 * 如何声明一个泛型类和方法
 * 1. 声明一个泛型方法
 * class Tool <T>
 * 2. 声明一个泛型方法（无返回， 有泛型参数）
 * public void print(T tl)
 * 3. 声明一个泛型方法（有返回值，无参数）
 * public T get(int index);
 * 4. 声明一个泛型属性
 * private T o;
 * public T get(){
 *  return o;
 * }
 *
 * public void set(T o){
 *  this.o = o;
 * }
 */
public class Demo01 {
  public static void main (String[] args) {
    //06.声明一个有返回值的泛型方法和泛型属性讲解

    // 1. 创建对象
    Tool<String> tool1 = new Tool<String>();

    // 2. 使用方法
    tool1.print("ab");
    
    // 设置泛型属性
    tool1.setO("Gosling");
    // 获取泛型属性
    System.out.println(tool1.getO());

    // 泛型，传Student类型
    Tool<Student> tool2 = new Tool<Student>();
    tool2.get(1);
    tool1.get(1); // 发现不同对象，泛指的类型不同。get()的返回值，也会根据实例对象传入的泛型不同而不同

    
  }

}



class Tool<T>{
  // 声明泛型方法
  // 这个方法没有参会之，参数是泛指
  public void print(T t){
    System.out.println(t);
  }

  // 声明泛型方法
  // 有返回值的
  //

  public T get(int index){ // 指定返回值为T的泛指类型，会根据实例化类传入的泛型参数不同，返回值也跟着不同
    return null;
  }

  // 泛型的属性，属性 名为o;
  private T o;
  public T getO(){
    return o;
  }
  public void setO(T o){
    this.o = o;
  }

}

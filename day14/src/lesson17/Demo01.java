package lesson17;

import com.baidu.model.Student;

public class Demo01 {
  public static void main (String[] args) {
    //# Object的hashCOde方法
    //- Object有一个方法poublic int hashCode()
    //- 方法返回对象的**哈希码值** ，默认情况下改方法会根据对象的地址来计算
    //- 不同的对象的hashCode()一般来说不会相同，但是同一个对象的hashcode值肯定相同
    //- hashCode不是对象的**实际地址值**， 可以理解为逻辑地址值

    Student stu1 = new Student();
    Student stu2 = new Student();
    Student stu3 = stu1;
    System.out.println("stu1：" + stu1.hashCode() );
    System.out.println("stu2：" + stu2.hashCode() );
    System.out.println("stu3：" + stu3.hashCode() ); // stu1一样，说明指向同一个内存地址.

  }

}


package lesson01;

import com.gyf.model.Student;
public class Demo01 {

  public static void main (String[] args) {
    
    /**
     * # Object类的tuString方法
     * ### 1. toString方法返回此对象的字符串表示
     * ### 2. 包名.类名+@+Integer.toHexString(d.hashCode())
     * ### 3. toString方法默认发挥的字符没啥用
     * ### 4. 打印对象，默认吗就是调用toString方法
     * ### 5. 此方法一般用于自定义字符串输出
     */
    Student stu = new Student("小王", "中国");
    Student stu2 = new Student();
    System.out.println(stu);
    System.out.println(stu.toString());
    System.out.println(stu2.toString());
    // 输出一样。com.gyf.model.Student@2a139a55
    // 2a139a55是由对象的hsshcode的值转成16进制的表示
    System.out.println("st hashcode:" + stu.hashCode());
    System.out.println("上面的hashcode的16表示" + Integer.toHexString(stu.hashCode()));
    // 输出结果就是上面toString的16进制结果 2a139a55

  }
}


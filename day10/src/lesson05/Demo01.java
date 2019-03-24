
public class Demo01 {

  public static void main(String[] args) {
    /* JAVA 的注释大致分为三块【面试题】
     * 1. 行注释（单行注释） 就是一行的最前端写上//
     * 2. 块注释（多行注释） 就是在注释代码块中前后加上“\/*...*\/” 快捷键 ctrl + shif + / 取消注释 ctrl +shif + \
     * 3. 文档注释 一般用于或者类上“**\/\/** 在结尾加上*\/\/*"

    */
    Student stu = new Student();
    System.out.println(stu.add(10, 20));

  }

}


class Student{

  // 以下是文档注释
  /**
   *@param a int 数字
   *@param b int 数字
   *@return 返回a+b 的值
   */

   public int add(int a, int b){
    return a + b;
   }

}

package lesson08;

import java.util.Calendar;
public class Demo01 {
  public static void main (String[] args) {
    //calendar类的add() 和set() 方法使用
    // test();

    Calendar calendar = Calendar.getInstance();

    // set设置日历为2016年3月9日
    calendar.set(2016, 2, 9);

    // 获取年
    System.out.println(calendar.get(Calendar.YEAR));

    // 获取月
    System.out.println(calendar.get(Calendar.MONTH));




  }

  public static void test(){

    //calendar类的add() 和set() 方法使用
    //1. 创建对象
    // 比较特殊。通过calendar.getInstance来返回子类（公历）
    // Calendar calendar = new GregorianCalendar(); /// 不用这样创建
    Calendar calendar = Calendar.getInstance(); // 多态

    // add　方法，给字段加值
    calendar.add(Calendar.YEAR, -1); //给当前的年2019， -1 减一

    calendar.add(Calendar.MONTH, +1);


    // 获取年
    System.out.println(calendar.get(Calendar.YEAR));

    // 获取月
    System.out.println(calendar.get(Calendar.MONTH));
    
  }

}


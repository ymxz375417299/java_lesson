package lesson09;

import java.util.Calendar;
public class Demo01 {
  public static void main (String[] args) {
    // 练习： 如何获取任意娘是平年还是闰年？？

    int year = 2020;


    // 实例化日历对象
    Calendar calendar = Calendar.getInstance();

    // 设置日历为2016年3月1好
    calendar.set(year, 2, 1);
    // 在日期的字段减1
    calendar.add(Calendar.DAY_OF_MONTH, -1);

    // 求2月份有几天？
    int day = calendar.get(Calendar.DAY_OF_MONTH);

    if (day == 29){
      System.out.println("闰年");
    }else{
      System.out.println("平年");
    }
    
  }

}


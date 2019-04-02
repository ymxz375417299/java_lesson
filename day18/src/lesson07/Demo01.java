package lesson07;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Demo01 {

  public static void main (String[] args) {
    //# calendar类的概述和获取日期的方法
    //### Calendar类的概述
    //calendar类是一个**抽象类 本身不能实例化** 必须使用它的子类来实例化，它为特定瞬间与一组诸如 YEAR , MONTH, DAY_OR_MONTH, HOUR等日历字段之间的转换提供了一些方法，并为操作日历字段（例如获取下星期的日期）提供了一些方法
    //
    //### 成员方法
    //public static Calendar getInstance()
    //public int get(int field)
    //
    //### 注意
    //- 获取月份时0： 1月， 1： 2月， 2： 3月，以此类推
    //- 获取星期时1，周日，2,： 周一，。。。。。7：周日
    //- 
  

    // 1. Calendar 是一个抽象日历类
    Calendar calendar = Calendar.getInstance(); //因为会返回一个公历对象，即左边是父类，右边是子类，是多态用法
    System.out.println(calendar);

    // 公历(Calendar的子类）
    // 不过不new来创建公历对象，而是使用Calendat抽象类的一个方法，Canlendar.getInstance 会返回这个公历对象
    GregorianCalendar gc ;

    // 2. 获取年
    System.out.println(calendar.get(Calendar.YEAR));
    // 3. 获取月
    System.out.println(calendar.get(Calendar.MONTH)); // 月是从0开始，需要+1
    // 4. 获取日
    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    // 5. 获取时
    System.out.println(calendar.get(Calendar.HOUR));;
    // 6. 获取分
    System.out.println(calendar.get(Calendar.MINUTE));
    // 7. 获取秒
    System.out.println(calendar.get(Calendar.SECOND));
    // 8. 获取轴
    System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 周几， 是从周日开始算1
    
  }
}


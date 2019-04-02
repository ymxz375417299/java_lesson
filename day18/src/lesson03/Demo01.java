package lesson03;

import java.util.Date;

  /**
   * 掌握
   * 1. 怎么获取当前时间，和当前时间的毫秒数
   * 2. 怎么把毫秒数转成“日期- 时分秒”
   */

public class Demo01 {
  public static void main (String[] args) {
    // # Date类的概述和方法使用
    // ### Date类的概述
    // 类 Date表示固定的时间，精确到毫秒
    //
    // ### 构造方法
    // - public Date()
    // - public Date(long date) // 传入long类型
    // - 
    //
    // ### 成员方法
    // - public long getTime()
    // - public void settime(long time)
    
    /**
     * 时间格式：
     * Fri Feb 02 09:39:02 CST 2018
     * 星期 月份 日 时间 时间去 年
     */


    // 1. 获取当前
    Date date = new Date();

    System.out.println(date);

    // 获取子1970年01月01日 00:00:00到现在走过的毫秒数
    // System.currentTimeMillis(); 获取的结果一样
    long time = date.getTime();  
    System.out.println("获取子1970年01月01日 00:00:00到现在走过的毫秒数" + time);
    // 
    long time = 1517535712590L; // 声明L类型
    
    // 把毫秒还原“日期-时分秒”
    // 第一种写法
    Date date = new Date(time);

    // 第二种写法
    Date date = new Date();
    date.setTime(time);

  }

}


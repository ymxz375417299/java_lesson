package lesson06;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Demo01 {
  public static void main (String[] args) throws ParseException{
    // 课堂案例： 计算自己来到这个世界多少天

    String birthday = "1990-01-10";
    String now = "2019-04-03";

    // 思路？ 计算两个时间的毫秒差
    // 1. 把前面的两个日期转成成Date类型
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date date1 = sdf.parse(birthday); // 必须派出异常
    Date date2 = sdf.parse(now);

    // 2. 计算毫秒查
    long delta = date2.getTime() - date1.getTime();

    // 3. 算天数
    long day = delta / 1000 / 60 / 60 / 24;
    System.out.println(day);



  }

}


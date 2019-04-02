package lesson05;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 掌握：
 * 如何将字符串转成Date类型，并掌握如何获取毫秒数(时间戳)
 */

public class Demo01 {
  public static void main (String[] args) throws ParseException{ // 抛出异常
    //SimpleDateFormat 的public Date parse(String source)

    String str = "2018年02月02日 10:24:21";

    // 1. 创建DateFormate对象
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

    // 2. 把字符串解析成Date对象
    Date date = sdf.parse(str);
    System.out.println(date);

    // 3. 获取毫秒数 使用date对象的getTime（）方法
    System.out.println("毫秒数" + date.getTime());




  }

}


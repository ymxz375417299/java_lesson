package lesson04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
  public static void main (String[] args) {
    //# SimpleDateFormat 类实现日期和字符串的互相转换
    //### DateFormat类的概述
    //DateFormat 是日期/时间格式化子类的抽象类， 用于格式化并解析日期和事件。 它是一个抽象类，不能直接实例化，只能使用它的子类**SimpleDateFormat**
    //
    //### SimpleDateFormate构造方法
    //- public SimpleDateFormat() 【这个构造方法基本不用】
    //- public SimpleDateFormat(String pattern) 【这个方法常用】
    //- 
    //
    //### 成员方法
    //public finnal String format(Date date)
    //public Date parse(String source)
    
    // 1. 获取当前日期时间
    Date date = new Date();
    System.out.println(date);

    // 2. 想把日期的显示格式转为“2019年04月02日”
    // 2.1 创建一个日期格式化对象
    /**
     * y: 表示年
     * M: 表示月
     * d: 表示日
     * HH: 大写的H表示24小时进制
     * hh: 小写的h表示12小时进制  后面加个a 表示上下午
     * a: 表示上下午
     * mm:表示分
     * ss: 表示秒
     * z: 表示时区
     * S: 表示毫秒
     */

    // SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss S");
    // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    // 多台写法
    // DateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss")

    // 2.2 把Date类型转成固定格式的字符串
    String str = sdf.format(date);
    System.out.println(str);


    
  
  }

}


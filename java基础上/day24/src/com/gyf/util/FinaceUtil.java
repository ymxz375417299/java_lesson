package com.gyf.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 金融工具类
 * @param borrowDate 借款日期
 * @param borrowMonth 贷款期数
 */
public class FinanceUtil {

  /**
   * 返回还款日期列表
   * 静态方法
   */
  public static List<String> replayDateList(Date borrowDate, int borrowMonth){
    // 还款日期计算
    List<String> list = new ArrayList<String>(); // 用来存储还款日期
    // 1. 借款日期
    // Date对象

    // 2. 借款期数（借几

    // 3. 计算未来12个月的还款日期
    // 3.1 把借款日期的年月日算出来,把Date类转字符串yyyy-MM-dd
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String str = sdf.format(borrowDate);
    // str = "2018-01-20";
    String[] strs = str.split("-"); // 分割
    int y = Integer.parseInt(strs[0]); // 年
    int m = Integer.parseInt(strs[1]); // 月
    int d = Integer.parseInt(strs[2]); // 日

    System.out.println(y);
    System.out.println(m);
    System.out.println(d);

    // 3.2 算未来还款日期
    for (int i = 0; i < borrowMonth; i++){
      // 算 2月份的最大天数
      // 用Calendar计算
      Calendar cal = Calendar.getInstance();

      // 设置还款日期年月日(根据上面解析的y m d年月日）
      // i = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11
      cal.set(y, m + i + 1 , 1); // m + i + 1 因为calendar月份从0开始

      //add 运算 天数-1
      cal.add(Calendar.DAY_OF_MONTH, -1); // 先通过calendar.DAY_OF_MONTH 获取刚设置的日期的天数， 然后 使用add 运行， - 1

      // 取出日历对象的年月份
      int cy = cal.get(Calendar.YEAR);
      int cm = cal.get(Calendar.MONTH) + 1;
      int cd = cal.get(Calendar.DAY_OF_MONTH); // 当月的天数
      // System.out.println(cy + "-" + cm + "-" + cd);

      // 还款日默认情况就是借款日
      int huanKuanRe = d;
      if (d > cd ){ // d: 借款日 借款日大于当月的最大天数 如借款日是31号，但是当月只有28天
        huanKuanRe = cd;
      }

      String huanKuanDate = cy + "-" + cm + "-" + huanKuanRe;
      list.add(huanKuanDate);

    }

    return list;

  }

}


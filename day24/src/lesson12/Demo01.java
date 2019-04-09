package lesson12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gyf.model.Repayment;
import com.gyf.util.FinanceUtil;

public class Demo01 {
  public static void main (String[] args) {
    
    // 等额本息计算（按月还款-按月算）
    // 等额本息（每月等额）还款计算：
    // 1. 等额本息每个月的换的本金一样，利息递减
    // 2. 公式： 本金 / 12 + 剩余本金 * 月利息（1%）
    //

    // 1. 借款进入
    double amount = 10000;

    // 2. 还款的期数
    int month = 12;

    // 3.计算每个月还款的本金
    double mPrincipal =  amount / month;

    // 借款日期
    Date borrowDate = new Date();

    // 借款月利息(1分2)
    double mRate = 0.012; 
    // 小数点保留2位
    String s = String.format("%.2f", mPrincipal); // 把double类型，保留2位，并返回字符串
    mPrincipal = Double.parseDouble(s); // 字符串转Double

    System.out.println("借款" + amount);
    System.out.println("借款期数：" + month + "月");
    System.out.println("每个月的平均本金：" + mPrincipal);
    System.out.println("借款日期" + borrowDate);
    System.out.println("借款月利息" + mRate);

    // 4 未来12个月还款数据
    List<String> dates = FinanceUtil.replayDateList(borrowDate, month);// 计算还款日期，返回还款日期列表List集合
    // 存储模型的集合
    List<Repayment> list = new ArrayList<Repayment>();
    for (int i = 0; i < month; i++){
      Repayment  rep = new Repayment();
      
      // 4.1 设置还款期数
      rep.setIndex(i+1);

      // 4.2 设置还款日期
      rep.setDate(dates.get(i));

      // 4.3 设置当月的本金
      if (i == month -1){
        // 最后一期本金
        double lastPrincipal = amount - (month-1) * mPrincipal;
        lastPrincipal = Double.parseDouble(String.format("%.2f", lastPrincipal));
        rep.setPrincipal(lastPrincipal);
      }else{
        rep.setPrincipal(mPrincipal);
      }

      // 4.4 设置利息
      /**
       * 公司： 利息： 剩余本金 *月利息（０.０１２）
       */
      double leftAmount = amount - i * mPrincipal; // 剩余本金 
      double interest = leftAmount  * mRate;
      interest = Double.parseDouble(String.format("%.2f", interest)); // 保留小数点2位
      rep.setInterest(interest);
      

      // 添加到集合
      list.add(rep);

    }

    // 5 遍历
    for (Repayment l : list){
      System.out.println(l);
    }


  }

}



